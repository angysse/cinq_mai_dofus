package com.example.cinq_mai_dofus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button play;

    private Button armeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        armeButton = findViewById(R.id.button_weapon);


        armeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(), ArmeActivity.class);
                startActivity(i);
                finish();
            }
        });



        this.play = (Button) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent (getApplicationContext(), Minijeux.class);
                startActivity(otherActivity);
                finish();

            }
        });
    }
}
