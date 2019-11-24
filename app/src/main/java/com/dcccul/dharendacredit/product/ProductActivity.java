package com.dcccul.dharendacredit.product;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dcccul.dharendacredit.R;

public class ProductActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        recyclerView = findViewById(R.id.recyclerviewId_inProductActivity);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ProductAdapter productAdapter = new ProductAdapter(this,ProductCollection.getProductNames());
        recyclerView.setAdapter(productAdapter);
    }
}
