package uz.gita.quiz;

public interface TestContract {

    interface Model {
        Question getQuestion(int index);

        int getQuestionCount();
    }

    interface View {
        void loadQuestion(Question question, int num);

        void selectVariant(int index);

        void unSelectVariant(int index);

        void showMessage(String text);

        void showResult(int correctCount);

        void setScore(int score);

    }

    interface Presenter {
        void clickNext();

        void clickVariant(int index);
    }
}
