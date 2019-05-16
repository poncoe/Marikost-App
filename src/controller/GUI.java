/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.DaftarAkun;
import view.DaftarMitra;
import view.Kemitraan;
import view.Login;
import view.MainActivity;
import view.Petunjuk;
import view.TentangAplikasi;

/**
 *
 * @author poncoe
 */
public class GUI{
    private DaftarAkun daftarakun;
    private DaftarMitra daftarmitra;
    private Kemitraan kemitraan;
    private Login login;
    private MainActivity main;
    private Petunjuk petunjuk;
    private TentangAplikasi tentang;
    
    public GUI(){
        login = new Login();
        login.setVisible(true);
        daftarakun = new DaftarAkun();
        daftarmitra = new DaftarMitra();
        kemitraan = new Kemitraan();
        main = new MainActivity();
        petunjuk = new Petunjuk();
        tentang = new TentangAplikasi();
        
        // CONTROLLER LOGIN
        
        login.getDaftarAkun().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                login.setVisible(false);
                daftarakun.setVisible(true); 
                
                // CONTROLLER DAFTAR AKUN
                
                daftarakun.getKembali().addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        login.setVisible(true);
                        daftarakun.setVisible(false); 
                    }
                });
                
                daftarakun.getDaftarMitra().addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        daftarmitra.setVisible(true);
                        daftarakun.setVisible(false); 
                    }
                });
                
                // CONTROLLER MITRA
                
                daftarmitra.getKembaliMitra().addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        daftarakun.setVisible(true);
                        daftarmitra.setVisible(false); 
                    }
                });
                
                kemitraan.getlogoutMitra().addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        login.setVisible(true);
                        kemitraan.setVisible(false); 
                    }
                });
                
                // CONTROLLER MAIN ACTIVITY
                
                main.getlogout().addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        login.setVisible(true);
                        main.setVisible(false); 
                    }
                });
                
                main.getPetunjuk().addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        petunjuk.setVisible(true);
                    }
                });
                
                main.getTentang().addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        tentang.setVisible(true);
                    }
                });
                
                // AKHIR DARI CONTROLLER
                
            }      
        });
        
//        
    }
}    