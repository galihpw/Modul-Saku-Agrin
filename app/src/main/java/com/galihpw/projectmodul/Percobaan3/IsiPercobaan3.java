package com.galihpw.projectmodul.Percobaan3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.galihpw.projectmodul.R;

public class IsiPercobaan3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_percobaan3);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //title
      /*  TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("Emulsifikasi pada Pembuatan Mayonnaise\n");
*/
        //tujuan
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("1) Tujuan");

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("a) Mahasiswa mengetahui aplikasi emulsifikasi pada pembuatan mayonnaise.\n" +
                "b) Mahasiswa memiliki keterampilan dalam mengaplikasikan emulsifikasi pada pembuatan mayonnaise.\n" +
                "c) Mahasiswa  mampu menganalisis faktor-faktor yang mempengaruhi emulsifikasi pada pembuatan mayonnaise.");

        //bahan dan alat
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText("2) Bahan dan Alat ");

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("- Telur, minyak jagung, jeruk nipis/lemon.\n" +
                "- Garam, merica.\n" +
                "- Merica, gelas ukur, mangkok.\n" +
                "- Neraca, sendok/garpu, wadah.\n" +
                "- Mixer/pengocok telur.");

        //bahan dan alat
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("3) Prosedur Kerja");

        //prosedur kerja

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ip3);

        //kosong
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("\n");

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
