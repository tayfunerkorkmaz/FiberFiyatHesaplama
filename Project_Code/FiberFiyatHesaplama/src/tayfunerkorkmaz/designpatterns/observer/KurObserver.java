/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.observer;

import tayfunerkorkmaz.designpatterns.singleton.KurAyarla;

/**
 *
 * @author tayfunerkorkmaz
 */
public class KurObserver implements Observer {

    private double dolarKur = 0;
    private double euroKur = 0;

    private KurData kurData;

    public KurObserver(KurData kurData) {
        this.kurData = kurData;
        kurData.registerObserver(this);

    }

    @Override
    public boolean update(double dolarKur, double euroKur) {
        if (dolarKur != this.dolarKur || euroKur != this.euroKur) {
            this.dolarKur = dolarKur;
            this.euroKur = euroKur;
            System.out.println("Observer : Kurlar güncellendi.");
            return true;
        } else {
            return false;
        }
    }

}
