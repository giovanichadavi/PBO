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
public class Aset {
    protected String nama;
    protected String kode;
    protected long harga;
    protected long hargamax;
    protected long hargamin;
    private static int countAset;
    
    public void Aset(String nama, String kode, long harga, long hargamax, long hargamin){
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
        this.hargamax = hargamax;
        this.hargamin = hargamin;
        countAset++;
    }

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getKode() {
        return kode;
    }

    protected void setKode(String kode) {
        this.kode = kode;
    }

    protected long getHarga() {
        return harga;
    }

    protected void setHarga(long harga) {
        this.harga = harga;
    }

    protected long getHargamax() {
        return hargamax;
    }

    protected void setHargamax(long hargamax) {
        this.hargamax = hargamax;
    }

    protected long getHargamin() {
        return hargamin;
    }

    protected void setHargamin(long hargamin) {
        this.hargamin = hargamin;
    }
    public static int getcountAset(){
        return countAset;
    }
    public static void setcountAset(int countAset){
        Aset.countAset = countAset;
    }

    protected void tampil(String nama, String kode,long harga, long hargamax, long hargamin){
        System.out.println(nama);
        System.out.println(kode);
        System.out.println(harga);
        System.out.println(hargamax);
        System.out.println(hargamin);
    }
    
}
