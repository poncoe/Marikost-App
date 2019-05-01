package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Kosan {
    private String id;
    private String pemilik;
    private String nama;
    private String jenis;
    private String deskripsi;
    private String wilayah;
    private int kontak;
    private int harga;
    
    public Kosan(String id, String pemilik, String nama, String jenis, String deskripsi, String wilayah, int kontak, int harga){
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

    public void setId(String id) {
        this.id = id;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public int getKontak() {
        return kontak;
    }

    public void setKontak(int kontak) {
        this.kontak = kontak;
    }

    public int getHarga() {
        return harga;
    }

    public void getHarga(int harga) {
        this.harga = harga;
    }
    
}
