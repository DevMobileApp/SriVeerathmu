package com.example.sriveerathmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        img1 = findViewById(R.id.img1);

//        getActionBar().hide();
        getSupportActionBar().hide();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                textChanger.setText("After some delay, it changed to new text");


                next2min();
            }
        }, 3000);

    }

    public void next2min()
    {


        String uri = "@drawable/fafa";  // where myresource (without the extension) is the file

        int imageResource = getResources().getIdentifier(uri, null, getPackageName());

        Drawable res = getResources().getDrawable(imageResource);
        img1.setImageDrawable(res);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                textChanger.setText("After some delay, it changed to new text");

//                startActivity(new Intent(Splash.this , MainActivity.class));
//                finish();

                startActivity(new Intent(Splash.this , Notice.class)
                        .putExtra("urllink", "https://jumpshare.com/v/uaaBmBf3k5vmwOVPQMtk"));
                finish();



            }
        }, 3000);

    }
}