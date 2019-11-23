package com.dcccul.dharendacredit.product;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dcccul.dharendacredit.CustomItemClickListener;
import com.dcccul.dharendacredit.R;

import java.util.List;


    public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

        Context context;
        List<ProductName> productNames;

        public ProductAdapter(Context context, List<ProductName> productNames) {
            this.context = context;
            this.productNames = productNames;
        }

        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            View view = LayoutInflater.from(context).inflate(R.layout.product_model, viewGroup, false);

            ProductViewHolder productHolder = new ProductViewHolder(view);


            return productHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder productHolder, int i) {
            final String pName = productNames.get(i).getProductName();

            //Bind Data
            productHolder.productNameTv.setText(pName);

            productHolder.setCustomItemClickListener(new CustomItemClickListener() {
                @Override
                public void onItemClick(int pos) {
                    openProductDetailsActivity(pName);
                }
            });

        }

        @Override
        public int getItemCount() {
            return productNames.size();
        }

        private void openProductDetailsActivity(String pName) {
            Intent intent = new Intent(context, ProductDetailsActivity.class);

            //pack Data to Send

            intent.putExtra("PRODUCT_NAME_KEY", pName);

            //Open Activity
            context.startActivity(intent);
        }
    }

