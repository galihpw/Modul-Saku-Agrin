package com.galihpw.projectmodul;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.ImageView;

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
