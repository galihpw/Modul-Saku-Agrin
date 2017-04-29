package com.galihpw.projectmodul;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.galihpw.projectmodul.Percobaan1.IsiPercobaan1A;
import com.galihpw.projectmodul.Percobaan2.IsiPercobaan2;

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
        Button bPerc2 = (Button) findViewById(R.id.bPerc2);

        bPerc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainMenuActivity.this,IsiPercobaan2.class);
                startActivity(intent2);
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
}
