/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.factory;

/**
 *
 * @author tayfunerkorkmaz
 */
public class FactoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UrunFactory pigTail = new PTFactory();
        pigTail.createUrun("Patch Cord", "Simplex", "SingleMode", "FC-APC", "SC-APC", "1800 mikron", 10);
        pigTail.createUrun("Patch Cord", "Duplex", "SingleMode", "FC-APC", "FC-APC", "1800 mikron", 30);
        for(Kablo k: pigTail.getUrunList()){
        System.out.println(k.getFiberTip() + " "+ k.getKabloCapi() + " "+ k.getKabloTip() + " "+ k.getKabloYapi() + " " + k.getSagKonnektor() + " " + k.getSolKonnektor() + " " +k.getKabloMetre());
        }
    }
    
}
