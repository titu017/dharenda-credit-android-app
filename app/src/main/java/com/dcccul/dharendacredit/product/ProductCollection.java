package com.dcccul.dharendacredit.product;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    public static List<ProductName> getProductNames(){
        List<ProductName> productNameList = new ArrayList<>();
        ProductName productName = null;

        productName = new ProductName();
        productName.setProductName("Car Scheme");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("ABC");
        productNameList.add(productName);

        productName = new ProductName();
        productName.setProductName("DEF");
        productNameList.add(productName);

        return productNameList;
    }
}
