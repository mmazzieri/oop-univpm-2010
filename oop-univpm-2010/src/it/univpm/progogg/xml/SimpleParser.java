package it.univpm.progogg.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class SimpleParser {

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(SimpleParser.class
				.getResourceAsStream("277280.xml"));
		Element root = document.getDocumentElement();
		System.out.println("Document root: " + root.getTagName());
		NodeList children = root.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
			System.out.println("Element " + i + " (" + child.getNodeName()
					+ "): " + child.getTextContent());
			if (child instanceof Element) {
				Element childElement = (Element) child;
				Node content = childElement.getFirstChild();
				if (content instanceof Text) {
					Text textNode = (Text) content;
					String text = textNode.getData().trim();
					System.out.println("Content: " + text);
				}
			}
		}
	}
}
