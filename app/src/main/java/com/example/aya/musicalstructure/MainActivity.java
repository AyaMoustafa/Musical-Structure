package com.example.aya.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button findTracksButton = (Button) findViewById(R.id.find_track_button);
        findTracksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent findTracksIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(findTracksIntent);

            }
        });

        Button playListButton = (Button) findViewById(R.id.play_list_button);
        playListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playListIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playListIntent);

            }
        });

        Button favoritesButton = (Button) findViewById(R.id.favorites_button);
        favoritesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent favoritesIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(favoritesIntent);

            }
        });

        Button buyButton = (Button) findViewById(R.id.buy_button);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent paymentIntent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(paymentIntent);

            }
        });





    }
}
