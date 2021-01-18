package com.example.tovanthanhdat_1711060664;

import androidx.annotation.NonNull;

public class Product {
    private int productId;
    private String productName;
    private String productPrice;
    private String productThuongHieu; //Oppo, samsung
    private String productCategory; //Laptop || Android

    public Product(int productId, String productName, String productPrice, String productThuongHieu, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productThuongHieu = productThuongHieu;
        this.productCategory = productCategory;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductThuongHieu() {
        return productThuongHieu;
    }
    public void getProductThuongHieu(String productThuongHieu) {
        this.productThuongHieu = productThuongHieu;
    }

    public String productCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @NonNull
    @Override
    public String toString() {
        return this.productId + " - " + this.productName + " - " + this.productPrice;
    }
}