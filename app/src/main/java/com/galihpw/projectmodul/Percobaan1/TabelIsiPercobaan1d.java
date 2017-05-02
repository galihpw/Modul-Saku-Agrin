package com.galihpw.projectmodul.Percobaan1;

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

public class TabelIsiPercobaan1d extends AppCompatActivity {
    EditText ek1b1,ek2b1,ek1b2,ek2b2,ek1b3,ek2b3,ek1b4,ek2b4,ek1b5,ek2b5,ek1b6,ek2b6,ek1b7,ek2b7,ek1b8,ek2b8,ek1b9,ek2b9,ek1b10,ek2b10;
    EditText ek1b11,ek2b11,ek1b12,ek2b12,ek1b14,ek2b14,ek1b15,ek2b15,ek1b16,ek2b16,ek1b17,ek2b17,ek1b18,ek2b18,ek1b19,ek2b19,ek1b20,ek2b20;
    EditText ek1b21,ek2b21,ek1b22,ek2b22,ek1b23,ek2b23,ek1b24,ek2b24,ek1b25,ek2b25,ek1b26,ek2b26,ek1b27,ek2b27,ek1b28,ek2b28,ek1b29,ek2b29,ek1b30,ek2b30;
    EditText ek1b31,ek2b31,ek1b32,ek2b32,ek1b33,ek2b33;
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
    public static final String k1b7 = "k1b7";
    public static final String k2b7 = "k2b7";
    public static final String k1b8 = "k1b8";
    public static final String k2b8 = "k2b8";
    public static final String k1b9 = "k1b9";
    public static final String k2b9 = "k2b9";
    public static final String k1b10 = "k1b10";
    public static final String k2b10 = "k2b10";

    public static final String k1b11 = "k1b11";
    public static final String k2b11 = "k2b11";
    public static final String k1b12 = "k1b12";
    public static final String k2b12 = "k2b12";
   /* public static final String k1b13 = "k1b13";
    public static final String k2b13 = "k2b13";*/
    public static final String k1b14 = "k1b14";
    public static final String k2b14 = "k2b14";
    public static final String k1b15 = "k1b15";
    public static final String k2b15 = "k2b15";
    public static final String k1b16 = "k1b16";
    public static final String k2b16 = "k2b16";
    public static final String k1b17 = "k1b17";
    public static final String k2b17 = "k2b17";
    public static final String k1b18 = "k1b18";
    public static final String k2b18 = "k2b18";
    public static final String k1b19 = "k1b19";
    public static final String k2b19 = "k2b19";
    public static final String k1b20 = "k1b20";
    public static final String k2b20 = "k2b20";

    public static final String k1b21 = "k1b21";
    public static final String k2b21 = "k2b21";
    public static final String k1b22 = "k1b22";
    public static final String k2b22 = "k2b22";
    public static final String k1b23 = "k1b23";
    public static final String k2b23 = "k2b23";
    public static final String k1b24 = "k1b24";
    public static final String k2b24 = "k2b24";
    public static final String k1b25 = "k1b25";
    public static final String k2b25 = "k2b25";
    public static final String k1b26 = "k1b26";
    public static final String k2b26 = "k2b26";
    public static final String k1b27 = "k1b27";
    public static final String k2b27 = "k2b27";
    public static final String k1b28 = "k1b28";
    public static final String k2b28 = "k2b28";
    public static final String k1b29 = "k1b29";
    public static final String k2b29 = "k2b29";
    public static final String k1b30 = "k1b30";
    public static final String k2b30 = "k2b30";

