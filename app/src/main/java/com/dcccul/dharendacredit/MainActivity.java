package com.dcccul.dharendacredit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.dcccul.dharendacredit.product.ProductActivity;

public class MainActivity extends AppCompatActivity {

    ImageView founderIV_inMainActivity;
    Button loanBtn_inMainActivity;
    Button productBtn_inMainActivity;
    Button boardDirectorsBtn_inMainActivity;
    Button stuffBtn_inMainActivity;
    Button historyBtn_inMainActivity;


    android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  >>>>    Initializtion starts here
        founderIV_inMainActivity = findViewById(R.id.founderIV_inMainActivity);
        loanBtn_inMainActivity = findViewById(R.id.loanBtn_inMainActivity);
        productBtn_inMainActivity = findViewById(R.id.productBtn_inMainActivity);
        boardDirectorsBtn_inMainActivity = findViewById(R.id.boardDirectorsBtn_inMainActivity);
        stuffBtn_inMainActivity = findViewById(R.id.stuffBtn_inMainActivity);
        historyBtn_inMainActivity = findViewById(R.id.historyBtn_inMainActivity);
        //  <<<<    Initializtion ends here

        productBtn_inMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });



       //   >>>>    toolbar section starts here
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        toolbar.setPadding(0,15,0,0);
        toolbar.setContentInsetsAbsolute(0,0);

        //  <<<<    toolbar section ends here

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
