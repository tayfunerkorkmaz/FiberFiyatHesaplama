/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

/**
 *
 * @author tayfunerkorkmaz
 */
public class MusteriIterator implements Iterator {
    
    Musteri[] musteriList; 
    
    int pos = 0;
    
    public MusteriIterator(Musteri[] musteriList) {
        this.musteriList = musteriList;
    }

    public Object next() 
    { 
        // return next element in the array and increment pos 
        Musteri musteri =  musteriList[pos]; 
        pos += 1; 
        return musteri; 
    } 
  
    public boolean hasNext() 
    { 
        if (pos >= musteriList.length || 
            musteriList[pos] == null) 
            return false; 
        else
            return true; 
    } 
    
}
