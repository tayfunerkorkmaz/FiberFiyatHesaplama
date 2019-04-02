/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import defaultpackage.KurAyarla;
import defaultpackage.Uretim;
import defaultpackage.Urun;


/**
 *
 * @author tayfunerkorkmaz
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
        
    }

}
