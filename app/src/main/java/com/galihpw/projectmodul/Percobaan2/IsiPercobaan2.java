package com.galihpw.projectmodul.Percobaan2;

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

public class IsiPercobaan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_percobaan2);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //tujuan
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("1) Tujuan");

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("a) Mahasiswa mengetahui aplikasi teknologi fermentasi pada produk olahan serealia dalam pembuatan roti.\n" +
                "b) Mahasiswa memiliki keterampilan dalam mengaplikasikan fermentasi ada pembuatan roti.\n" +
                "c) Mahasiswa  mampu menganalisis faktor-faktor yang mempengaruhi keberhasilan fermentasi pada pembuatan roti.");

        //bahan dan alat
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText("2) Bahan dan Alat");

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("- Terigu hard flour, kuning telur, garam.\n" +
                "- Margarine/shortening, gula.\n" +
                "- Ragi roti instan, susu bubuk.\n" +
                "- Oven, loyang, kain basah, baskom.");



        //gambar
        ImageView imageView0 = (ImageView) findViewById(R.id.imageView0);
        Glide.with(this).load(R.drawable.t2).into(imageView0);

        //bahan dan alat
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("3) Prosedur Kerja");

        //prosedur kerja

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.ip2).into(imageView);

        //kosong
//        TextView textView7 = (TextView) findViewById(R.id.textView7);
//        textView7.setText("\n");

        //tugas
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText("• Susun pembahasan dalam laporan praktikum berdasar pertanyaan berikut ini!\n" +
                "- Apa yang dimaksud dengan terigu hard flour? Apa hubungannya dengan fermentasi dalam pembuatan roti?\n" +
                "- Apa fungsi penambahan ragi dalam pembuatan roti? Apa kandungan dari ragi tersebut?\n" +
                "- Mengapa adonan roti harus didiamkan dalam kondisi lembab dan hangat? Apa kaitannya dengan optimalnya proses fermentasi?\n" +
                "- Apakah  ukuran/ tinggi adonan roti sebelum dan setelah didiamkan(diinkubasi) berbeda? Mengapa?\n" +
                "- Apakah  ukuran/ tinggi roti setelah didiamkan (diinkubasi) dan setelah dipanggang berbeda? Mengapa?\n" +
                "- Apa fungsi penambahan margarine, telur dan susu pada pembuatan roti? Apa kaitannya dengan tekstur roti?\n" +
                "- Bagaimana kualitas roti yang baik dan memenuhi standar (SNI)?\n" +
                "- Buat diagram proses pembuatan roti!");

        //free space
     /*   TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setText(" ");*/

        //Percobaan 2 (Tabel keempat)
        Button bForPeng = (Button) findViewById(R.id.bForPeng);
        //format pengamatan
        bForPeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IsiPercobaan2.this,TabelIsiPercobaan2.class);
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
