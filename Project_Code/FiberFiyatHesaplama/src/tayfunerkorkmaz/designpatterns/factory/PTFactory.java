/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.factory;

/**
 *
 * @author tayfunerkorkmaz
 */
public class PTFactory extends UrunFactory{

    @Override
    public void createUrun(String kabloTip, String kabloYapi, String fiberTip, String sagKonnektor, String solKonnektor, String kabloCapi, int kabloMetre) {
        getUrunList().add(new PigTailKablo(kabloTip, kabloYapi, fiberTip, "X" , solKonnektor, kabloCapi, kabloMetre));
        
    }
    
}
