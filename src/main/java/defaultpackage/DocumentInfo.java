/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import java.util.List;

/**
 *
 * @author tayfunerkorkmaz
 */
public class DocumentInfo {
    
    private String musteriAdi;
    private String musteriTel;
    private String musteriAdres;
    private double musteriIndirim;
    
    private List<KabloDto> kablolar;

    public DocumentInfo(String musteriAdi, String musteriTel, String musteriAdres, double musteriIndirim, List<KabloDto> kablolar) {
        this.musteriAdi = musteriAdi;
        this.musteriTel = musteriTel;
        this.musteriAdres = musteriAdres;
        this.musteriIndirim = musteriIndirim;
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

    public double getMusteriIndirim() {
        return musteriIndirim;
    }

    public void setMusteriIndirim(double musteriIndirim) {
        this.musteriIndirim = musteriIndirim;
    }

    public List<KabloDto> getKablolar() {
        return kablolar;
    }

    public void setKablolar(List<KabloDto> kablolar) {
        this.kablolar = kablolar;
    }
   
    
    
}
