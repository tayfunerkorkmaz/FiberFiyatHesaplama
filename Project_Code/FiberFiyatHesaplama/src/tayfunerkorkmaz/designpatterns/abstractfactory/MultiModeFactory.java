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
public class MultiModeFactory extends AbstractFactory{

    @Override
    public Kablo create(String fiberTip, String kabloTip, String kabloYapi, String sagKonnektor, String solKonnektor, String kabloCapi, int kabloMetre) {
        if(fiberTip.equalsIgnoreCase("OM3")){
            
         return new OM3Fiber(kabloTip, kabloYapi, sagKonnektor, solKonnektor, kabloCapi, kabloMetre);         
      }else if(fiberTip.equalsIgnoreCase("OM4")){
         return new OM4Fiber(kabloTip, kabloYapi, sagKonnektor, solKonnektor, kabloCapi, kabloMetre);
      }	 
      return null;
    }
    
}
