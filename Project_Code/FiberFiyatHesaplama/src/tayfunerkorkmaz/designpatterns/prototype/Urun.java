/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.prototype;

/**
 *
 * @author tayfunerkorkmaz
 */
public class Urun extends Kablo {

    protected Urun(String kabloTip, String kabloYapi, String fiberTip, String sagKonnektor, String solKonnektor, String kabloCapi, int kabloMetre) {
        super(kabloTip, kabloYapi, fiberTip, sagKonnektor, solKonnektor, kabloCapi, kabloMetre);
    }
}
