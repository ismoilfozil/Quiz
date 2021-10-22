package uz.gita.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    public static int start = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        intiButtons();
    }

    private void intiButtons() {
        for (int i = 0; i < 7; i++) {
            int id = getResources().getIdentifier("math" + (i + 1), "id", getPackageName());
            LinearLayout layout = findViewById(id);
            layout.setTag(i);
            layout.setOnClickListener(v -> {
                start = (int) layout.getTag()*8;
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            });
        }
        findViewById(R.id.math8).setOnClickListener(v -> startActivity(new Intent(MenuActivity.this, InfoActivity.class)));
    }
}