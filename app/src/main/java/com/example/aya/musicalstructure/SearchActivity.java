package com.example.aya.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button playResult1Button = (Button) findViewById(R.id.playresult1_button);
        playResult1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });
        Button playResult2Button = (Button) findViewById(R.id.playresult2_button);
        playResult2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchActivity.this, PlayNowActivity.class);
                startActivity(i);

            }
        });
    }
}
