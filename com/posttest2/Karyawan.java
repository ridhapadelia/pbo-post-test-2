/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.posttest2;

/**
 *
 * @author USER
 */
import java.util.ArrayList;


public final class Karyawan {
    private final ArrayList<Produk> daftarProduk;

    public Karyawan(ArrayList<Produk> daftarProduk) {
        this.daftarProduk = daftarProduk;
    }

    public final void tambahProduk(String namaProduk, double harga) {
        daftarProduk.add(new Produk(namaProduk, harga));
        System.out.println("Produk baru ditambahkan: " + namaProduk);
    }

    public final void editProduk(String namaProdukLama, String namaProdukBaru, double hargaBaru) {
        for (Produk produk : daftarProduk) {
            if (produk.getNamaProduk().equals(namaProdukLama)) {
                produk.setNamaProduk(namaProdukBaru);
                System.out.println("Produk diubah: " + namaProdukLama + " menjadi " + namaProdukBaru);
                return;
            }
        }
        System.out.println("Produk dengan nama " + namaProdukLama + " tidak ditemukan.");
    }




    public final void hapusProduk(String namaProdukHapus) {
        for (Produk produk : daftarProduk) {
            if (produk.getNamaProduk().equals(namaProdukHapus)) {
                daftarProduk.remove(produk);
                System.out.println("Produk dihapus: " + namaProdukHapus);
                return;
            }
        }
        System.out.println("Produk dengan nama " + namaProdukHapus + " tidak ditemukan.");
    }

    public final void tampilkanProduk() {
        System.out.println("Daftar Produk:");
        for (Produk produk : daftarProduk) {
            System.out.println(produk.getNamaProduk() + " - Harga: " + produk.getHarga());
        }
    }
}