    public static final String k1b31 = "k1b31";
    public static final String k2b31 = "k2b31";
    public static final String k1b32 = "k1b32";
    public static final String k2b32 = "k2b32";
    public static final String k1b33 = "k1b33";
    public static final String k2b33 = "k2b33";


    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel_isi_percobaan1d);

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
        ek1b7 = (EditText) findViewById(R.id.etkol1bar7);
        ek2b7 = (EditText) findViewById(R.id.etkol2bar7);
        ek1b8 = (EditText) findViewById(R.id.etkol1bar8);
        ek2b8 = (EditText) findViewById(R.id.etkol2bar8);
        ek1b9 = (EditText) findViewById(R.id.etkol1bar9);
        ek2b9 = (EditText) findViewById(R.id.etkol2bar9);
        ek1b10 = (EditText) findViewById(R.id.etkol1bar10);
        ek2b10 = (EditText) findViewById(R.id.etkol2bar10);

        ek1b11 = (EditText) findViewById(R.id.etkol1bar11);
        ek2b11 = (EditText) findViewById(R.id.etkol2bar11);
        ek1b12 = (EditText) findViewById(R.id.etkol1bar12);
        ek2b12 = (EditText) findViewById(R.id.etkol2bar12);
       /* ek1b13 = (EditText) findViewById(R.id.etkol1bar13);
        ek2b13 = (EditText) findViewById(R.id.etkol2bar13);*/
        ek1b14 = (EditText) findViewById(R.id.etkol1bar14);
        ek2b14 = (EditText) findViewById(R.id.etkol2bar14);
        ek1b15 = (EditText) findViewById(R.id.etkol1bar15);
        ek2b15 = (EditText) findViewById(R.id.etkol2bar15);
        ek1b16 = (EditText) findViewById(R.id.etkol1bar16);
        ek2b16 = (EditText) findViewById(R.id.etkol2bar16);
        ek1b17 = (EditText) findViewById(R.id.etkol1bar17);
        ek2b17 = (EditText) findViewById(R.id.etkol2bar17);
        ek1b18 = (EditText) findViewById(R.id.etkol1bar18);
        ek2b18 = (EditText) findViewById(R.id.etkol2bar18);
        ek1b19 = (EditText) findViewById(R.id.etkol1bar19);
        ek2b19 = (EditText) findViewById(R.id.etkol2bar19);
        ek1b20 = (EditText) findViewById(R.id.etkol1bar20);
        ek2b20 = (EditText) findViewById(R.id.etkol2bar20);

        ek1b21 = (EditText) findViewById(R.id.etkol1bar21);
        ek2b21 = (EditText) findViewById(R.id.etkol2bar21);
        ek1b22 = (EditText) findViewById(R.id.etkol1bar22);
        ek2b22 = (EditText) findViewById(R.id.etkol2bar22);
        ek1b23 = (EditText) findViewById(R.id.etkol1bar23);
        ek2b23 = (EditText) findViewById(R.id.etkol2bar23);
        ek1b24 = (EditText) findViewById(R.id.etkol1bar24);
        ek2b24 = (EditText) findViewById(R.id.etkol2bar24);
        ek1b25 = (EditText) findViewById(R.id.etkol1bar25);
        ek2b25 = (EditText) findViewById(R.id.etkol2bar25);
        ek1b26 = (EditText) findViewById(R.id.etkol1bar26);
        ek2b26 = (EditText) findViewById(R.id.etkol2bar26);
        ek1b27 = (EditText) findViewById(R.id.etkol1bar27);
        ek2b27 = (EditText) findViewById(R.id.etkol2bar27);
        ek1b28 = (EditText) findViewById(R.id.etkol1bar28);
        ek2b28 = (EditText) findViewById(R.id.etkol2bar28);
        ek1b29 = (EditText) findViewById(R.id.etkol1bar29);
        ek2b29 = (EditText) findViewById(R.id.etkol2bar29);
        ek1b30 = (EditText) findViewById(R.id.etkol1bar30);
        ek2b30 = (EditText) findViewById(R.id.etkol2bar30);

        ek1b31 = (EditText) findViewById(R.id.etkol1bar31);
        ek2b31 = (EditText) findViewById(R.id.etkol2bar31);
        ek1b32 = (EditText) findViewById(R.id.etkol1bar32);
        ek2b32 = (EditText) findViewById(R.id.etkol2bar32);
        ek1b33 = (EditText) findViewById(R.id.etkol1bar33);
        ek2b33 = (EditText) findViewById(R.id.etkol2bar33);

        simpan = (Button) findViewById(R.id.bSimpan);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

                String gek1b1 = sharedpreferences.getString("k1b1", "........");
                String gek2b1 = sharedpreferences.getString("k2b1", "........");
                String gek1b2 = sharedpreferences.getString("k1b2", "........");
                String gek2b2 = sharedpreferences.getString("k2b2", "........");
                String gek1b3 = sharedpreferences.getString("k1b3", "........");
                String gek2b3 = sharedpreferences.getString("k2b3", "........");
                String gek1b4 = sharedpreferences.getString("k1b4", "........");
                String gek2b4 = sharedpreferences.getString("k2b4", "........");
                String gek1b5 = sharedpreferences.getString("k1b5", "........");
                String gek2b5 = sharedpreferences.getString("k2b5", "........");
                String gek1b6 = sharedpreferences.getString("k1b6", "........");
                String gek2b6 = sharedpreferences.getString("k2b6", "........");
                String gek1b7 = sharedpreferences.getString("k1b7", "........");
                String gek2b7 = sharedpreferences.getString("k2b7", "........");
                String gek1b8 = sharedpreferences.getString("k1b8", "........");
                String gek2b8 = sharedpreferences.getString("k2b8", "........");
                String gek1b9 = sharedpreferences.getString("k1b9", "........");
                String gek2b9 = sharedpreferences.getString("k2b9", "........");
                String gek1b10 = sharedpreferences.getString("k1b10", "........");
                String gek2b10 = sharedpreferences.getString("k2b10", "........");

                String gek1b11 = sharedpreferences.getString("k1b11", "........");
                String gek2b11 = sharedpreferences.getString("k2b11", "........");
                String gek1b12 = sharedpreferences.getString("k1b12", "........");
                String gek2b12 = sharedpreferences.getString("k2b12", "........");
           /*     String gek1b13 = sharedpreferences.getString("k1b13", "........");
                String gek2b13 = sharedpreferences.getString("k2b13", "........");*/
                String gek1b14 = sharedpreferences.getString("k1b14", "........");
                String gek2b14 = sharedpreferences.getString("k2b14", "........");
                String gek1b15 = sharedpreferences.getString("k1b15", "........");
                String gek2b15 = sharedpreferences.getString("k2b15", "........");
                String gek1b16 = sharedpreferences.getString("k1b16", "........");
                String gek2b16 = sharedpreferences.getString("k2b16", "........");
                String gek1b17 = sharedpreferences.getString("k1b17", "........");
                String gek2b17 = sharedpreferences.getString("k2b17", "........");
                String gek1b18 = sharedpreferences.getString("k1b18", "........");
                String gek2b18 = sharedpreferences.getString("k2b18", "........");
                String gek1b19 = sharedpreferences.getString("k1b19", "........");
                String gek2b19 = sharedpreferences.getString("k2b19", "........");
                String gek1b20 = sharedpreferences.getString("k1b20", "........");
                String gek2b20 = sharedpreferences.getString("k2b20", "........");

                String gek1b21 = sharedpreferences.getString("k1b21", "........");
                String gek2b21 = sharedpreferences.getString("k2b21", "........");
                String gek1b22 = sharedpreferences.getString("k1b22", "........");
                String gek2b22 = sharedpreferences.getString("k2b22", "........");
                String gek1b23 = sharedpreferences.getString("k1b23", "........");
                String gek2b23 = sharedpreferences.getString("k2b23", "........");
                String gek1b24 = sharedpreferences.getString("k1b24", "........");
                String gek2b24 = sharedpreferences.getString("k2b24", "........");
                String gek1b25 = sharedpreferences.getString("k1b25", "........");
                String gek2b25 = sharedpreferences.getString("k2b25", "........");
                String gek1b26 = sharedpreferences.getString("k1b26", "........");
                String gek2b26 = sharedpreferences.getString("k2b26", "........");
                String gek1b27 = sharedpreferences.getString("k1b27", "........");
                String gek2b27 = sharedpreferences.getString("k2b27", "........");
                String gek1b28 = sharedpreferences.getString("k1b28", "........");
                String gek2b28 = sharedpreferences.getString("k2b28", "........");
                String gek1b29 = sharedpreferences.getString("k1b29", "........");
                String gek2b29 = sharedpreferences.getString("k2b29", "........");
                String gek1b30 = sharedpreferences.getString("k1b30", "........");
                String gek2b30 = sharedpreferences.getString("k2b30", "........");
                String gek1b31 = sharedpreferences.getString("k1b31", "........");
                String gek2b31 = sharedpreferences.getString("k2b31", "........");
                String gek1b32 = sharedpreferences.getString("k1b32", "........");
                String gek2b32 = sharedpreferences.getString("k2b32", "........");
                String gek1b33 = sharedpreferences.getString("k1b33", "........");
                String gek2b33 = sharedpreferences.getString("k2b33", "........");

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
                ek1b7.setText(gek1b7);
                ek2b7.setText(gek2b7);
                ek1b8.setText(gek1b8);
                ek2b8.setText(gek2b8);
                ek1b9.setText(gek1b9);
                ek2b9.setText(gek2b9);
                ek1b10.setText(gek1b10);
                ek2b10.setText(gek2b10);

                ek1b11.setText(gek1b11);
                ek2b11.setText(gek2b11);
                ek1b12.setText(gek1b12);
                ek2b12.setText(gek2b12);
               /* ek1b13.setText(gek1b3);
                ek2b13.setText(gek2b3);*/
                ek1b14.setText(gek1b14);
                ek2b14.setText(gek2b14);
                ek1b15.setText(gek1b15);
                ek2b15.setText(gek2b15);
                ek1b16.setText(gek1b16);
                ek2b16.setText(gek2b16);
                ek1b17.setText(gek1b17);
                ek2b17.setText(gek2b17);
                ek1b18.setText(gek1b18);
                ek2b18.setText(gek2b18);
                ek1b19.setText(gek1b19);
                ek2b19.setText(gek2b19);
                ek1b20.setText(gek1b20);
                ek2b20.setText(gek2b20);

                ek1b21.setText(gek1b21);
                ek2b21.setText(gek2b21);
                ek1b22.setText(gek1b22);
                ek2b22.setText(gek2b22);
                ek1b23.setText(gek1b23);
                ek2b23.setText(gek2b23);
                ek1b24.setText(gek1b24);
                ek2b24.setText(gek2b24);
                ek1b25.setText(gek1b25);
                ek2b25.setText(gek2b25);
                ek1b26.setText(gek1b26);
                ek2b26.setText(gek2b26);
                ek1b27.setText(gek1b27);
                ek2b27.setText(gek2b27);
                ek1b28.setText(gek1b28);
                ek2b28.setText(gek2b28);
                ek1b29.setText(gek1b29);
                ek2b29.setText(gek2b29);
                ek1b30.setText(gek1b30);
                ek2b30.setText(gek2b30);

                ek1b31.setText(gek1b31);
                ek2b31.setText(gek2b31);
                ek1b32.setText(gek1b32);
                ek2b32.setText(gek2b32);
                ek1b33.setText(gek1b33);
                ek2b33.setText(gek2b33);


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
                        String tek1b7 = ek1b7.getText().toString();
                        String tek2b7 = ek2b7.getText().toString();
                        String tek1b8 = ek1b8.getText().toString();
                        String tek2b8 = ek2b8.getText().toString();
                        String tek1b9 = ek1b9.getText().toString();
                        String tek2b9 = ek2b9.getText().toString();
                        String tek1b10 = ek1b10.getText().toString();
                        String tek2b10 = ek2b10.getText().toString();

                        String tek1b11 = ek1b11.getText().toString();
                        String tek2b11 = ek2b11.getText().toString();
                        String tek1b12 = ek1b12.getText().toString();
                        String tek2b12 = ek2b12.getText().toString();
               /* String tek1b13 = ek1b13.getText().toString();
                String tek2b13 = ek2b13.getText().toString();*/
                        String tek1b14 = ek1b14.getText().toString();
                        String tek2b14 = ek2b14.getText().toString();
                        String tek1b15 = ek1b15.getText().toString();
                        String tek2b15 = ek2b15.getText().toString();
                        String tek1b16 = ek1b16.getText().toString();
                        String tek2b16 = ek2b16.getText().toString();
                        String tek1b17 = ek1b17.getText().toString();
                        String tek2b17 = ek2b17.getText().toString();
                        String tek1b18 = ek1b18.getText().toString();
                        String tek2b18 = ek2b18.getText().toString();
                        String tek1b19 = ek1b19.getText().toString();
                        String tek2b19 = ek2b19.getText().toString();
                        String tek1b20 = ek1b20.getText().toString();
                        String tek2b20 = ek2b20.getText().toString();

                        String tek1b21 = ek1b21.getText().toString();
                        String tek2b21 = ek2b21.getText().toString();
                        String tek1b22 = ek1b22.getText().toString();
                        String tek2b22 = ek2b22.getText().toString();
                        String tek1b23 = ek1b23.getText().toString();
                        String tek2b23 = ek2b23.getText().toString();
                        String tek1b24 = ek1b24.getText().toString();
                        String tek2b24 = ek2b24.getText().toString();
                        String tek1b25 = ek1b25.getText().toString();
                        String tek2b25 = ek2b25.getText().toString();
                        String tek1b26 = ek1b26.getText().toString();
                        String tek2b26 = ek2b26.getText().toString();
                        String tek1b27 = ek1b27.getText().toString();
                        String tek2b27 = ek2b27.getText().toString();
                        String tek1b28 = ek1b28.getText().toString();
                        String tek2b28 = ek2b28.getText().toString();
                        String tek1b29 = ek1b29.getText().toString();
                        String tek2b29 = ek2b29.getText().toString();
                        String tek1b30 = ek1b30.getText().toString();
                        String tek2b30 = ek2b30.getText().toString();

                        String tek1b31 = ek1b31.getText().toString();
                        String tek2b31 = ek2b31.getText().toString();
                        String tek1b32 = ek1b32.getText().toString();
                        String tek2b32 = ek2b32.getText().toString();
                        String tek1b33 = ek1b33.getText().toString();
                        String tek2b33 = ek2b33.getText().toString();


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
                        editor.putString(k1b7, tek1b7);
                        editor.putString(k2b7, tek2b7);
                        editor.putString(k1b8, tek1b8);
                        editor.putString(k2b8, tek2b8);
                        editor.putString(k1b9, tek1b9);
                        editor.putString(k2b9, tek2b9);
                        editor.putString(k1b10, tek1b10);
                        editor.putString(k2b10, tek2b10);

                        editor.putString(k1b11, tek1b11);
                        editor.putString(k2b11, tek2b11);
                        editor.putString(k1b12, tek1b12);
                        editor.putString(k2b12, tek2b12);
                       /* editor.putString(k1b13, tek1b13);
                        editor.putString(k2b13, tek2b13);*/
                        editor.putString(k1b14, tek1b14);
                        editor.putString(k2b14, tek2b14);
                        editor.putString(k1b15, tek1b15);
                        editor.putString(k2b15, tek2b15);
                        editor.putString(k1b16, tek1b16);
                        editor.putString(k2b16, tek2b16);
                        editor.putString(k1b17, tek1b17);
                        editor.putString(k2b17, tek2b17);
                        editor.putString(k1b18, tek1b18);
                        editor.putString(k2b18, tek2b18);
                        editor.putString(k1b19, tek1b19);
                        editor.putString(k2b19, tek2b19);
                        editor.putString(k1b20, tek1b20);
                        editor.putString(k2b20, tek2b20);

                        editor.putString(k1b21, tek1b21);
                        editor.putString(k2b21, tek2b21);
                        editor.putString(k1b22, tek1b22);
                        editor.putString(k2b22, tek2b22);
                        editor.putString(k1b23, tek1b23);
                        editor.putString(k2b23, tek2b23);
                        editor.putString(k1b24, tek1b24);
                        editor.putString(k2b24, tek2b24);
                        editor.putString(k1b25, tek1b25);
                        editor.putString(k2b25, tek2b25);
                        editor.putString(k1b26, tek1b26);
                        editor.putString(k2b26, tek2b26);
                        editor.putString(k1b27, tek1b27);
                        editor.putString(k2b27, tek2b27);
                        editor.putString(k1b28, tek1b28);
                        editor.putString(k2b28, tek2b28);
                        editor.putString(k1b29, tek1b29);
                        editor.putString(k2b29, tek2b29);
                        editor.putString(k1b30, tek1b30);
                        editor.putString(k2b30, tek2b30);

                        editor.putString(k1b31, tek1b31);
                        editor.putString(k2b31, tek2b31);
                        editor.putString(k1b32, tek1b32);
                        editor.putString(k2b32, tek2b32);
                        editor.putString(k1b33, tek1b33);
                        editor.putString(k2b33, tek2b33);
                        editor.commit();

                        Toast.makeText(TabelIsiPercobaan1d.this, "Menyimpan Jawaban", Toast.LENGTH_SHORT).show();
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
