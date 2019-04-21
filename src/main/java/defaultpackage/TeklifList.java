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
public class TeklifList extends Satis {

    List<Satis> teklif;

    public TeklifList() {
        teklif = new ArrayList();
    }
    
     public TeklifList(String musteriAdi, String musteriNo, String sirketAdi, String sirketNo, List<Urun> urunler, double toplamFiyat) {
        super(musteriAdi, musteriNo, sirketAdi, sirketNo, urunler, toplamFiyat);
    }

    public TeklifList(TeklifList s) {
        this(s.getMusteriAdi(), s.getMusteriNo(), s.getSirketAdi(), s.getSirketNo(), s.getUrunler(), s.getToplamFiyat());
    }

    public List<Satis> getTeklif() {
        return teklif;
    }

    public void setTeklif(List<Satis> teklif) {
        this.teklif = teklif;
    }

    public void Print() {
        for (Satis s : teklif) {
            for (Urun u : s.getUrunler()) {
                System.out.println(s.getMusteriAdi() + " " + s.getMusteriNo() + " " + s.getSirketAdi() + "UrunFiberTipi: " + u.getFiberTip());
            }
        }
    }

}
