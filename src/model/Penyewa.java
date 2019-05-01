package model;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Penyewa extends Person {
    private String id_penyewa;
    
    public Penyewa(String id_penyewa, String nama, String username, String password){
        super(nama, username, password);
        this.id_penyewa = id_penyewa;
    }

    public String getId_penyewa() {
        return id_penyewa;
    }

    public void setId_penyewa(String id_penyewa) {
        this.id_penyewa = id_penyewa;
    }
    
}
