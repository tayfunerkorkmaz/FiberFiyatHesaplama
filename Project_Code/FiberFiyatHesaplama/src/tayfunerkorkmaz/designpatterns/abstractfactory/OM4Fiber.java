/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.abstractfactory;

/**
 *
 * @author tayfunerkorkmaz
 */
public class OM4Fiber extends Kablo {
    
     public OM4Fiber(String kabloTip, String kabloYapi, String sagKonnektor, String solKonnektor, String kabloCapi, int kabloMetre) {
        super(kabloTip, kabloYapi, "OM4", sagKonnektor, solKonnektor, kabloCapi, kabloMetre);
        this.kabloMetre = kabloMetre;
    }
    
    private int kabloMetre;
    
    public double getFiyat(){
        return 1.9 * kabloMetre;
    }
}
