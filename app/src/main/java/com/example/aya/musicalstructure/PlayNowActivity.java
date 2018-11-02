package com.example.aya.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlayNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_now);


        ImageView playlistBtnImageview = (ImageView) findViewById(R.id.playListButton_imageView);
        playlistBtnImageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayNowActivity.this, PlaylistActivity.class);
                startActivity(i);

            }
        });
    }
}
