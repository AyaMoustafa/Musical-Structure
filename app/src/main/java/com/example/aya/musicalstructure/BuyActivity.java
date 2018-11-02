package com.example.aya.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        ImageView playNowBtnImage = (ImageView) findViewById(R.id.playNowButton_imageView);
        playNowBtnImage .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BuyActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });
    }
}
