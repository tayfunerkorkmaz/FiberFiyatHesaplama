/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import defaultpackage.KurAyarla;

/**
 *
 * @author tayfunerkorkmaz
 */
public class OtherTestClass {
    
    public OtherTestClass(){
    
        KurAyarla kur = KurAyarla.CreateObject();
        System.out.println(kur.getDolar() + " " + kur.getEuro());
    }
    
}
