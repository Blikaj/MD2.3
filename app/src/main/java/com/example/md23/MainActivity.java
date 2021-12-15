package com.example.md23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button banana, unbanana;
    TextView banana_text;
    ImageView banana_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banana = (Button) findViewById(R.id.btnbanana);
        unbanana = (Button) findViewById(R.id.btnantibanana);
        banana_text = (TextView) findViewById(R.id.textbanana);
        banana_img = (ImageView) findViewById(R.id.imgbanana);
        banana_img.setVisibility(View.INVISIBLE);
        banana_text.setVisibility(View.INVISIBLE);
        unbanana.setVisibility(View.INVISIBLE);
    }

    public void magicBanana(View v) throws InterruptedException {
        banana_img.setVisibility(View.VISIBLE);
        banana_text.setVisibility(View.VISIBLE);
        unbanana.setVisibility(View.VISIBLE);
        banana.setVisibility(View.INVISIBLE);
    }

    public void unmagicBanana(View v) throws InterruptedException {
        banana_img.setVisibility(View.INVISIBLE);
        banana_text.setVisibility(View.INVISIBLE);
        banana.setVisibility(View.VISIBLE);
        unbanana.setVisibility(View.INVISIBLE);
    }
}