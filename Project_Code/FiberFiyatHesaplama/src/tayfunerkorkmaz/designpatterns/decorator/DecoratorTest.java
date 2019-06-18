/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.decorator;

/**
 *
 * @author tayfunerkorkmaz
 */
public class DecoratorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Odeme odemeKK = new KKarti();
        Odeme dovizEuro = new EuroOdemeDecorator(odemeKK);
        
        dovizEuro.ode(100);
        
    }
    
}
