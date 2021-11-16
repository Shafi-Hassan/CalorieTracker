package com.example.calorietracker;


import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Calendar extends MainActivity {

    CalendarView calendar;
    TextView date_view;
    protected static DailyIntakeStats dailyIntake = new DailyIntakeStats();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        // get the CalendarView and TextView
        calendar = (CalendarView)
                findViewById(R.id.calendar);
        date_view = (TextView)
                findViewById(R.id.date_view);

        TextView textView2 = (TextView) findViewById(R.id.Calories);
        TextView textView3 = (TextView) findViewById(R.id.Carb);
        TextView textView4 = (TextView) findViewById(R.id.Protein);
        TextView textView5 = (TextView) findViewById(R.id.Fat);
        // Listener in calendar
        calendar
                .setOnDateChangeListener(
                        new CalendarView
                                .OnDateChangeListener() {
                            @Override
                            public void onSelectedDayChange(
                                    CalendarView view,
                                    int year,
                                    int month,
                                    int dayOfMonth)
                            {
                                String Date
                                        =
                                        (month + 1) + "-" + dayOfMonth + "-" + year;

                                // set this date in TextView for Display
                                date_view.setText(Date);


                                int cal = dailyIntake.getTotal_calories();
                                int carb = dailyIntake.getCarbs();
                                int protein = dailyIntake.getProteins();
                                int fat = dailyIntake.getFats();


                                textView2.setText("Calories: " + cal);
                                textView3.setText("Carbohydrates: " + carb);
                                textView4.setText("Proteins: " + protein);
                                textView5.setText("Fats: " + fat);
                            }
                        });
    }
}
