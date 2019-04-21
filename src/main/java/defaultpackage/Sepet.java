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
public class Sepet{
    
    private String urunKodu;
    private double mFiyat;
    private int metre;
    
    public Sepet(String urunKodu, double mFiyat, int metre)
    {
        this.urunKodu = urunKodu;
        this.mFiyat = mFiyat;
        this.metre = metre;
        
    }
    
    public Sepet(Sepet sepet){
        this.urunKodu = sepet.urunKodu;
        this.mFiyat = sepet.mFiyat;
        this.metre = sepet.metre;
    }
   
    

    public String getUrunKodu() {
        return urunKodu;
    }

    public void setUrunKodu(String urunKodu) {
        this.urunKodu = urunKodu;
    }

    public double getmFiyat() {
        return mFiyat;
    }

    public void setmFiyat(double mFiyat) {
        this.mFiyat = mFiyat;
    }

    public int getMetre() {
        return metre;
    }

    public void setMetre(int metre) {
        this.metre = metre;
    }
    
    
    
}
