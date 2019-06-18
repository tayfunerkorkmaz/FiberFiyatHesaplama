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
public class KabloMemory {
        public KabloMemento kabloKopya;

    public KabloMemento getKabloKopya() {
        return kabloKopya;
    }

    public void setKabloKopya(KabloMemento kabloKopya) {
        this.kabloKopya = kabloKopya;
    }
        
}
