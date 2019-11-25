package com.dcccul.dharendacredit.product;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    public static List<ProductName> getProductNames(){
        List<ProductName> productNameList = new ArrayList<>();
        ProductName productName = null;

        productName = new ProductName();
        productName.setProductName("General Loan");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("House Loan");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Business Loan");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Education Loan");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Car Scheme");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Child Savings");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Christmas Scheme");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Dharenda Smart Credit");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Education Savings");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("FDR Scheme");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Health Care");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Kisti Niyomito Koron");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Late Member");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Nari Prokolpo DPS Chart");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Pension Scheme");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Savings Deposit");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Shuddikoron Loan");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("Womans Savings");
        productNameList.add(productName);

        return productNameList;
    }
}
