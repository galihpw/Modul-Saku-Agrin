package com.galihpw.projectmodul;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.galihpw.projectmodul.Percobaan1.IsiPercobaan1A;
import com.galihpw.projectmodul.Percobaan1.IsiPercobaan1B;
import com.galihpw.projectmodul.Percobaan1.IsiPercobaan1C;
import com.galihpw.projectmodul.Percobaan1.IsiPercobaan1D;

public class Percobaan1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percobaan1);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //Menu 1
        Button bMenu1 = (Button) findViewById(R.id.bMenu1);

        bMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Percobaan1Activity.this,IsiPercobaan1A.class);
                startActivity(intent);
            }
        });


        //Menu 2
        Button bMenu2 = (Button) findViewById(R.id.bMenu2);

        bMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Percobaan1Activity.this,IsiPercobaan1B.class);
                startActivity(intent2);
            }
        });


        //Menu 3
        Button bMenu3 = (Button) findViewById(R.id.bMenu3);

        bMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Percobaan1Activity.this,IsiPercobaan1C.class);
                startActivity(intent3);
            }
        });

        //Menu 4
        Button bMenu4 = (Button) findViewById(R.id.bMenu4);

        bMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Percobaan1Activity.this,IsiPercobaan1D.class);
                startActivity(intent4);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
