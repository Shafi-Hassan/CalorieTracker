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
        public static final String EXTRA_TEXT = "com.example.application.CalorieTracker.EXTRA_TEXT";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            //save the name and set it to the textview in mainactivity1
            Button submit = findViewById(R.id.submit);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goBack();
                }
            });

            //set page title to Settings and change color
            getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.settings) + "</font>"));

        }

        public void goBack() {
            EditText editText1 = (EditText) findViewById(R.id.editName);


            Intent intent = new Intent(this, MainActivity.class);
            //intent.putExtra(EXTRA_TEXT, text);
            startActivity(intent);
        }
    }