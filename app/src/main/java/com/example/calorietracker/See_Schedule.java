package com.example.calorietracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class See_Schedule extends Exercise {
    Button back;
    //    protected static Calculate_Schedule scheduleIntake = new Calculate_Schedule();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.see_schedule);
        Intent intent = getIntent();

        String Monday_String = scheduleIntake.getMonday();
        String Tuesday_String = scheduleIntake.getTuesday();
        String Wednesday_String = scheduleIntake.getWednesday();
        String Thursday_String = scheduleIntake.getThursday();
        String Friday_String = scheduleIntake.getFriday();

        TextView textView1 = (TextView) findViewById(R.id.Monday_View);
        TextView textView2 = (TextView) findViewById(R.id.Tuesday_View);
        TextView textView3 = (TextView) findViewById(R.id.Wednesday_View);
        TextView textView4 = (TextView) findViewById(R.id.Thursday_View);
        TextView textView5 = (TextView) findViewById(R.id.Friday_View);

        textView1.setText("Monday: "+Monday_String);
        textView2.setText("Tuesday: "+Tuesday_String);
        textView3.setText("Wednesday: "+Wednesday_String);
        textView4.setText("Thursday: "+Thursday_String);
        textView5.setText("Friday: "+Friday_String);

        back = findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });

    }

    private void goBack() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}