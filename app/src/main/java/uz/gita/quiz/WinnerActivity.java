package uz.gita.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import uz.gita.quiz.data.LocalStorage;

public class WinnerActivity extends AppCompatActivity {

    private String score;
    private long time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        score = getIntent().getStringExtra("SCORE");
        time = getIntent().getLongExtra("TIME", 0);
        TextView textScore = findViewById(R.id.score_txt);
        TextView textTime = findViewById(R.id.time_txt);
        textScore.setText(score);
        textTime.setText(timeGenerator(time));
        findViewById(R.id.back_home).setOnClickListener(v -> {
            startActivity(new Intent(this, MenuActivity.class));
            finish();
        });
        findViewById(R.id.new_game).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }


    private String timeGenerator(long time) {
        int t = (int) Math.abs(time / 1000);
        String s = "";
        if (t / 60 < 10) s += "0" + t / 60;
        else s += t / 60;
        if (t % 60 < 10) s += ":0" + t % 60;
        else s += ":" + t % 60;
        return s;
    }

    @Override
    protected void onStart() {
        super.onStart();
        LocalStorage storage = LocalStorage.getInstance();
        storage.setResult(score);
    }
}