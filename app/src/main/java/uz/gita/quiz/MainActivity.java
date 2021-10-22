
package uz.gita.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements TestContract.View {

    ViewGroup[] items;
    TextView questionTxt;
    TextView number;
    TestContract.Presenter presenter;
    Chronometer chronometer;
    long stopTime = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        presenter = new TestPresenter(new TestRepository(), this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        chronometer.setBase(SystemClock.elapsedRealtime() + stopTime);
        chronometer.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        chronometer.stop();
        stopTime = chronometer.getBase() - SystemClock.elapsedRealtime();
    }

    private void loadData() {
        number = findViewById(R.id.number);
        questionTxt = findViewById(R.id.question);
        chronometer = findViewById(R.id.chronometer);
        findViewById(R.id.next).setOnClickListener(this::next);
        findViewById(R.id.stop).setOnClickListener(v -> finish());
        items = new ViewGroup[4];
        for (int i = 0; i < 4; i++) {
            int id = getResources().getIdentifier("btn" + (i + 1), "id", getPackageName());
            items[i] = findViewById(id);
            items[i].setOnClickListener(this::onClick);
            items[i].setTag(i);
        }
    }

    private void next(View view) {
        presenter.clickNext();
    }

    private void onClick(View view) {
        int index = (int) view.getTag();
        presenter.clickVariant(index);
    }


    private void setIcon(ViewGroup group, int id) {
        ImageView imageView = (ImageView) group.getChildAt(0);
        imageView.setImageResource(id);
    }

    private void setText(ViewGroup viewGroup, String text) {
        TextView textView = (TextView) viewGroup.getChildAt(1);
        textView.setText(text);
    }

    @Override
    public void loadQuestion(Question question, int num) {
        questionTxt.setText(question.getQuestion());
        setText(items[0], question.getAnswerA());
        setText(items[1], question.getAnswerB());
        setText(items[2], question.getAnswerC());
        setText(items[3], question.getAnswerD());
    }

    @Override
    public void selectVariant(int index) {
        setIcon(items[index], R.drawable.ic_checked);
    }

    @Override
    public void unSelectVariant(int index) {
        setIcon(items[index], R.drawable.ic_unchecked);
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showResult(int correctCount) {
        Intent intent = new Intent(this, WinnerActivity.class);
        intent.putExtra("SCORE", correctCount + "/" + 8);
        long time = chronometer.getBase() - SystemClock.elapsedRealtime();
        intent.putExtra("TIME", time);
        startActivity(intent);
        finish();
    }

    @Override
    public void setScore(int score) {
        number.setText(String.valueOf(score + "/" + 8));
    }
}
