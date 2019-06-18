/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.builder;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tayfunerkorkmaz
 */
public class BuilderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        
        List<Kablo> kablolar = new ArrayList();
        kablolar.add(new Kablo("Patch Cord", "Simplex", "SingleMode", "FC-APC", "SC-APC", "1800 mikron", 0));
        kablolar.add(new Kablo("Patch Cord", "Simplex", "MultiMode", "FC-APC", "LC-APC", "1800 mikron", 10));
        kablolar.add(new Kablo("Patch Cord", "Duplex", "SingleMode", "FC-APC", "FC-APC", "1800 mikron", 30));
     
        DocumentInfo documentInfo = new DocumentInfo("Tayfun Erkorkmaz", "05551234567", "Istanbul/Kadikoy", kablolar );
        
        DocumentBuilder builder = new SiparisYazdir(documentInfo, "Tayfun Erkorkmaz");
        DocumentManager manager = new DocumentManager(builder);
        manager.build();
    }
    
}
