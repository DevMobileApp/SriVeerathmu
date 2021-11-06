package com.example.sriveerathmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize the Mobile Ads SDK
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
//                Toast.makeText(MainActivity.this, "ADS sucesfull ", Toast.LENGTH_SHORT).show();
            }
        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }

    public void Notice(View view) {
        startActivity(new Intent(this , Notice.class)
                .putExtra("urllink", "https://sites.google.com/view/notice-veerathmu/home"));
    }

    public void BankDetail(View view) {
        startActivity(new Intent(this , Notice.class)
                .putExtra("urllink", "https://sites.google.com/view/bankdetailveerathmu/home"));
    }

    public void Contact_veerathmu(View view) {
        startActivity(new Intent(this , Notice.class)
                .putExtra("urllink",  "https://sites.google.com/view/contactveerathmu/home"));
    }



    public void TemplePhotos(View view) {
        startActivity(new Intent(this, TemplePhotos.class));
    }

    public void ImportantNew(View view) {
        startActivity(new Intent(this , Notice.class)
                .putExtra("urllink", "https://sites.google.com/view/importantnewsveerathmu/home"));

    }


    public void googlemap(View view)
    {
        startActivity(new Intent(this, TempleRoute.class));
    }

    public void santhanamurithi_em(View view) {
        startActivity(new Intent(this , Notice.class)
                .putExtra("urllink", "https://sites.google.com/view/kovil2/home"));

    }
}