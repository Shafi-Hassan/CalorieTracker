package com.example.calorietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends MainActivity {
        //public static final String EXTRA_TEXT = "com.example.application.CalorieTracker.EXTRA_TEXT";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            //save the name and set it to the textview in mainactivity1
            Button submit1 = findViewById(R.id.submit);
            submit1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goBack();
                }
            });

            //set page title to Settings and change color
            getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.settings) + "</font>"));

        }

        public void goBack() {
            //create all the edit texts that will take the user inputs and save them in the daily input database
            EditText editText1 = (EditText) findViewById(R.id.editName);
            String nameString = editText1.getText().toString();
            if(!nameString.equals(""))
                dailyIntake.addName(nameString);

            EditText editText2 = (EditText) findViewById(R.id.editAge);
            String ageString = editText2.getText().toString();
            if(!ageString.equals(""))
                dailyIntake.addAge(Integer.parseInt(ageString));

            //this are for feet
            EditText editText3 = (EditText) findViewById(R.id.editFeet);
            String feetString = editText3.getText().toString();
            if(!feetString.equals(""))
                dailyIntake.addFeet(Integer.parseInt(feetString));

            //this is for inches
            EditText editText4 = (EditText) findViewById(R.id.editInch);
            String inchString = editText4.getText().toString();
            if(!inchString.equals(""))
                dailyIntake.addInch(Integer.parseInt(inchString));

            EditText editText5 = (EditText) findViewById(R.id.editWeight);
            String weightString = editText5.getText().toString();
            if(!weightString.equals(""))
                dailyIntake.addWeight(Integer.parseInt(weightString));

            Intent intent = new Intent(this, Profile.class);
            //intent.putExtra(EXTRA_TEXT, text);
            startActivity(intent);
        }
    }