package com.galihpw.projectmodul;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //image
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        Glide.with(this).load(R.drawable.upilogo).into(imageView2);

        //image
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        Glide.with(this).load(R.drawable.foto2).into(imageView6);

        //teks
        String tempString="Copyright";
        TextView teks = (TextView) findViewById(R.id.teks);
        SpannableString spanString = new SpannableString(tempString);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
        teks.setText(Html.fromHtml("MODUL PRAKTIKUM BERBASIS <i>ANDROID</i> \n TEKNOLOGI PENGOLAHAN PANGAN \n MERUPAKAN HASIL PENGEMBANGAN MODUL PRAKTIKUM \n TEKNOLOGI PENGOLAHAN PANGAN \n DIKEMBANGKAN UNTUK MEMPEROLEH GELAR SARJANA"));
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();
        }
        return false;
    }
}
