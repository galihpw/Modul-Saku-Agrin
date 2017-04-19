package com.galihpw.projectmodul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IsiMenu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_menu1);

        //title
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("UJI BORAKS SEDERHANA\n" +
                "Menggunakan Ekstrak Kunyit");

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
                "\n" +
                "- Cawan petri, Gelas ukur.\n" +
                "- Pipet tetes, Kain putih/kertas saring, pisau, sendok.\n" +
                "- Lumpang alu/pemarut, kertas saring.\n" +
                "- Spatula, krus (cawan penguap).");

        //prosedur kerja

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("3) Prosedur Kerja");

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText(" • Kupas kunyit, kemudian haluskan (tumbuk atau parut) 50 gram.\n" +
                "• Tambahkan aquades 50 ml.\n" +
                "• Ekstrak larutan kunyit menggunakan kain putih atau kertas saring hingga diperoleh filtrate kunyit.\n" +
                "• Buat larutan boraks 20% dengan cara mencampurkan 5 g boraks ke dalam 25 ml aquades.\n" +
                "• Masukkan 10 ml filtrate kunyit ke dalam 10 ml larutan boraks.\n" +
                "• Aduk kedua larutan hingga homogen dan  berwarna merah kecoklatan. Jadikan campuran larutan tersebut sebagai indicator.\n" +
                "• Haluskan sampel makanan yang akan diuji.\n" +
                "• Masukkan 10 gram sampel uji ke dalam cawan petri.\n" +
                "• Tambahkan 15 tetes filtrate kunyit ke dalam sampel uji menggunakan pipet tetes.\n" +
                "• Amati dan catat perubahan warna yang terjadi.\n" +
                "• Sampel makanan yang berubah menjadi merah kecoklatan setelah ditetesi filtrate kunyit diduga mengandung boraks.");
    }
}
