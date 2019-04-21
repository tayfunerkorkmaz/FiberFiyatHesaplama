/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tayfunerkorkmaz
 */
public class Satis implements Cloneable {

    private String musteriAdi;
    private String musteriNo;
    private String sirketAdi;
    private String sirketNo;
    private List<Urun> urunler = new ArrayList();
    private double toplamFiyat;

    public Satis(String musteriAdi, String musteriNo, String sirketAdi, String sirketNo, List<Urun> urunler, double toplamFiyat) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.sirketAdi = sirketAdi;
        this.sirketNo = sirketNo;
        this.urunler = urunler;
        this.toplamFiyat = toplamFiyat;
    }
    
    public Satis() {
        
    }
    
    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public String getSirketNo() {
        return sirketNo;
    }

    public void setSirketNo(String sirketNo) {
        this.sirketNo = sirketNo;
    }

    public List<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }

    public double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }

    public void urunEkle(Urun u) {
        urunler.add(u);

    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Satis satis = null;
        try {
            satis = (Satis) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
        }
        return satis;
    }
    

}
