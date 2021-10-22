package uz.gita.quiz.data;

import android.content.SharedPreferences;

import uz.gita.quiz.app.App;

public class LocalStorage {
    private static LocalStorage localStorage;
    private static SharedPreferences sharedPreferences;
    private final String RESULT_KEY = "RESULT_KEY";

    LocalStorage() {
        sharedPreferences = App.instance.getSharedPreferences("LocalStorage", 0);
    }

    public static LocalStorage getInstance() {
        if (localStorage == null) localStorage = new LocalStorage();
        return localStorage;
    }


    public void setResult(String result) {
        String results = getResults() + "\n" + result;
        sharedPreferences.edit()
                .putString(RESULT_KEY, results)
                .apply();
    }

    public String getResults() {
        return sharedPreferences.getString(RESULT_KEY, "");
    }


}
