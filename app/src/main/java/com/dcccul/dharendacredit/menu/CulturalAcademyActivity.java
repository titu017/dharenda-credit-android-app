package com.dcccul.dharendacredit.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import com.dcccul.dharendacredit.R;

public class CulturalAcademyActivity extends AppCompatActivity {

    WebView webView;
    android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural_academy);

        webView = findViewById(R.id.webViewId_inCulturalActivity);

        //   >>>>    toolbar section starts here
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        // back arrow button set up starts here Part 1
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // back arrow button set up ends here Part 1

        toolbar.setPadding(0,15,0,0);
        toolbar.setContentInsetsAbsolute(0,0);

        //  <<<<    toolbar section ends here

        String fileName = "file:///android_asset/Cultural Academy.html";
        webView.loadUrl(fileName);

        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // back arrow button set up starts here Part 2
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        // back arrow button set up ends here Part 2

        if (item.getItemId()== R.id.culturalAcademyItemId){
            Intent intent = new Intent(CulturalAcademyActivity.this, CulturalAcademyActivity.class);
            startActivity(intent);

        } else if (item.getItemId()== R.id.contactUsItemId) {
            Intent intent = new Intent(CulturalAcademyActivity.this, ContactUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
