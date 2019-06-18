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
public abstract class OdemeDecorator implements Odeme {
    protected Odeme decoratedOdeme;
    
    public OdemeDecorator(Odeme decoratedOdeme){
    this.decoratedOdeme = decoratedOdeme;
    }
    
    public void ode(int miktar){
        decoratedOdeme.ode(miktar);
    }
}
