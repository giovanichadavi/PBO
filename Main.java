/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest;


public class Main {
    public static void main(String [] args){
        
        Coin data_btc = new Coin();
        Coin data_eth = new Coin();
        
        Token data_bnb = new Token();
        Token data_ltc = new Token();
        
        
        data_btc.setNama("Bitcoin");
        data_btc.setKode("BTC");
        
        data_eth.setNama("Ethereum");
        data_eth.setKode("ETH");
        
        data_btc.setHarga(839000000);
        data_btc.setHargamax(888124446);
        data_btc.setHargamin(658780);
        
        data_eth.setHarga(29907328);
        data_eth.setHargamax(31204364);
        data_eth.setHargamin(587648);
        
        data_bnb.setNama("Binance Coin");
        data_bnb.setKode("BNB");
        
        data_ltc.setNama("Litecoin");
        data_ltc.setKode("LTC");
        
        data_bnb.setHarga(8500000);
        data_bnb.setHargamin(538);
        data_bnb.setHargamax(8900000);
        
        data_ltc.setHarga(3600000);
        data_ltc.setHargamax(4889000);
        data_ltc.setHargamin(14000);
                
        
        
        data_btc.tampil(data_btc.getNama(), data_btc.getKode(),data_btc.harga, data_btc.hargamax, data_btc.hargamin);
                
        data_eth.tampil(data_eth.getNama(), data_eth.getKode(), data_eth.harga , data_eth.hargamax, data_btc.hargamin);
        
        data_bnb.tampil(data_bnb.getNama(), data_bnb.getKode (), data_bnb.harga, data_bnb.hargamax, data_bnb.hargamin);
        
        data_ltc.tampil(data_ltc.getNama(), data_ltc.getKode (), data_ltc.harga, data_ltc.hargamax, data_ltc.hargamin);
    }
}
