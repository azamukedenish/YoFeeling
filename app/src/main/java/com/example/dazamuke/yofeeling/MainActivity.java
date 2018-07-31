package com.example.dazamuke.yofeeling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


private WebView mywebview;
WebSettings webviewsetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView)findViewById(R.id.myweb);
        webviewsetting = mywebview.getSettings();
        webviewsetting.setJavaScriptEnabled(true);

        mywebview.loadUrl("your url for the responsive website ");
        mywebview.setWebViewClient(new WebViewClient());


    }

    @Override
    public void onBackPressed() {
        if(mywebview.canGoBack()){
            mywebview.goBack();
        }
        else {


            super.onBackPressed();
        }
    }
}
