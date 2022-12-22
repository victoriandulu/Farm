package com.example.login.Models;

public class ProductsModelWrk {
    int ProdImage;
    String ProdName;

    public int getProdImage() {
        return ProdImage;
    }

    public String getProdName() {
        return ProdName;
    }

    public ProductsModelWrk(int prodImage, String prodName) {

    }

    public void setProdImage(int prodImage) {
        ProdImage = prodImage;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }
}

