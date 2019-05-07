/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

/**
 *
 * @author tayfunerkorkmaz
 */
public class Musteri {
    // To store musteri
    String adSoyad;
    String firma;
    String tel;
    String mail;

    public Musteri(String adSoyad, String firma, String tel, String mail) {
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
