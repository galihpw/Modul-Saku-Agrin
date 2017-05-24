package com.galihpw.projectmodul.Percobaan1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.galihpw.projectmodul.R;

public class IsiPercobaan1B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_percobaan1b);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //tujuan

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("1) Tujuan");

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Mahasiswa mengetahui mekanisme pengujian boraks pada beberapa sampel produk pangan dan dapat mengidentifikasi produk pangan yang mengandung boraks.");

        //bahan dan alat

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText("2) Bahan dan Alat");

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("- Baso, siomay, tahu mentah.\n" +
                "- Lontong, lemper, mie basah.\n" +
                "- Kunyit, aquades.\n" +
                "- Methanol, H2SO4.\n" +
                "- Cawan petri, Gelas ukur.\n" +
                "- Pipet tetes, Kain putih/kertas saring, pisau, sendok.\n" +
                "- Lumpang alu/pemarut, kertas saring.\n" +
                "- Spatula, krus (cawan penguap).");


        //gambar
        ImageView imageView0 = (ImageView) findViewById(R.id.imageView0);
        Glide.with(this).load(R.drawable.t1b).into(imageView0);

        //title
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("3) Prosedur Kerja");

        //image
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.ip1b).into(imageView);

        //kosong
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("\n");

       //TABEL

        //free space for landscape mode
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText("\n");

        //Percobaan 1 (Tabel pertama)
        Button bForPeng = (Button) findViewById(R.id.bForPeng);

        //format pengamatan
        bForPeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiPercobaan1B.this,TabelIsiPercobaan1b.class);
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
