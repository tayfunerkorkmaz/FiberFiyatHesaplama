/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.observer;

import java.util.ArrayList;

/**
 *
 * @author tayfunerkorkmaz
 */
public class KurData implements Subject {

    private ArrayList observers;
    private double dolarKur;
    private double euroKur;

    public KurData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public boolean notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            return observer.update(dolarKur, euroKur);
        }
        return false;
    }

    public void kurChanged() {
        notifyObservers();
    }

    public void setKur(double dolarKur, double euroKur) {
        this.dolarKur = dolarKur;
        this.euroKur = euroKur;
        kurChanged();
    }

    public double getDolarKur() {
        return dolarKur;
    }

    public double getEuroKur() {
        return euroKur;
    }

}
