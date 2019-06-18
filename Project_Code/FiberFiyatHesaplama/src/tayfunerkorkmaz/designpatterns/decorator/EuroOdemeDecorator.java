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
public class EuroOdemeDecorator extends OdemeDecorator {
    

    public EuroOdemeDecorator(Odeme decoratedOdeme) {
        super(decoratedOdeme);
    }
    
    @Override
    public void ode(int miktar){
    decoratedOdeme.ode(miktar);
    setDoviz(decoratedOdeme, miktar);
    }
    
    private void setDoviz(Odeme decoratedOdeme, int miktar){
        System.out.println(miktar + " Euro");
    }
    
}
