/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.builder;

import java.util.List;

/**
 *
 * @author tayfunerkorkmaz
 */
public class DocumentInfo {
    
    private String musteriAdi;
    private String musteriTel;
    private String musteriAdres;
    private List<Kablo> kablolar;

    public DocumentInfo(String musteriAdi, String musteriTel, String musteriAdres, List<Kablo> kablolar) {
        this.musteriAdi = musteriAdi;
        this.musteriTel = musteriTel;
        this.musteriAdres = musteriAdres;
        this.kablolar = kablolar;
    }

  
    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriTel() {
        return musteriTel;
    }

    public void setMusteriTel(String musteriTel) {
        this.musteriTel = musteriTel;
    }

    public String getMusteriAdres() {
        return musteriAdres;
    }

    public void setMusteriAdres(String musteriAdres) {
        this.musteriAdres = musteriAdres;
    }

    public List<Kablo> getKablolar() {
        return kablolar;
    }

    public void setKablolar(List<Kablo> kablolar) {
        this.kablolar = kablolar;
    }
   
    
    
}
