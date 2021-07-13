package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class unicef extends AppCompatActivity {

    WebView unc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unicef);

        unc = (WebView)findViewById(R.id.uni);
        unc.loadUrl("https://www.unicef.org/coronavirus/covid-19");
    }
}
