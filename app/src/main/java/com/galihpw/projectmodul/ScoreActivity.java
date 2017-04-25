package com.galihpw.projectmodul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.galihpw.projectmodul.Kuis.Hasil;

import java.util.Timer;
import java.util.TimerTask;

public class ScoreActivity extends AppCompatActivity {

    int i = 0;
    TextView tScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        tScore = (TextView) findViewById(R.id.tScore);

        final Timer T=new Timer();
        T.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        tScore.setText(""+i);

                        if(i == Hasil.score){
                            T.cancel();
                        }

                        i++;
                    }
                });
            }
        }, 0, 20);
    }
}
