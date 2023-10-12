/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest2;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Posttest2 {

    public static void main(String[] args) {
        ArrayList<Produk> daftarProduk = new ArrayList<>();
        Karyawan karyawan = new Karyawan(daftarProduk);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Edit Produk");
            System.out.println("3. Hapus Produk");
            System.out.println("4. Tampilkan Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama produk: ");
                    String namaProduk = scanner.nextLine();
                    System.out.print("Masukkan harga produk: ");
                    double harga = scanner.nextDouble();
                    karyawan.tambahProduk(namaProduk, harga);
                    break;
                case 2:
                    System.out.print("Masukkan nama produk yang ingin diubah: ");
                    String namaProdukLama = scanner.nextLine();
                    System.out.print("Masukkan nama produk baru: ");
                    String namaProdukBaru = scanner.nextLine();
                    System.out.print("Masukkan harga produk baru: ");
                    double hargaBaru = scanner.nextDouble();
                    karyawan.editProduk(namaProdukLama, namaProdukBaru, hargaBaru);
                    break;
                case 3:
                    System.out.print("Masukkan nama produk yang ingin dihapus: ");
                    String namaProdukHapus = scanner.nextLine();
                    karyawan.hapusProduk(namaProdukHapus);
                    break;
                case 4:
                    karyawan.tampilkanProduk();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
    