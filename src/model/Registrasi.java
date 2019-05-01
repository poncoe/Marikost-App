/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Registrasi {
    private String nama;
    private String username;
    private String password;
    
    public Registrasi(String nama, String username, String password){
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }  
    
    public void TampilkanPesanBerhasil(){
        System.out.println("Akun Berhasil Dibuat!");
    }  
    
    public void TampilkanPesanGagal(){
        System.out.println("Akun Sudah Ada / Teregistrasi!");
    }
}
