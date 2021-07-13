package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class cobd extends AppCompatActivity {

    WebView bc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobd);

        bc = (WebView)findViewById(R.id.coro);
        bc.loadUrl("https://corona.gov.bd/");
    }
}
