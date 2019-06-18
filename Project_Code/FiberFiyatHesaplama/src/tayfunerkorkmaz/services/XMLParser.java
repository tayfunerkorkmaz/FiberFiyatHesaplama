package tayfunerkorkmaz.services;

import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author tayfunerkorkmaz
 */
public class XMLParser {

    String gelenURL = null;
    NodeList nodul = null;
    Document doc = null;

    public XMLParser(String gelenURL) {
        this.gelenURL = gelenURL;
        xmlBaslat();
    }

    void xmlBaslat() {

        try {

            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            URL url = new URL(gelenURL);
            doc = builder.parse(url.openStream());
        } catch (Exception e) {
            System.err.print(e);
        }

    }

    public NodeList nodulGetir(String nodulGelen) {

        nodul = doc.getElementsByTagName(nodulGelen);
        return nodul;

    }

    private String getCharacterDataFromElement(Element e) {
        try {
            Node child = e.getFirstChild();
            if (child instanceof CharacterData) {
                CharacterData cd = (CharacterData) child;
                return cd.getData();
            }
        } catch (Exception ex) {
            System.err.print(e);
        }
        return "";
    }

    protected float getFloat(String value) {
        if (value != null && !value.equals("")) {
            return Float.parseFloat(value);
        }
        return 0;
    }

    public String getElementValue(Element parent, String label) {
        return getCharacterDataFromElement((Element) parent.getElementsByTagName(label).item(0));
    }

}
