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
public class KurAyarla {
    
    private static KurAyarla kur;
    private double dolar;
    private double euro;
    
    private KurAyarla() {
        System.out.println("Singleton Pattern Çalıştı!");
    }

    public static KurAyarla CreateObject() {

        if (kur == null) {

            kur = new KurAyarla();
        }

        return kur;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }
    
    
    
}
