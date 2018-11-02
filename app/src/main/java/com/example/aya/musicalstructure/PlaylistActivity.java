package com.example.aya.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button playArrow1Button = (Button) findViewById(R.id.playArrow1_button);
        playArrow1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlaylistActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });

        Button playArrow2Button = (Button) findViewById(R.id.playArrow2_button);
        playArrow2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlaylistActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });
        Button playArrow3Button = (Button) findViewById(R.id.playArrow3_button);
        playArrow3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlaylistActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });
    }
}
