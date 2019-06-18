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
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String fiberTip){   
      if(fiberTip.equals("SM")){
         return new SingleModeFactory();         
      }else{
         return new MultiModeFactory();
      }
   }
}
