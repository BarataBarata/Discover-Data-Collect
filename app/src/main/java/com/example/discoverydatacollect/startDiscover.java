package com.example.discoverydatacollect;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class startDiscover extends AppCompatActivity {
    Handler handler=new Handler();
    ProgressBar progressBar;
    TextView textCont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_discover2);
        progressBar=findViewById(R.id.progress);
        textCont=findViewById(R.id.cont);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    startProgress();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        thread.start();

    }
    private void startProgress() throws InterruptedException {
        for(int i=1;i<=100;i++){

            Thread.sleep(30);
            progressBar.setProgress(i);
            int finalI = i;
            handler.post(new Runnable() {
                @Override
                public void run() {
                    textCont.setText(""+ finalI +"%");
                }
            });
        }
            startActivity(new Intent(startDiscover.this,Discover_Login.class));

    }

}