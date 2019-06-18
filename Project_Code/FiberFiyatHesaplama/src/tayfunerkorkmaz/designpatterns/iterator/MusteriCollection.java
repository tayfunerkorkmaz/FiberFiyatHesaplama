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
public class MusteriCollection implements Collection {

    static final int MAX_ITEMS = 1000; 
    int numberOfItems = 0; 
    Musteri[] musteriList; 
    
    public MusteriCollection() 
    { 
        musteriList = new Musteri[MAX_ITEMS]; 
  
        // Let us add some dummy notifications 
       Musteri m=new Musteri("Tayfun Erkorkmaz", "SAMM", "tayfun.erkorkmaz@samm.com", "+905552343978");
       Musteri m2=new Musteri("Test2", "SAMM", "test2@samm.com", "+905551234567");
       Musteri m3=new Musteri("Test3", "SAMM", "test3@samm.com", "+905558910111");
       
       addItem(m);
       addItem(m2);
       addItem(m3);
       
    } 
    
    public void addItem(Musteri m) 
    { 
        Musteri notification = new Musteri(m.adSoyad, m.firma, m.mail, m.tel); 
        if (numberOfItems >= MAX_ITEMS) 
            System.err.println("Maksimum Kayıt"); 
        else
        { 
            musteriList[numberOfItems] = notification; 
            numberOfItems = numberOfItems + 1; 
        } 
    } 
    
    @Override
    public Iterator createIterator() {
        
      return new MusteriIterator(musteriList); 
        
    }
    
}
