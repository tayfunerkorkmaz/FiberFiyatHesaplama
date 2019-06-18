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
public class SingleModeFactory extends AbstractFactory {

    @Override
    public Kablo create(String fiberTip, String kabloTip, String kabloYapi, String sagKonnektor, String solKonnektor, String kabloCapi, int kabloMetre) {
        if(fiberTip.equalsIgnoreCase("SM")){
         return new SMFiber(kabloTip, kabloYapi, sagKonnektor, solKonnektor, kabloCapi, kabloMetre);         
      }
      return null;
    }
    
}
