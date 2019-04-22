/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

/**
 *
 * @author tayfunerkorkmaz
 */
public class KabloDto {

    private String kabloTip;
    private String kabloYapi;
    private String fiberTip;
    private String sagKonnektor;
    private String solKonnektor;
    private String kabloCapi;
    private int kabloMetre;

    public KabloDto(String kabloTip, String kabloYapi, String fiberTip, String sagKonnektor, String solKonnektor, String kabloCapi, int kabloMetre) {
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
    
    public void getUrun(){
    System.out.println("Kablo Tipi: " +  kabloTip);
    System.out.println("Kablo Yapısı: " + kabloYapi );
    System.out.println("Fiber Tipi: " + fiberTip);
    System.out.println("Sağ Konnektor: " + sagKonnektor);
    System.out.println("Sol Konnektor: " + solKonnektor);
    System.out.println("Kablo Çapı: " + kabloCapi);
    System.out.println("Kablo Uzunluğu: " + kabloMetre );
    }
    
    
}
