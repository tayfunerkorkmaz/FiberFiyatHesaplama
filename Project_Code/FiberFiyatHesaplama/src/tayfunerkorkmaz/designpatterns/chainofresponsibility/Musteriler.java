/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.chainofresponsibility;

import tayfunerkorkmaz.designpatterns.iterator.*;

/**
 *
 * @author tayfunerkorkmaz
 */
public class Musteriler {
    // To store musteri
    String adSoyad;
    String firma;
    String tel;
    String mail;

    public Musteriler(String adSoyad, String firma, String tel, String mail) {
        this.adSoyad = adSoyad;
        this.firma = firma;
        this.tel = tel;
        this.mail = mail;
    }

    

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getFirma() {
        return firma;
    }

    public String getTel() {
        return tel;
    }

    public String getMail() {
        return mail;
    }
  
    
}
