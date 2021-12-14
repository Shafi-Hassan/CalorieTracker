package com.example.calorietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends MainActivity {

    Button edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.prof) + "</font>"));

        String name = dailyIntake.getName();
        int age = dailyIntake.getAge();
        int feet = dailyIntake.getFeet();
        int inch = dailyIntake.getInch();
        int weight = dailyIntake.getWeight();

        TextView textView1 = (TextView) findViewById(R.id.dis_name);
        TextView textView2 = (TextView) findViewById(R.id.dis_age);
        TextView textView3 = (TextView) findViewById(R.id.feet);
        TextView textView4 = (TextView) findViewById(R.id.inches);
        TextView textView5 = (TextView) findViewById(R.id.weight);

        textView1.setText(name);
        textView2.setText(String.valueOf(age));
        textView3.setText(String.valueOf(feet));
        textView4.setText(String.valueOf(inch));
        textView5.setText(String.valueOf(weight));

        edit = findViewById(R.id.edit);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEditActivity();
            }
        });
    }

    public void openEditActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}