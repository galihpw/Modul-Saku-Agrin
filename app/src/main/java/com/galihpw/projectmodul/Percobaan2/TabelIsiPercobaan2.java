package com.galihpw.projectmodul.Percobaan2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.galihpw.projectmodul.R;

public class TabelIsiPercobaan2 extends AppCompatActivity {

    EditText ek1b1,ek1b2,ek1b3,ek1b4,ek1b5,ek1b6, ek1b7,ek1b8,ek1b9,ek1b10;
    Button simpan;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String k1b1 = "k1b1";
    public static final String k1b2 = "k1b2";
    public static final String k1b3 = "k1b3";
    public static final String k1b4 = "k1b4";
    public static final String k1b5 = "k1b5";
    public static final String k1b6 = "k1b6";
    public static final String k1b7 = "k1b7";
    public static final String k1b8 = "k1b8";
    public static final String k1b9 = "k1b9";
    public static final String k1b10 = "k1b10";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel_isi_percobaan2);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ek1b1 = (EditText) findViewById(R.id.etkol1bar1);
        ek1b2 = (EditText) findViewById(R.id.etkol1bar2);
        ek1b3 = (EditText) findViewById(R.id.etkol1bar3);
        ek1b4 = (EditText) findViewById(R.id.etkol1bar4);
        ek1b5 = (EditText) findViewById(R.id.etkol1bar5);
        ek1b6 = (EditText) findViewById(R.id.etkol1bar6);
        ek1b7 = (EditText) findViewById(R.id.etkol1bar7);
        ek1b8 = (EditText) findViewById(R.id.etkol1bar8);
        ek1b9 = (EditText) findViewById(R.id.etkol1bar9);
        ek1b10 = (EditText) findViewById(R.id.etkol1bar10);

        simpan = (Button) findViewById(R.id.bSimpan);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        String gek1b1 = sharedpreferences.getString("k1b1", "No name defined");
        String gek1b2 = sharedpreferences.getString("k1b2", "No name defined");
        String gek1b3 = sharedpreferences.getString("k1b3", "No name defined");
        String gek1b4 = sharedpreferences.getString("k1b4", "No name defined");
        String gek1b5 = sharedpreferences.getString("k1b5", "No name defined");
        String gek1b6 = sharedpreferences.getString("k1b6", "No name defined");
        String gek1b7 = sharedpreferences.getString("k1b7", "No name defined");
        String gek1b8 = sharedpreferences.getString("k1b8", "No name defined");
        String gek1b9 = sharedpreferences.getString("k1b9", "No name defined");
        String gek1b10 = sharedpreferences.getString("k1b10", "No name defined");

        ek1b1.setText(gek1b1);
        ek1b2.setText(gek1b2);
        ek1b3.setText(gek1b3);
        ek1b4.setText(gek1b4);
        ek1b5.setText(gek1b5);
        ek1b6.setText(gek1b6);
        ek1b7.setText(gek1b7);
        ek1b8.setText(gek1b8);
        ek1b9.setText(gek1b9);
        ek1b10.setText(gek1b10);


        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tek1b1 = ek1b1.getText().toString();
                String tek1b2 = ek1b2.getText().toString();
                String tek1b3 = ek1b3.getText().toString();
                String tek1b4 = ek1b4.getText().toString();
                String tek1b5 = ek1b5.getText().toString();
                String tek1b6 = ek1b6.getText().toString();
                String tek1b7 = ek1b7.getText().toString();
                String tek1b8 = ek1b8.getText().toString();
                String tek1b9 = ek1b9.getText().toString();
                String tek1b10 = ek1b10.getText().toString();


                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(k1b1, tek1b1);
                editor.putString(k1b2, tek1b2);
                editor.putString(k1b3, tek1b3);
                editor.putString(k1b4, tek1b4);
                editor.putString(k1b5, tek1b5);
                editor.putString(k1b6, tek1b6);
                editor.putString(k1b7, tek1b7);
                editor.putString(k1b8, tek1b8);
                editor.putString(k1b9, tek1b9);
                editor.putString(k1b10, tek1b10);

                editor.commit();

                Toast.makeText(TabelIsiPercobaan2.this, "Menyimpan Jawaban", Toast.LENGTH_SHORT).show();
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
