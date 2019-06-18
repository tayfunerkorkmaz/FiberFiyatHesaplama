/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.memento;

import tayfunerkorkmaz.designpatterns.builder.*;

/**
 *
 * @author tayfunerkorkmaz
 */
public class Kablo {

    private String kabloTip;
    private String kabloYapi;
    private String fiberTip;
    private String sagKonnektor;
    private String solKonnektor;
    private String kabloCapi;
    private int kabloMetre;

    public Kablo(String kabloTip, String kabloYapi, String fiberTip, String sagKonnektor, String solKonnektor, String kabloCapi, int kabloMetre) {
        this.kabloTip = kabloTip;
        this.kabloYapi = kabloYapi;
        this.fiberTip = fiberTip;
        this.sagKonnektor = sagKonnektor;
        this.solKonnektor = solKonnektor;
        this.kabloCapi = kabloCapi;
        this.kabloMetre = kabloMetre;
    }

    public String getKabloTip() {
        return kabloTip;
    }

    public String getKabloYapi() {
        return kabloYapi;
    }

    public String getFiberTip() {
        return fiberTip;
    }

    public String getSagKonnektor() {
        return sagKonnektor;
    }

    public String getSolKonnektor() {
        return solKonnektor;
    }

    public String getKabloCapi() {
        return kabloCapi;
    }

    public int getKabloMetre() {
        return kabloMetre;
    }

    public void setKabloTip(String kabloTip) {
        this.kabloTip = kabloTip;
    }

    public void setKabloYapi(String kabloYapi) {
        this.kabloYapi = kabloYapi;
    }

    public void setFiberTip(String fiberTip) {
        this.fiberTip = fiberTip;
    }

    public void setSagKonnektor(String sagKonnektor) {
        this.sagKonnektor = sagKonnektor;
    }

    public void setSolKonnektor(String solKonnektor) {
        this.solKonnektor = solKonnektor;
    }

    public void setKabloCapi(String kabloCapi) {
        this.kabloCapi = kabloCapi;
    }

    public void setKabloMetre(int kabloMetre) {
        this.kabloMetre = kabloMetre;
    }
    
    
    public void getUrun(){
    System.out.println("Kablo Tipi: " +  kabloTip);
    System.out.println("Kablo Yapısı: " + kabloYapi );
    System.out.println("Fiber Tipi: " + fiberTip);
    System.out.println("Sağ Konnektor: " + sagKonnektor);
    System.out.println("Sol Konnektor: " + solKonnektor);
    System.out.println("Kablo Çapı: " + kabloCapi);
    System.out.println("Kablo Uzunluğu: " + kabloMetre );
    }
    
    public void bindMemento(KabloMemento kablo){
        
        this.fiberTip = kablo.getFiberTip();
        this.kabloCapi = kablo.getKabloCapi();
        this.kabloMetre = kablo.getKabloMetre();
        this.kabloTip = kablo.getKabloTip();
        this.kabloYapi = kablo.getKabloYapi();
        this.sagKonnektor = kablo.getSagKonnektor();
        this.solKonnektor = kablo.getSolKonnektor();
        
    }
    
    public KabloMemento createMemento(){
        KabloMemento kb= new KabloMemento();
        kb.setFiberTip(this.fiberTip);
        kb.setKabloCapi(this.kabloCapi);
        kb.setKabloMetre(this.kabloMetre);
        kb.setKabloTip(this.kabloTip);
        kb.setKabloYapi(this.kabloYapi);
        kb.setSagKonnektor(this.sagKonnektor);
        kb.setSolKonnektor(this.solKonnektor);
        
        return kb;
            
    
    }
    
    
}
