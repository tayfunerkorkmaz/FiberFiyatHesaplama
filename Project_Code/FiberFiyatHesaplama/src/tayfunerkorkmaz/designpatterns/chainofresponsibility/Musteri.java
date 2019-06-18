/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.chainofresponsibility;

import java.util.List;

/**
 *
 * @author tayfunerkorkmaz
 */
public class Musteri implements OdemeHandler{

    private OdemeHandler nextInChain;
    List<Musteriler> musteriler;

    public Musteri(List<Musteriler> musteriler) {
        this.musteriler = musteriler;
    }

    public List<Musteriler> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler() {
        this.musteriler = musteriler;
    }
    
    
    @Override
    public void setNextChain(OdemeHandler nextChain) {
        nextInChain = nextChain;
    }


    @Override
    public void process(Object obj) {
        if (obj instanceof Musteri || obj instanceof Siparis ) 
        { 
            System.out.println("Once Urunleri Girmelisiniz");
        } 
        else
        { 
            nextInChain.process(new Urunler());  
            
            
        } 
    }
    
}
