/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.memento;

/**
 *
 * @author tayfunerkorkmaz
 */
public class MementoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kablo k = new Kablo("Patch Cord", "Simplex", "SingleMode", "FC-APC", "SC-APC", "1800 mikron", 10);
        KabloMemory km = new KabloMemory();
        km.kabloKopya = k.createMemento();
        System.out.println(km.getKabloKopya().getFiberTip());
        k.setFiberTip("Pig Tail");
        System.out.println(k.getFiberTip());
        k.bindMemento(km.kabloKopya);
        System.out.println(k.getFiberTip());
        
    }
    
}
