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
    protected static Calculate_Schedule scheduleIntake = new Calculate_Schedule();

    Button back;
    Button Schedule;
    Button See_Schedule;

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

        Schedule = findViewById(R.id.schedule);
        Schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScheduleActivity();
            }
        });

        See_Schedule = findViewById(R.id.see_schedule);
        See_Schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSee_ScheduleActivity();
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

    public void openScheduleActivity() {
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }

    public void openSee_ScheduleActivity() {
        Intent intent = new Intent(this, See_Schedule.class);
        startActivity(intent);
    }

}