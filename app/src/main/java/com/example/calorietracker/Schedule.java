package com.example.calorietracker;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Schedule extends MainActivity{

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);

        getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.CAM) + "</font>"));

        back = findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
    }

    private void goBack() {
        EditText editText1 = (EditText) findViewById(R.id.enter_Monday);
        String MonString = editText1.getText().toString();
        if(!MonString.equals(""))
            dailyIntake.addCalories(Integer.parseInt(MonString))
                    ;

        EditText editText2 = (EditText) findViewById(R.id.enter_Tuesday);
        String TuesString = editText2.getText().toString();
        if(!TuesString.equals(""))
          //  dailyIntake.addCarbs(Integer.parseInt(TuesString))
                    ;

        EditText editText3 = (EditText) findViewById(R.id.enter_Wednesday);
        String WedString = editText3.getText().toString();
        if(!WedString.equals(""))
         //   dailyIntake.addProteins(Integer.parseInt(WedString))
                    ;

        EditText editText4 = (EditText) findViewById(R.id.enter_Thursday);
        String ThursdayString = editText4.getText().toString();
        if(!ThursdayString.equals(""))
           // dailyIntake.addFats(Integer.parseInt(ThursdayString))
            ;

        EditText editText5 = (EditText) findViewById(R.id.enter_Friday);
        String FridayString = editText4.getText().toString();
        if(!FridayString.equals(""))
            // dailyIntake.addFats(Integer.parseInt(FridayString))
            ;
        Intent intent = new Intent(this, Exercise.class);
        startActivity(intent);
    }
}
