package com.example.calorietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
Button daily;
Button calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity2.EXTRA_TEXT);

        int cal = intent.getIntExtra(InputCalorie.EXTRA_NUMBER1, 0);
        int carb = intent.getIntExtra(InputCalorie.EXTRA_NUMBER2, 0);
        int protein = intent.getIntExtra(InputCalorie.EXTRA_NUMBER3, 0);
        int fat = intent.getIntExtra(InputCalorie.EXTRA_NUMBER4, 0);

        TextView textView1 = (TextView) findViewById(R.id.Hello);
        textView1.setText(text);

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
    }

    //method that when called switches to Activity 2 which is the settings page
    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
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


}