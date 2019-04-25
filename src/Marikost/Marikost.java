/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marikost;

import auth.Login;

/**
 *
 * @author poncoe
 */
public class Marikost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // melakukan print biasa
        System.out.println("Selamat Datang! Memulai Marikost...");
        
        // memanggil layout login
        new Login().setVisible(true);
    }
    
}
