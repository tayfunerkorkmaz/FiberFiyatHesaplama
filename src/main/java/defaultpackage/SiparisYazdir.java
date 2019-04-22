/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tayfunerkorkmaz
 */
public class SiparisYazdir extends DocumentBuilder {

    Document document = new Document();
    Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
    String name;

    public SiparisYazdir(DocumentInfo documentInfo, String name) throws FileNotFoundException, DocumentException {
        super(documentInfo);
        this.name = name;

        PdfWriter.getInstance(document, new FileOutputStream("Siparis.pdf"));

        document.open();

        Chunk chunk = new Chunk("Sipariş", font);

        document.add(chunk);

    }

    @Override
    public void BuildHeader() {

        Date date = new Date();
        String musteriBilgileri = super.documentInfo.getMusteriAdi() + "\n" + super.documentInfo.getMusteriAdres() + "\n" + super.documentInfo.getMusteriTel();
        Chunk header = new Chunk("Sipariş Hazırlayan: " + name + " Tarih:" + date + "\nMusteri Bilgileri:\n" + musteriBilgileri + "\n" + "<table><tr><th>Sağ Konnektör</th><th>Sol Konnektör</th><th>Kablo Tipi</th><th>Fiber Tipi</th><th>Kablo Yapisi</th><th>Kablo Metresi</th>", font);
        try {
            document.add(header);

        } catch (DocumentException ex) {
            Logger.getLogger(SiparisYazdir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void BuildFooter() {

        Chunk footer = new Chunk("Siparişiniz en geç 10 iş günü içinde elinize ulaşacaktır. Fiyata %18 KDV dahil değildir.", font);
        try {
            document.add(footer);
            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(SiparisYazdir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void BuildContents() {

        String urun_ = "";
        for (KabloDto kablo : super.documentInfo.getKablolar()) {
            urun_ = urun_ + "<tr>" + "<th>" + kablo.getSagKonnektor() + "</th>" + "<th>" + kablo.getSolKonnektor() + "</th>" + "<th>" + kablo.getKabloTip() + "</th>" + "<th>" + kablo.getFiberTip() + "</th>" + "<th>" + kablo.getKabloYapi() + "</th>" + "<th>" + kablo.getKabloMetre() + "</th>" + "</tr>";
        }

        String Urun = "<table>" + urun_ + "</table>";
        Chunk contents = new Chunk(Urun, font);
        try {
            document.add(contents);

        } catch (DocumentException ex) {
            Logger.getLogger(SiparisYazdir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
