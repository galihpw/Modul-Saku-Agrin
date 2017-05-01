package com.galihpw.projectmodul.Percobaan1;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.galihpw.projectmodul.R;

public class TabelIsiPercobaan1c extends AppCompatActivity {
    EditText ek1b1,ek2b1,ek1b2,ek2b2,ek1b3,ek2b3,ek1b4,ek2b4,ek1b5,ek2b5,ek1b6,ek2b6;
    Button simpan;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String k1b1 = "k1b1";
    public static final String k2b1 = "k2b1";
    public static final String k1b2 = "k1b2";
    public static final String k2b2 = "k2b2";
    public static final String k1b3 = "k1b3";
    public static final String k2b3 = "k2b3";
    public static final String k1b4 = "k1b4";
    public static final String k2b4 = "k2b4";
    public static final String k1b5 = "k1b5";
    public static final String k2b5 = "k2b5";
    public static final String k1b6 = "k1b6";
    public static final String k2b6 = "k2b6";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel_isi_percobaan1c);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ek1b1 = (EditText) findViewById(R.id.etkol1bar1);
        ek2b1 = (EditText) findViewById(R.id.etkol2bar1);
        ek1b2 = (EditText) findViewById(R.id.etkol1bar2);
        ek2b2 = (EditText) findViewById(R.id.etkol2bar2);
        ek1b3 = (EditText) findViewById(R.id.etkol1bar3);
        ek2b3 = (EditText) findViewById(R.id.etkol2bar3);
        ek1b4 = (EditText) findViewById(R.id.etkol1bar4);
        ek2b4 = (EditText) findViewById(R.id.etkol2bar4);
        ek1b5 = (EditText) findViewById(R.id.etkol1bar5);
        ek2b5 = (EditText) findViewById(R.id.etkol2bar5);
        ek1b6 = (EditText) findViewById(R.id.etkol1bar6);
        ek2b6 = (EditText) findViewById(R.id.etkol2bar6);

        simpan = (Button) findViewById(R.id.bSimpan);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        String gek1b1 = sharedpreferences.getString("k1b1", "No name defined");
        String gek2b1 = sharedpreferences.getString("k2b1", "No name defined");
        String gek1b2 = sharedpreferences.getString("k1b2", "No name defined");
        String gek2b2 = sharedpreferences.getString("k2b2", "No name defined");
        String gek1b3 = sharedpreferences.getString("k1b3", "No name defined");
        String gek2b3 = sharedpreferences.getString("k2b3", "No name defined");
        String gek1b4 = sharedpreferences.getString("k1b4", "No name defined");
        String gek2b4 = sharedpreferences.getString("k2b4", "No name defined");
        String gek1b5 = sharedpreferences.getString("k1b5", "No name defined");
        String gek2b5 = sharedpreferences.getString("k2b5", "No name defined");
        String gek1b6 = sharedpreferences.getString("k1b6", "No name defined");
        String gek2b6 = sharedpreferences.getString("k2b6", "No name defined");
        ek1b1.setText(gek1b1);
        ek2b1.setText(gek2b1);
        ek1b2.setText(gek1b2);
        ek2b2.setText(gek2b2);
        ek1b3.setText(gek1b3);
        ek2b3.setText(gek2b3);
        ek1b4.setText(gek1b4);
        ek2b4.setText(gek2b4);
        ek1b5.setText(gek1b5);
        ek2b5.setText(gek2b5);
        ek1b6.setText(gek1b6);
        ek2b6.setText(gek2b6);


        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tek1b1 = ek1b1.getText().toString();
                String tek2b1 = ek2b1.getText().toString();
                String tek1b2 = ek1b2.getText().toString();
                String tek2b2 = ek2b2.getText().toString();
                String tek1b3 = ek1b3.getText().toString();
                String tek2b3 = ek2b3.getText().toString();
                String tek1b4 = ek1b4.getText().toString();
                String tek2b4 = ek2b4.getText().toString();
                String tek1b5 = ek1b5.getText().toString();
                String tek2b5 = ek2b5.getText().toString();
                String tek1b6 = ek1b6.getText().toString();
                String tek2b6 = ek2b6.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(k1b1, tek1b1);
                editor.putString(k2b1, tek2b1);
                editor.putString(k1b2, tek1b2);
                editor.putString(k2b2, tek2b2);
                editor.putString(k1b3, tek1b3);
                editor.putString(k2b3, tek2b3);
                editor.putString(k1b4, tek1b4);
                editor.putString(k2b4, tek2b4);
                editor.putString(k1b5, tek1b5);
                editor.putString(k2b5, tek2b5);
                editor.putString(k1b6, tek1b6);
                editor.putString(k2b6, tek2b6);
                editor.commit();

                Toast.makeText(TabelIsiPercobaan1c.this, "Menyimpan Jawaban", Toast.LENGTH_SHORT).show();
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
