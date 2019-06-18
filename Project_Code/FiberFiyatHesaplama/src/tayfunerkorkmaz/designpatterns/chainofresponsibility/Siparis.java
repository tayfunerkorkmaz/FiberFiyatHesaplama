/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.chainofresponsibility;

/**
 *
 * @author tayfunerkorkmaz
 */
public class Siparis implements OdemeHandler {
    private OdemeHandler nextInChain;
    
    @Override
    public void setNextChain(OdemeHandler nextChain) {
        nextInChain = nextChain;
    }


    @Override
    public void process(Object obj) {
        if (obj instanceof Musteri || obj instanceof Urunler) 
        { 
            System.out.println("Sipariş Tamamlanamadı");  
        } 
        else
        { 
            System.out.println("Sipariş Tamamlandı");
            
        } 
    }
}
