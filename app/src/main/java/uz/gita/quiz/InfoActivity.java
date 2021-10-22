package uz.gita.quiz;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import uz.gita.quiz.data.LocalStorage;

public class InfoActivity extends AppCompatActivity {

    private TextView results;
    private LocalStorage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        storage = LocalStorage.getInstance();
        findViewById(R.id.backspaceBtn).setOnClickListener(v -> finish());
        results = findViewById(R.id.results);

    }

    @Override
    protected void onStart() {
        super.onStart();
        results.setText(storage.getResults());
    }
}