package com.dcccul.dharendacredit.loan;

import com.dcccul.dharendacredit.loan.LoanName;

import java.util.ArrayList;
import java.util.List;

public class LoanCollection {
    public static List<LoanName> getLoanNames(){
        List<LoanName> loanNameList = new ArrayList<>();
        LoanName loanName = null;

        loanName = new LoanName();
        loanName.setLoanName("General Loan");
        loanNameList.add(loanName);

        loanName = new LoanName();
        loanName.setLoanName("House Loan");
        loanNameList.add(loanName);

        loanName = new LoanName();
        loanName.setLoanName("Business Loan");
        loanNameList.add(loanName);

        loanName = new LoanName();
        loanName.setLoanName("Education Loan");
        loanNameList.add(loanName);





        return loanNameList;
    }
}
