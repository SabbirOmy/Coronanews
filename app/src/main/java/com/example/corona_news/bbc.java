package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class bbc extends AppCompatActivity {

    WebView bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbc);

        bb = (WebView)findViewById(R.id.bbc);
        bb.loadUrl("https://www.bbc.com/news/coronavirus");
    }
}
