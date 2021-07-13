package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class who extends AppCompatActivity {

    WebView wh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);

        wh = (WebView)findViewById(R.id.who);
        wh.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019");
    }
}
