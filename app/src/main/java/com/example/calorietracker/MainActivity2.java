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

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /* this should save the name and set it to the textview in mainactivity 1 but it doesnt
        final EditText nameet = findViewById(R.id.editName);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = nameet.getText().toString().trim();
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity2.this);
                pref.edit().putString("NAME", Name).apply();

                TextView savedTextView = findViewById(R.id.Hello);
                String savedText = "Hello " + pref.getString("NAME", "");
                savedTextView.setText(savedText);
            }
        });*/


        //set page title to Settings and change color
        getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.settings) + "</font>"));

    }
}