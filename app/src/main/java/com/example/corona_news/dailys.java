package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dailys extends AppCompatActivity {

    WebView dst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailys);

        dst = (WebView)findViewById(R.id.ds);
        dst.loadUrl("https://www.thedailystar.net/");
    }
}
