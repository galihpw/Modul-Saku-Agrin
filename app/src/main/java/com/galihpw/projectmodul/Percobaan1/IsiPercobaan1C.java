package com.galihpw.projectmodul.Percobaan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.galihpw.projectmodul.R;

public class IsiPercobaan1C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_percobaan1c);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //title
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("Uji Formalin\n");

        //tujuan
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("1) Tujuan");

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Mahasiswa mengetahui mekanisme pengujian formalin pada beberapa sampel produk pangan dan dapat mengidentifikasi produk pangan yang mengandung formalin.");

        //bahan dan alat
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText("2) Bahan dan Alat");

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("- Baso, siomay, tahu mentah.\n" +
                "- Lontong, lemper, mie basah.\n" +
                "- Kalium Permanganat (KMNO4).\n" +
                "- Cawan petri\n" +
                "- Pipet tetes\n" +
                "- Lumpang alu/pemarut\n" +
                "- Gelas ukur, beaker glass\n" +
                "- Pisau, sendok"
                );

        //prosedur kerja
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("3) Prosedur Kerja");

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("• Larutkan 2 gram  serbuk KMNO4 dalam 20 ml aquades hingga berwarna merah jambu seulas.\n" +
                "• Masukkan larutan KMNO4 dalam cawan.\n" +
                "• Masukkan 5 gram sampel makanan (halus) yang akan diuji ke dalam cawan.\n" +
                "• Amati perubahan yang terjadi (hingga 30 menit).\n" +
                "• Jika warna merah jambu memudar (berkurang), diduga sampel tersebut mengandung komponen formalin.\n" +
                "• Catat dalam form pengamatan berikut.\n");

        //image
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.ujiformalin);

        //free space for landscape mode
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText(" ");
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
