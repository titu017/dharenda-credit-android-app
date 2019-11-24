package com.dcccul.dharendacredit.loan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dcccul.dharendacredit.CustomItemClickListener;
import com.dcccul.dharendacredit.R;
import com.dcccul.dharendacredit.loan.LoanDetailsActivity;
import com.dcccul.dharendacredit.loan.LoanName;
import com.dcccul.dharendacredit.loan.LoanViewHolder;

import java.util.List;


public class LoanAdapter extends RecyclerView.Adapter<LoanViewHolder> {

    Context context;
    List<LoanName> loanNames;

    public LoanAdapter(Context context, List<LoanName> loanNames) {
        this.context = context;
        this.loanNames = loanNames;
    }

    @NonNull
    @Override
    public LoanViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.loan_model, viewGroup, false);

        LoanViewHolder loanHolder = new LoanViewHolder(view);


        return loanHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LoanViewHolder loanHolder, int i) {
        final String pName = loanNames.get(i).getLoanName();

        //Bind Data
        loanHolder.loanNameTv.setText(pName);

        loanHolder.setCustomItemClickListener(new CustomItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openLoanDetailsActivity(pName);
            }
        });

    }

    @Override
    public int getItemCount() {
        return loanNames.size();
    }

    private void openLoanDetailsActivity(String pName) {
        Intent intent = new Intent(context, LoanDetailsActivity.class);

        //pack Data to Send

        intent.putExtra("LOAN_NAME_KEY", pName);

        //Open Activity
        context.startActivity(intent);
    }
}

