package uz.gita.quiz;

public class TestPresenter implements TestContract.Presenter {
    TestContract.Model model;
    TestContract.View view;
    private int start = MenuActivity.start;
    private int currentQuestion = start;
    private int selectVariant = -1;
    private int correctCount;
    private int count = 2;


    public TestPresenter(TestContract.Model model, TestContract.View view) {
        this.model = model;
        this.view = view;
        view.loadQuestion(model.getQuestion(currentQuestion), 0);
    }

    @Override
    public void clickNext() {
        if (currentQuestion == start + 7) {
            checkQuestion();
            view.showResult(correctCount);
            count = 2;
            return;
        }
        if (selectVariant != -1) {
            checkQuestion();
            currentQuestion++;
            Question data = model.getQuestion(currentQuestion);
            view.loadQuestion(data, currentQuestion);
            view.unSelectVariant(selectVariant);
            view.setScore(count++);
            selectVariant = -1;
        } else {
            view.showMessage("please, check any variant");
        }
    }

    @Override
    public void clickVariant(int index) {
        if (selectVariant != -1) {
            view.unSelectVariant(selectVariant);
        }
        view.selectVariant(index);
        selectVariant = index;
    }

    private void checkQuestion() {
        Question data = model.getQuestion(currentQuestion);
        String selected = "";
        if (selectVariant == 0) {
            selected = data.getAnswerA();
        } else if (selectVariant == 1) {
            selected = data.getAnswerB();
        } else if (selectVariant == 2) {
            selected = data.getAnswerC();
        } else if (selectVariant == 3) {
            selected = data.getAnswerD();
        }
        if (selected.equals(data.getCorrect())) {
            correctCount++;
        }
    }
}
