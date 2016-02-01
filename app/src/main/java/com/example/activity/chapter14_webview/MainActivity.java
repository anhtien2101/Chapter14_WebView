package com.example.activity.chapter14_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.webview);
//        wv.loadUrl("Http://google.com.vn");
        wv.loadData("<html><body>Hello world!</body></html>","text/html","UTF-8");
    }
}
