package com.galihpw.projectmodul.Percobaan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.galihpw.projectmodul.Percobaan2.IsiPercobaan2;
import com.galihpw.projectmodul.Percobaan2.TabelIsiPercobaan2;
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

        //image
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ip1d);

        //kosong
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("\n");

        //free space for landscape mode
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText("\t");

        //Percobaan 3 (Tabel ketiga)
        Button bForPeng = (Button) findViewById(R.id.bForPeng);
        //format pengamatan
        bForPeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiPercobaan1D.this,TabelIsiPercobaan1d.class);
                startActivity(intent);
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