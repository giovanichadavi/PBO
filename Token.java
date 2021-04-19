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
public class Token extends Aset {
    @Override
    public void tampil(String nama, String kode, long harga, long hargamax, long hargamin) {
       System.out.println("\nNama Token Crypto Ini Adalah : " + nama);
       System.out.println("Kode dari Token Ini Adalah : " + kode);
       System.out.println("\nHarga Token Ini Untuk Saat Ini Adalah : " + harga);
       System.out.println("Harga Tertinggi Untuk Token Ini Adalah : " + hargamax);
       System.out.println("Harga Terendah Untuk Token Ini Adalah : " + hargamin);
    }
}
