package com.dcccul.dharendacredit.product;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import com.dcccul.dharendacredit.R;

public class ProductDetailsActivity extends AppCompatActivity {
    TextView productName;
    Context context;
    Bundle extra;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        webView = findViewById(R.id.webViewId_inProductDetailsActivity);
        context = ProductDetailsActivity.this;

        extra = getIntent().getExtras();

        if (!extra.equals(null)) {

            String pName = extra.getString("PRODUCT_NAME_KEY");

//            productName.setText(pName);

            String url = "file:///android_asset/" + pName + ".html";
            webView.loadUrl(url);

            WebSettings webSettings = webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(false);
            webSettings.setJavaScriptEnabled(true);

        }
    }
}
