/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.singleton;

import tayfunerkorkmaz.services.ExchangeRate;

/**
 *
 * @author tayfunerkorkmaz
 */
public class SingletonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        KurAyarla kur = KurAyarla.getInstance();
        
        ExchangeRate kurMerkezBank = new ExchangeRate();
        
        kurMerkezBank.KurAl("Dolar");
        kur.setDolar(Double.valueOf(kurMerkezBank.getKur()));
        
        kurMerkezBank.KurAl("Euro");
        kur.setEuro(Double.valueOf(kurMerkezBank.getKur()));
        
        System.out.println("Dolar: " + kur.getDolar() + " Euro: " + kur.getEuro());
        
        KurAyarla kurTest = KurAyarla.getInstance();
        
        System.out.println("Dolar: " +kurTest.getDolar() + " Euro: " + kurTest.getEuro());
    }
    
}
