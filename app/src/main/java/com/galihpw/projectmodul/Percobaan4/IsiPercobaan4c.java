package com.galihpw.projectmodul.Percobaan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.galihpw.projectmodul.R;

public class IsiPercobaan4c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_percobaan4c);

        //title
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("Pembuatan Permen Jelly");

        //tujuan

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("1) Tujuan");

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("• Mahasiswa memahami teknologi confectionery dan aplikasinya dalam pembuatan berbagai jenis candy, memahami faktor yang mempengaruhi pembuatan candy.\n" +
                "• Mahasiswa memahami peran dan fungsi bahan-bahan / komponen dalam pembuatan candy terhadap tekstur dan sifat sensori lainnya pada candy.");

        //bahan dan alat

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText("2) Bahan dan Alat");

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("- Sukrosa, glukosa (corn syrup atau dapat diganti dengan gula invert.)\n" +
                "- Gelatin bubuk, asam sitrat.\n" +
                "- Gula tepung, maizena. \n" +
                "- Pewarna, essens, perasa, vanili.\n" +
                "- Putih telur, aquades.\n" +
                "- Panci, Thermometer 200 C.\n" +
                "- Gliserin, garam.\n" +
                "- Asam tartarat atau jus lemon.\n" +
                "- Kertas roti, wadah.\n" +
                "- Kompor, pengaduk, cetakan loyang.\n " +
                "- Stik loli, neraca, spatula.");

        //prosedur kerja gula invert
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("3) Prosedur Kerja");

        //image
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ip4c);

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
