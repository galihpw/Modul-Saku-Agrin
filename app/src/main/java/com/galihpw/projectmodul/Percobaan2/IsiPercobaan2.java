package com.galihpw.projectmodul.Percobaan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.galihpw.projectmodul.R;

public class IsiPercobaan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_percobaan2);

        //title
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("Percobaan 2\n");

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
        textView5.setText("- Terigu hard flour, kuning telur, garam. \n" +
                "- Margarine/shortening, gula.\n" +
                "- Ragi roti instan, susu bubuk. \n" +
                "- Oven,loyang,kain basah,baskom.");

        //bahan dan alat
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("3) Prosedur Kerja");


        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("• Siapkan 200 gram tepung terigu (hard flour).\n" +
                "• Siapkan ragi roti 1.5 %, kuning telur 1, gula 5%, susu bubuk 6%, margarine atau \n" +
                "shortening 10%, garam 1%,  air 65% .\n" +
                "• Campur  tepung  dengan  gula,  ragi  instan, dan  susu  bubuk  lalu  aduk  rata. \n" +
                "Kemudian masukkan kuning telur.\n" +
                "• Masukkan air sedikit demi sedikit hingga setengah kalis.\n" +
                "• Masukkan  margarine/shortening  dan  garam  lalu  uleni  selama  20  menit  atau \n" +
                "hingga kalis.\n" +
                "• Diamkan adonan selama 30 menit pada suhu ruang dalam kondisi lembab (tutupi \n" +
                "dengan kain basah) dan hangat\n" +
                "• Bagi adonan menjadi beberapa bagian atau bentuk bulatan-bulatan .\n" +
                "• Diamkan 10 menit.\n" +
                "• Giling tipis memanjang, gulung (bentuk adonan)\n" +
                "• Letakkan dalam Loyang yang telah diolesi shortening / margarine.\n" +
                "• Diamkan 30 menit hingga mengembang dalam kondisi setengah tertutup." +
                "• Ukur tinggi adonan roti sebelum dipanggang\n" +
                "• Panggang dalam oven bersuhu 180 C selama 20-40 menit.\n" +
                "• Amati sifat sensori roti dan ukur tinggi roti setelah dipanggang." );

        //teks
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText("Format Pengamatan");

        //image
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.formatpengamatan);

        //tugas
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText("• Susun pembahasan dalam laporan praktikum berdasar pertanyaan berikut ini!\n" +
                "- Apa  yang  dimaksud  dengan  terigu  hard  flour?  Apa  hubungannya  dengan fermentasi dalam pembuatan roti?\n" +
                "- Apa fungsi penambahan ragi dalam pembuatan roti? Apa kandungan dari ragi tersebut?\n" +
                "- Mengapa adonan roti harus didiamkan dalam kondisi lembab dan hangat? Apa kaitannya dengan optimalnya proses fermentasi?\n" +
                "- Apakah  ukuran/  tinggi  adonan  roti  sebelum  dan  setelah  didiamkan(diinkubasi) berbeda? Mengapa?\n" +
                "- Apakah  ukuran/  tinggi  roti  setelah  didiamkan  (diinkubasi) dan  setelah dipanggang berbeda? Mengapa?\n" +
                "- Apa fungsi penambahan margarine, telur dan susu pada pembuatan roti? Apa kaitannya dengan tekstur roti?\n" +
                "- Bagaimana kualitas roti yang baik dan memenuhi standar (SNI)?\n" +
                "- Buat diagram proses pembuatan roti!\n");

        //free space
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setText("\t \n");
    }
}
