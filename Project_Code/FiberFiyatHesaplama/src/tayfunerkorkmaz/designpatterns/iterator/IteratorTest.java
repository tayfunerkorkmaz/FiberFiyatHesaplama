/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.iterator;

/**
 *
 * @author tayfunerkorkmaz
 */
public class IteratorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MusteriCollection mc = new MusteriCollection(); 
         Iterator iterator = mc.createIterator();
         
         while (iterator.hasNext())
         { 
            Musteri m = (Musteri)iterator.next(); 
            System.out.println(m.getAdSoyad() + " " + m.getFirma() + " " + m.getMail() + " " + m.getTel()); 
        } 
    }
    
}
