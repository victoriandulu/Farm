package com.example.login.Models;

public class ProductsModel {
    int ProdImage;
    String ProdName;

    public ProductsModel(int prodImage, String prodName) {
        ProdImage = prodImage;
        ProdName = prodName;
    }

    public int getProdImage() {
        return ProdImage;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdImage(int prodImage) {
        ProdImage = prodImage;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }
}
