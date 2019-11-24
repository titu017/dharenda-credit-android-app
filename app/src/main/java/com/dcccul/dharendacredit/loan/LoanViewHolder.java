package com.dcccul.dharendacredit.loan;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dcccul.dharendacredit.CustomItemClickListener;
import com.dcccul.dharendacredit.R;

public class LoanViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView loanNameTv;

    CustomItemClickListener customItemClickListener;




    public LoanViewHolder(@NonNull View itemView) {
        super(itemView);

        loanNameTv = itemView.findViewById(R.id.loanNameTv_inLoanModel);

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
