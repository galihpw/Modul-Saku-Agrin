package com.galihpw.projectmodul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Menu 1
        Button bMenu1 = (Button) findViewById(R.id.bMenu1);

        bMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,IsiMenu1.class);
                startActivity(intent);
                finish();
            }
        });


        //Menu 2
        Button bMenu2 = (Button) findViewById(R.id.bMenu2);

        bMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MenuActivity.this,IsiMenu2.class);
                startActivity(intent2);
                finish();
            }
        });


        //Menu 3
        Button bMenu3 = (Button) findViewById(R.id.bMenu3);

        bMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MenuActivity.this,IsiMenu3.class);
                startActivity(intent3);
                finish();
            }
        });
    }
}
