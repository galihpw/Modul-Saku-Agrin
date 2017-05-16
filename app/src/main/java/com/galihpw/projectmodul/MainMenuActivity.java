package com.galihpw.projectmodul;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Percobaan 1
        Button bPerc1 = (Button) findViewById(R.id.bPerc1);

        bPerc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this,Percobaan1Activity.class);
                startActivity(intent);
            }
        });


        //Percobaan 2

        String tempString="Copyright";
        Button bPerc2 = (Button) findViewById(R.id.bPerc2);
        SpannableString spanString = new SpannableString(tempString);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
        bPerc2.setText(Html.fromHtml("FERMENTASI DAN <i>BAKING</i> PEMBUATAN ROTI"));


        bPerc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainMenuActivity.this,Percobaan2Activity.class);
                startActivity(intent2);
            }
        });


        //Percobaan 3

        String tempString1="Copyright";
        Button bPerc3 = (Button) findViewById(R.id.bPerc3);
        SpannableString spanString1 = new SpannableString(tempString1);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
        bPerc3.setText(Html.fromHtml("EMULSI DALAM PEMBUATAN <i>MAYONNAISE</i>"));

        bPerc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainMenuActivity.this,Percobaan3Activity.class);
                startActivity(intent3);
            }
        });

        //Percobaan 4
        Button bPerc4 = (Button) findViewById(R.id.bPerc4);

        bPerc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainMenuActivity.this,Percobaan4Activity.class);
                startActivity(intent4);
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this,KuisActivity.class);
                startActivity(intent);
            }
        });

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();
        }
        return false;
    }
}
