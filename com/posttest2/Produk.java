/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.posttest2;

/**
 *
 * @author USER
 */
public class Produk {
    private String namaProduk;
    private double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public final String getNamaProduk() {
        return namaProduk;
    }

    public final double getHarga() {
        return harga;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
}
