package com.dcccul.dharendacredit.product;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.dcccul.dharendacredit.R;

public class ProductDetailsActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
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

        //   >>>>    toolbar section starts here
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        toolbar.setPadding(0,15,0,0);
        toolbar.setContentInsetsAbsolute(0,0);

        //  <<<<    toolbar section ends here

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== R.id.noticeItemId){

            Toast.makeText(this, "Notice Clicked", Toast.LENGTH_SHORT).show();

        } else if (item.getItemId()== R.id.noticeItemId) {

            Toast.makeText(this, "Notice Clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
