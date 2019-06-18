/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tayfunerkorkmaz
 */
public class PrototypeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Urun urun=new Urun("Patch Cord", "Simplex", "SingleMode", "FC-APC", "SC-APC", "1800 mikron", 0);

         //Prototype
        List<Urun> urunler = new ArrayList();
        urunler.add(urun);
        
        //ShallowCopy
        TeklifList teklifList = new TeklifList();
        SiparisList siparisList = new SiparisList();
        List<Satis> siparis = siparisList.getSiparis();
        List<Satis> teklif = teklifList.getTeklif();
        
        siparis.add(new Satis("Tayfun", "0", "SAMM", "0", urunler, 0));
        siparis.add(new Satis("Tayfun_2", "1", "SAMM_2", "1", urunler, 100));
        
        //ShallowCopy
        
        TeklifList ikincilTeklif = (TeklifList) teklifList.clone();
        SiparisList ikincilSiparis = (SiparisList) siparisList.clone();

       
        System.out.println("Siparişler:");
        System.out.println("\nSiparis Listesi:");
        siparisList.Print();
        System.out.println("\nİkincil Siparis Listesi:");
        ikincilSiparis.Print();
        
        siparis.add(new Satis("Tayfun_3", "1", "SAMM_2", "1", urunler, 100));
        
        System.out.println("\nSiparis Listesi:");
        siparisList.Print();
        System.out.println("\nİkincil Siparis Listesi:");
        ikincilSiparis.Print();
        
               
        teklif.add(new Satis("Tayfun_4", "2", "SAMM_3", "2", urunler, 200)); 
      
       

        //DeepCopy
        TeklifList teklifCopy = new TeklifList(ikincilTeklif);
        TeklifList coppied = (TeklifList) teklifCopy.clone();
        System.out.println("Teklifler:");
        System.out.println("\nTeklif Listesi:");
        coppied.Print();
        System.out.println("\nİkincil Teklif Listesi:");
        ikincilTeklif.Print();
        
        
        teklif.add(new Satis("Tayfun_5", "2", "SAMM_3", "2", urunler, 3300));
        teklif.add(new Satis("Tayfun_6", "5", "SAMM_5", "2", urunler, 2100));
        
        System.out.println("\nTeklif Listesi:");
        coppied.Print();
        System.out.println("\nİkincil Teklif Listesi:");
        ikincilTeklif.Print();
        
       
    }
    
}
