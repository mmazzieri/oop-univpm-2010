package it.univpm.progogg.xml;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class SimpleBuilder {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = documentFactory.newDocumentBuilder();
		Document document = builder.newDocument();
		Element rootElement = document.createElement("albero");
		rootElement.setAttribute("altezza", "10m");
		document.appendChild(rootElement);
		for (int i = 1; i <= 10; i++) {
			Element childElement = document.createElement("ramo" + i);
			rootElement.appendChild(childElement);
			Text textNode = document.createTextNode("text of node " + i);
			childElement.appendChild(textNode);
		}
		
		TransformerFactory trasformerFactory = TransformerFactory.newInstance();
		Transformer t = trasformerFactory.newTransformer();
		
		StringWriter sw = new StringWriter();
		t.transform(new DOMSource(document), new StreamResult(sw));
		System.out.println(sw);
	}
}
