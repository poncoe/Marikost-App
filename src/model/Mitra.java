package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Mitra extends Person{
    private String id_pelapak;

    public Mitra(String nama, String username, String password){
        super(nama, username, password);
        this.id_pelapak = id_pelapak;
    }

    public String getId_pelapak() {
        return id_pelapak;
    }

    public void setId_pelapak(String id_pelapak) {
        this.id_pelapak = id_pelapak;
    }
}
