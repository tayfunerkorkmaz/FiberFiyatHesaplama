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
public class Urunler implements OdemeHandler {
    private OdemeHandler nextInChain;
    List<Kablo> urunler;

    public Urunler(){
    }
    public Urunler(List<Kablo> urunler) {
        this.urunler = urunler;
    }

    public List<Kablo> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<Kablo> urunler) {
        this.urunler = urunler;
    }
    
    @Override
    public void setNextChain(OdemeHandler nextChain) {
        nextInChain = nextChain;
    }


    @Override
    public void process(Object obj) {
        if (obj instanceof Musteri || obj instanceof Siparis ) 
        { 
              System.out.println("Önce Müşteri Bilgisi Girmelisiniz");
        } 
        else
        { 
            
            nextInChain.process(new Siparis());
            
            
        } 
    }
}
