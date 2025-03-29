import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el XML en formato texto:");
        StringBuilder xmlString = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;  // Presionar ENTER en blanco para finalizar la entrada
            xmlString.append(line).append("\n");
        }
        scanner.close();

        // Convertir string a documento XML
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new ByteArrayInputStream(xmlString.toString().getBytes()));

        // Generar los XPaths
        recorrerNodos(doc.getDocumentElement(), "");
    }

    public static void recorrerNodos(Node nodo, String path) {
        if (nodo.getNodeType() == Node.ELEMENT_NODE) {
            String nuevoPath = path + "/" + nodo.getNodeName();
            System.out.println(nuevoPath);

            // Imprimir atributos
            NamedNodeMap atributos = nodo.getAttributes();
            for (int i = 0; i < atributos.getLength(); i++) {
                Node attr = atributos.item(i);
                System.out.println(nuevoPath + "/@" + attr.getNodeName());
            }

            // Si tiene texto, lo imprimimos
            String texto = nodo.getTextContent().trim();
            if (!texto.isEmpty() && nodo.getChildNodes().getLength() == 1) {
                System.out.println(nuevoPath + "/text() = \"" + texto + "\"");
            }

            // Recorrer hijos
            NodeList hijos = nodo.getChildNodes();
            for (int i = 0; i < hijos.getLength(); i++) {
                recorrerNodos(hijos.item(i), nuevoPath);
            }
        }
    }
}