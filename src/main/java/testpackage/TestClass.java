/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import com.itextpdf.text.DocumentException;
import defaultpackage.DocumentBuilder;
import defaultpackage.DocumentInfo;
import defaultpackage.DocumentManager;
import defaultpackage.Kablo;
import defaultpackage.KabloDto;
import defaultpackage.KurAyarla;
import defaultpackage.Satis;
import defaultpackage.SiparisList;
import defaultpackage.SiparisYazdir;
import defaultpackage.TeklifList;
import defaultpackage.Uretim;
import defaultpackage.Urun;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author tayfunerkorkmaz
 */
public class TestClass {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, DocumentException {
        
        //Singleton Test
        KurAyarla kur = KurAyarla.CreateObject();
        kur.setDolar(5.60);
        kur.setEuro(6.30);
        
        System.out.println(kur.getDolar() + " " + kur.getEuro());
        KurAyarla kur2 = KurAyarla.CreateObject();
        System.out.println(kur2.getDolar() + " " + kur2.getEuro());
        
        OtherTestClass kurOgren = new OtherTestClass();
        
        //FactoryMethodTest
        
        Uretim uretim = new Uretim();
        Urun urun=(Urun) uretim.Uret("Patch Cord", "Simplex", "SingleMode", "FC-APC", "SC-APC", "1800 mikron", 0);
        urun.getUrun();
        
        
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
        
        TeklifList ikincilTeklif = (TeklifList) teklifList.clone();
        SiparisList ikincilSiparis = (SiparisList) siparisList.clone();
       
        teklif.add(new Satis("Tayfun_3", "2", "SAMM_3", "2", urunler, 200)); 
       
        System.out.println("Siparişler:");
        ikincilSiparis.Print();
        siparisList.Print();
        System.out.println(siparisList.hashCode());
        System.out.println(ikincilSiparis.hashCode());
        System.out.println("Teklifler:");
        ikincilTeklif.Print();
       
        //DeepCopy
        
        TeklifList teklifCopy = new TeklifList(ikincilTeklif);
        teklifCopy.clone();
        System.out.println(ikincilTeklif.hashCode() == teklifCopy.hashCode());
        
        //Builder
        List<KabloDto> kablolar = new ArrayList();
        kablolar.add(new KabloDto("Patch Cord", "Simplex", "SingleMode", "FC-APC", "SC-APC", "1800 mikron", 0));
        DocumentInfo documentInfo = new DocumentInfo("Tayfun Erkorkmaz", "05551234567", "İstanbul/Kadıköy", 5, kablolar );
        
        DocumentBuilder builder = new SiparisYazdir(documentInfo, "Tayfun Erkorkmaz");
        DocumentManager manager = new DocumentManager(builder);
        manager.build();
        
        
        
    }

}
