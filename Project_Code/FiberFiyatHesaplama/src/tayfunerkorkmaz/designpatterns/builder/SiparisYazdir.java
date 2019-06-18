/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.builder;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
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
    Paragraph bosluk = new Paragraph(" ");

    public SiparisYazdir(DocumentInfo documentInfo, String name) throws FileNotFoundException, DocumentException {
        super(documentInfo);
        this.name = name;

        PdfWriter.getInstance(document, new FileOutputStream("Siparis.pdf"));

        document.open();
        Chunk chunk = new Chunk("Siparis", font);
        Paragraph para = new Paragraph(chunk);
        document.add(para);

    }

    @Override
    public void BuildHeader() {

        Date date = new Date();
        String musteriBilgileri = super.documentInfo.getMusteriAdi() + " " + super.documentInfo.getMusteriAdres() + " " + super.documentInfo.getMusteriTel();
        Chunk header = new Chunk("Siparis Hazirlayan: " + name, font);
        Paragraph para = new Paragraph(header);
        Chunk header2 = new Chunk(" Tarih:" + date, font);
        Paragraph para2 = new Paragraph(header2);
        Chunk header3 = new Chunk("Musteri Bilgileri: " + musteriBilgileri, font);
        Paragraph para3 = new Paragraph(header3);

        try {
            document.add(bosluk);
            document.add(para);
            document.add(bosluk);
            document.add(para2);
            document.add(bosluk);
            document.add(para3);
            document.add(bosluk);

        } catch (DocumentException ex) {
            Logger.getLogger(SiparisYazdir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void BuildFooter() {

        Chunk footer = new Chunk("Siparisiniz en gec 10 is günü icinde elinize ulasacaktir. Fiyata %18 KDV dahil degildir.", font);
        Paragraph para4 = new Paragraph(footer);
        try {
            document.add(para4);
            document.add(bosluk);
            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(SiparisYazdir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void BuildContents() {

        String urun_ = "";
        List<Kablo> list = super.documentInfo.getKablolar();
        for (Kablo a : list) {
            Chunk contents = new Chunk(a.getFiberTip() + " " + a.getKabloCapi() + " " + a.getKabloTip() + " " + a.getKabloYapi() + " " + a.getSagKonnektor() + " " + a.getSolKonnektor() + " " + String.valueOf(a.getKabloMetre()));
            Paragraph para3 = new Paragraph(contents);
            try {
                document.add(para3);
            } catch (DocumentException ex) {
                Logger.getLogger(SiparisYazdir.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
