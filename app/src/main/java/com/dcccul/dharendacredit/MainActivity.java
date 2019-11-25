package com.dcccul.dharendacredit;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.dcccul.dharendacredit.boardofdirectors.BoardofDirectorsActivity;
import com.dcccul.dharendacredit.founder.FounderActivity;
import com.dcccul.dharendacredit.history.HistoryActivity;
import com.dcccul.dharendacredit.loan.LoanActivity;
import com.dcccul.dharendacredit.menu.ContactUsActivity;
import com.dcccul.dharendacredit.menu.CulturalAcademyActivity;
import com.dcccul.dharendacredit.product.ProductActivity;
import com.dcccul.dharendacredit.staff.StaffActivity;

public class MainActivity extends AppCompatActivity {

    ImageView founderIV_inMainActivity;
    Button loanBtn_inMainActivity;
    Button productBtn_inMainActivity;
    Button boardDirectorsBtn_inMainActivity;
    Button staffBtn_inMainActivity;
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
        staffBtn_inMainActivity = findViewById(R.id.stuffBtn_inMainActivity);
        historyBtn_inMainActivity = findViewById(R.id.historyBtn_inMainActivity);
        //  <<<<    Initializtion ends here








        productBtn_inMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        loanBtn_inMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoanActivity.class);
                startActivity(intent);
            }
        });

        boardDirectorsBtn_inMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BoardofDirectorsActivity.class);
                startActivity(intent);
            }
        });

        staffBtn_inMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StaffActivity.class);
                startActivity(intent);
            }
        });

        historyBtn_inMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        founderIV_inMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FounderActivity.class);
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
        if (item.getItemId()== R.id.culturalAcademyItemId){
            Intent intent = new Intent(MainActivity.this, CulturalAcademyActivity.class);
            startActivity(intent);

        } else if (item.getItemId()== R.id.contactUsItemId) {
            Intent intent = new Intent(MainActivity.this, ContactUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
