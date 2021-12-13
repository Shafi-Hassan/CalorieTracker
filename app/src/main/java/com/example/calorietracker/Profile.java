package com.example.calorietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class Profile extends MainActivity {

    Button edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.prof) + "</font>"));

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