package com.example.cinq_mai_dofus.presentation.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cinq_mai_dofus.R;
import com.example.cinq_mai_dofus.presentation.model.Minijeux;
import com.example.cinq_mai_dofus.presentation.model.Sound;
import com.example.cinq_mai_dofus.presentation.view.ArmeActivity;

public class MainActivity extends AppCompatActivity {
    private Button play;

    private Button armeButton;

    private Button sound;

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


        this.sound = (Button) findViewById(R.id.sound);

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent (getApplicationContext(), Sound.class);
                startActivity(otherActivity);
                finish();

            }
        });
    }
}
