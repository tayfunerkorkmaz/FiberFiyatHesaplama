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
public class Havale implements Odeme {

    @Override
    public void ode(int miktar) {
        System.out.println("Havale ile");
    }
    
}
