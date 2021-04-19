/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest;

/**
 *
 * @author GIOVANI
 */
public class Coin extends Aset {
    @Override
    public void tampil(String nama, String kode, long harga, long hargamax, long hargamin) {
       System.out.println("\nNama Coin Crypto Ini Adalah : " + nama);
       System.out.println("Kode dari Coin Ini Adalah : " + kode);
       System.out.println("Harga Coin Ini Untuk Saat Ini Adalah : " + harga);
       System.out.println("Harga Tertinggi Untuk Coin Ini Adalah : " + hargamax);
       System.out.println("Harga Terendah Untuk Coin Ini Adalah : " + hargamin);
    }
}
