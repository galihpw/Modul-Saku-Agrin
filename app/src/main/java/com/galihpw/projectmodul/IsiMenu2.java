package com.galihpw.projectmodul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class IsiMenu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_menu2);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //title
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("UJI NYALA BORAKS** (optional) ");

        //konten
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("• Timbang sampel makanan yang akan diuji sebanyak 5 gram.\n" +
                "• Bakar sampel tersebut sampai terbentuk arang\n" +
                "• Hancurkan (gerus) arang tersebut hingga halus.\n" +
                "• Masukkan serbuk tersebut ke dalam krus(cawan penguap)\n" +
                "• Tambahkan 10 tetes H2SO4 pekat dan 2 ml methanol ke dalam cawan.\n" +
                "• Uap yang terjadi segera dibakar.\n" +
                "• Amati nyala api yang timbul. (Nyala api yang timbul akan berwarna hijau atau biru jika mengandung boraks).\n" +
                "• Catat dalam form pengamatan berikut:");

        //image
        //

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
