package com.koda;

public class Main {
    public static void main(String[] args) {
        Product ebook = new DigitalProduct("DID-001", "ebook", 50000);
        Product keyboard = new PhysicalProduct("PHY-001", "keyboard", 500000, 10);
    }
}
