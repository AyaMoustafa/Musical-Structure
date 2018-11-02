package com.example.aya.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        Button playFav1Button = (Button) findViewById(R.id.playfav1_button);
        playFav1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FavoriteActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });

        Button playFav2Button = (Button) findViewById(R.id.playfav2_button);
        playFav2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FavoriteActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });

        Button playFav3Button = (Button) findViewById(R.id.playfav3_button);
        playFav3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FavoriteActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });


    }
}
