/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penyediaan;

/**
 *
 * @author USER
 */
public final class ProdukToko {
    private final String namaProduk;
    private final double harga;

    public ProdukToko(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter
    public final String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }
}


