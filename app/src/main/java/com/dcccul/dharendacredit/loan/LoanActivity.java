package com.dcccul.dharendacredit.loan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.dcccul.dharendacredit.R;
import com.dcccul.dharendacredit.loan.LoanAdapter;
import com.dcccul.dharendacredit.loan.LoanCollection;
import com.dcccul.dharendacredit.menu.ContactUsActivity;
import com.dcccul.dharendacredit.menu.CulturalAcademyActivity;

public class LoanActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        recyclerView = findViewById(R.id.recyclerviewId_inLoanActivity);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        LoanAdapter loanAdapter = new LoanAdapter(this,LoanCollection.getLoanNames());
        recyclerView.setAdapter(loanAdapter);


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
            Intent intent = new Intent(LoanActivity.this, CulturalAcademyActivity.class);
            startActivity(intent);

        } else if (item.getItemId()== R.id.contactUsItemId) {
            Intent intent = new Intent(LoanActivity.this, ContactUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
