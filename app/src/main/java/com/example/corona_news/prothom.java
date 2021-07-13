package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class prothom extends AppCompatActivity {

    WebView prt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prothom);

        prt = (WebView)findViewById(R.id.pr);
        prt.loadUrl("https://www.prothomalo.com/");
    }
}
