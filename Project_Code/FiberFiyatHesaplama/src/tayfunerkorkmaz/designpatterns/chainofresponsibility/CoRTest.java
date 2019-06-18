/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author tayfunerkorkmaz
 */
public class CoRTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Musteriler> musteriler = new ArrayList();
        List<Kablo> urunler = new ArrayList();
        
        musteriler.add(new Musteriler("Tayfun", "SAMM", "05552343978", "tayfun.erkorkmaz@samm.com"));
        urunler.add(new Kablo("Patch Cord", "Simplex", "MultiMode", "FC-APC", "LC-APC", "1800 mikron", 10));
        OdemeHandler c1 = new Musteri(musteriler);
        OdemeHandler c2 = new Urunler(urunler);
        OdemeHandler c3 = new Siparis();
        
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        
        c1.process(new Urunler(urunler)); //Dogru
        c2.process(new Siparis()); //Dogru
        c1.process(new Siparis()); //Hatalı
        c1.process(new Musteri(musteriler)); //Hatalı
        
        
    }
    
}
