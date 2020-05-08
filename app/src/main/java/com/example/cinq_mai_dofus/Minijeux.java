package com.example.cinq_mai_dofus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Minijeux extends AppCompatActivity {

    private TextView bouftout_tués;
    private ImageView hache;

    private int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minijeux);


        this.bouftout_tués = (TextView) findViewById(R.id.bouftout_tués);
        this.hache = (ImageView) findViewById(R.id.hache);

        hache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                bouftout_tués.setText("Bouftouts tués : " + clicks);
            }
        });
    }
}
