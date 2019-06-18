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
public class AbstractFactoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        AbstractFactory singleMode = FactoryProducer.getFactory("SM");
        SMFiber SM = (SMFiber) singleMode.create("SM", "Patch Cord", "Simplex", "FC-APC", "SC-APC", "1800 mikron", 10);
        System.out.println(SM.getFiyat() + "$");
        
        AbstractFactory multiMode = FactoryProducer.getFactory("MM");
        OM3Fiber OM3 = (OM3Fiber) multiMode.create("OM3", "Pig Tail", "Simplex", "FC-APC", "SC-APC", "1800 mikron", 10);
        OM3.getKabloCapi();
        
        
        
        System.out.println(OM3.getFiyat() + "$");
    }   
    
}
