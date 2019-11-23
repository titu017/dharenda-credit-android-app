package com.dcccul.dharendacredit.product;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dcccul.dharendacredit.CustomItemClickListener;
import com.dcccul.dharendacredit.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView productNameTv;

    CustomItemClickListener customItemClickListener;




    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        productNameTv = itemView.findViewById(R.id.productNameTv_inProductModel);

        itemView.setOnClickListener(this);
    }

    public void setCustomItemClickListener(CustomItemClickListener customItemClickListener){
        this.customItemClickListener = customItemClickListener;
    }

    @Override
    public void onClick(View v) {
        this.customItemClickListener.onItemClick(this.getLayoutPosition());
    }
}
