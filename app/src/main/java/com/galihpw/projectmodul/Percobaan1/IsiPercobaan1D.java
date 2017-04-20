package com.galihpw.projectmodul.Percobaan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.galihpw.projectmodul.R;

public class IsiPercobaan1D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_percobaan1d);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //title
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("Penambahan dalam Berbagai BTP\n");

        //tujuan
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("1) Tujuan");

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Mahasiswa mengetahui pengaruh perendaman dalam berbagai jenis food additive terhadap karakteristik sensori bahan pangan dan mekanismenya.");

        //bahan dan alat
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText("2) Bahan dan Alat");

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("- Apel, Kentang, Minyak.\n" +
                "- Garam NaCl, Asam Sitrat.\n" +
                "- Aquades.\n" +
                "- Natrium Metabisulfit\n" +
                "- Wajan, pisau, talenan.");

        //prosedur kerja
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("3) Prosedur Kerja");

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("• Siapkan 4 larutan perendam, yaitu: air; larutan garam NaCl 3%; Natrium metabisulfit (aq) 0.3%; asam sitrat (aq) 3%; \n" +
                "• Siapkan sampel (apel, kentang) yang akan diuji (@250g).\n" +
                "• Bagi masing-masing sampel menjadi 5 bagian.\n" +
                "• Lakukan  peeling, slicing terhadap semua sampel dan langsung  masukkan kedalam larutan perendam (air, Na metabisulfit, NaCl, asam sitrat).\n" +
                "• Rendam semua sampel dalam larutan perendam selama 15 menit.\n" +
                "• Tiriskan semua sampel dan amati.\n" +
                "• Lakukan frying terhadap semua sampel.\n" +
                "• Amati karakter sensori semua sampel.\n" +
                "• Catat dalam form pengamatan berikut:");

        //image
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.penambahan);

        //free space for landscape mode
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText("\t");
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