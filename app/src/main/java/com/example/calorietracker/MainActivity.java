package com.example.calorietracker;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
Button button;
Button daily;
Button calendar;
Button exercise;
protected static DailyIntakeStats dailyIntake = new DailyIntakeStats();
//private Calendar date = Calendar.getInstance();
String prevStarted = "yes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String name = dailyIntake.getName();

        int cal = dailyIntake.getTotal_calories();
        int carb = dailyIntake.getCarbs();
        int protein = dailyIntake.getProteins();
        int fat = dailyIntake.getFats();
        double bmi = dailyIntake.calBMI();

        TextView textView1 = (TextView) findViewById(R.id.Hello);
        TextView textView2 = (TextView) findViewById(R.id.Calories);
        TextView textView3 = (TextView) findViewById(R.id.Carb);
        TextView textView4 = (TextView) findViewById(R.id.Protein);
        TextView textView5 = (TextView) findViewById(R.id.Fat);
        TextView textView6 = (TextView) findViewById(R.id.BMI);

        textView1.setText("Hello, " + name);
        textView2.setText("Calories: " + cal);
        textView3.setText("Carbohydrates: " + carb);
        textView4.setText("Proteins: " + protein);
        textView5.setText("Fats: " + fat);
        textView6.setText("BMI: " + bmi);

        //make page title "Home" and change color
        getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.home) + "</font>"));

        //make settings button lead to setting page which is Mainactivity2
        button = findViewById(R.id.settingsbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        daily = findViewById(R.id.dailybutton);
        daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDaily();
            }
        });

        calendar = findViewById(R.id.calendarbutton);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openCalendar(); }
        });

        exercise = findViewById(R.id.exercisebutton);
        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openExercise(); }
        });
    }

    //method that when called switches to Activity 2 which is the settings page
    public void openActivity2() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void openDaily() {
        Intent intent = new Intent(this, Daily.class);
        startActivity(intent);
    }

    public void openCalendar(){
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    public void openExercise(){
        Intent intent = new Intent(this, Exercise.class);
        startActivity(intent);
    }

}