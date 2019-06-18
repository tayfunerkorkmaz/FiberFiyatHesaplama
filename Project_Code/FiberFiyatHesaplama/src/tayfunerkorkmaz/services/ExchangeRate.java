package tayfunerkorkmaz.services;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ExchangeRate {

    String kur;

    public String getKur() {
        return kur;
    }

    public boolean KurAl(String birim) {
        try {
            XMLParser xmlNesne = new XMLParser("http://www.tcmb.gov.tr/kurlar/today.xml"); // Merkez Bankası 

            NodeList gelenNodelist = xmlNesne.nodulGetir("Currency");

            Element e = (Element) gelenNodelist.item(3);
            
            if (birim.equals("Dolar")) {
                e = (Element) gelenNodelist.item(0);
            }
            if (birim.equals("GBP")) {
                e = (Element) gelenNodelist.item(4);
            }
            if (birim.equals("Euro")) {
                e = (Element) gelenNodelist.item(3);
            }

            kur = xmlNesne.getElementValue(e, "ForexSelling").toString();
            return true;
            
        } catch (Exception e) {
            
            return false;
            
        }

    }

}
