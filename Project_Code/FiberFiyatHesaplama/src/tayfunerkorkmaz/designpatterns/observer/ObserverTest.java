/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.observer;

/**
 *
 * @author tayfunerkorkmaz
 */
public class ObserverTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KurData kur = new KurData();
        KurObserver kurObserver = new KurObserver(kur);
        
        kur.setKur(5.80, 6.10);
        kur.setKur(5.85, 6.15);
    }
    
}
