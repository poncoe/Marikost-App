/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Iklan {
    private String id;
    private String pemilik;
    private String nama;
    private String jenis;
    private String deskripsi;
    private String wilayah;
    private int kontak;
    private int harga;
    
    public Iklan(String id, String pemilik, String nama, String jenis, String deskripsi, String wilayah, int kontak, int harga){
        this.id = id;
        this.pemilik = pemilik;
        this.nama = nama;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.wilayah = wilayah;
        this.kontak = kontak;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getWilayah() {
        return wilayah;
    }

    public int getKontak() {
        return kontak;
    }

    public int getHarga() {
        return harga;
    }

    public void printAll() {
        
    } 

    public void cariWilayah() {
        
    } 

    public void mengurutkanHarga() {
        
    }

    public void filterJenis() {
        
    }

}
