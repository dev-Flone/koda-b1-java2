package com.koda;

public class Product {
    // String productCode;
    // String name;
    // int price;
    // int stock;

    // // Constructor
    // public Product(String productCode, String name, int price, int stock) {
    // this.productCode = productCode;
    // this.name = name;
    // this.price = price;
    // this.stock = stock;
    // };

    // public void showInfo() {
    // System.out.println("Product Code: " + productCode);
    // System.out.println("Name: " + name);
    // System.out.println("Price: Rp. " + price);
    // System.out.println("Stock: " + stock);
    // }

    // public void addStock(int quantity) {
    // stock += quantity;
    // }

    // Menggabungkan 2 class dalam 1 file

    // private String productName;
    // private Category produkCategory;

    // public Product(String productName, Category produkCategory) {
    // this.productName = productName;
    // this.produkCategory = produkCategory;
    // }

    // public void showProductInfo() {
    // System.out.println("Produk: " + productName);
    // System.out.println("Kategori: " + produkCategory.get);
    // }

    private String productCode;
    private String name;
    private int price;
    private int stock;

    public Product(String productCode, String name, int price, int stock) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void showInfo() {
        System.out.println("Product: " + productCode);
        System.out.println("Name: " + name);
        System.out.println("Price: Rp." + price);
        System.out.println("Stock: " + stock);
    }

    public void addStock(int quantity) {
        stock += quantity;
    }
}
