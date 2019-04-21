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
public class SiparisList extends Satis {

    List<Satis> siparis;

    public SiparisList() {
        siparis = new ArrayList();
    }

    public SiparisList(String musteriAdi, String musteriNo, String sirketAdi, String sirketNo, List<Urun> urunler, double toplamFiyat) {
        super(musteriAdi, musteriNo, sirketAdi, sirketNo, urunler, toplamFiyat);
    }

    public SiparisList(SiparisList s) {
        this(s.getMusteriAdi(), s.getMusteriNo(), s.getSirketAdi(), s.getSirketNo(), s.getUrunler(), s.getToplamFiyat());
    }

    public List<Satis> getSiparis() {
        return siparis;
    }

    public void setSiparis(List<Satis> siparis) {
        this.siparis = siparis;
    }

    public void Print() {
        for (Satis s : siparis) {
            for (Urun u : s.getUrunler()) {
                System.out.println(s.getMusteriAdi() + " " + s.getMusteriNo() + " " + s.getSirketAdi() + "UrunFiberTipi: " + u.getFiberTip());
            }
        }
    }

}
