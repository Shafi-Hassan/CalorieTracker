package com.example.calorietracker;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Exercise extends MainActivity{
    // add a part that will choose excercises
    // inputs calories
    // subtract this calorie amount from daily

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);

        back = findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
    }

    private void goBack() {
        EditText editText_sport = (EditText) findViewById(R.id.enter_sport);
        EditText editText1 = (EditText) findViewById(R.id.enter_calories);
        String calString = editText1.getText().toString();
        if(!calString.equals(""))
            dailyIntake.removeCalories(Integer.parseInt(calString));

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
