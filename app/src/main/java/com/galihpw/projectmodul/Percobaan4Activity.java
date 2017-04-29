package com.galihpw.projectmodul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.galihpw.projectmodul.Percobaan4.IsiPercobaan4a;
import com.galihpw.projectmodul.Percobaan4.IsiPercobaan4b;
import com.galihpw.projectmodul.Percobaan4.IsiPercobaan4c;
import com.galihpw.projectmodul.Percobaan4.IsiPercobaan4d;
import com.galihpw.projectmodul.Percobaan4.IsiPercobaan4e;

public class Percobaan4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percobaan4);

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
                Intent intent = new Intent(Percobaan4Activity.this,IsiPercobaan4a.class);
                startActivity(intent);
            }
        });


        //Menu 2
        Button bMenu2 = (Button) findViewById(R.id.bMenu2);

        bMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Percobaan4Activity.this,IsiPercobaan4b.class);
                startActivity(intent2);
            }
        });


        //Menu 3
        Button bMenu3 = (Button) findViewById(R.id.bMenu3);

        bMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Percobaan4Activity.this,IsiPercobaan4c.class);
                startActivity(intent3);
            }
        });

        //Menu 4
        Button bMenu4 = (Button) findViewById(R.id.bMenu4);

        bMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Percobaan4Activity.this,IsiPercobaan4d.class);
                startActivity(intent4);
            }
        });

        //Menu 5
        Button bMenu5 = (Button) findViewById(R.id.bMenu5);

        bMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Percobaan4Activity.this,IsiPercobaan4e.class);
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
