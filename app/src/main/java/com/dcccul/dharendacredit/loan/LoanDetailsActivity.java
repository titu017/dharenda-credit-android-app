package com.dcccul.dharendacredit.loan;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.dcccul.dharendacredit.R;

public class LoanDetailsActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    TextView loanName;
    Context context;
    Bundle extra;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_detail);

        webView = findViewById(R.id.webViewId_inLoanDetailsActivity);
        context = LoanDetailsActivity.this;

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

        extra = getIntent().getExtras();

        if (!extra.equals(null)) {

            String pName = extra.getString("LOAN_NAME_KEY");

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

        // back arrow button set up starts here Part 2
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        // back arrow button set up ends here Part 2

        if (item.getItemId()== R.id.noticeItemId){

            Toast.makeText(this, "Notice Clicked", Toast.LENGTH_SHORT).show();

        } else if (item.getItemId()== R.id.noticeItemId) {

            Toast.makeText(this, "Notice Clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}