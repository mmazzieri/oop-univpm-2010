package it.univpm.progogg.xml;

import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class StreamBuider {
	public static void main(String[] args) throws XMLStreamException {
		XMLOutputFactory factory = XMLOutputFactory.newInstance();
		StringWriter sw = new StringWriter();
		XMLStreamWriter writer = factory.createXMLStreamWriter(sw);
		writer.writeStartDocument();
		writer.writeStartElement("albero");
		writer.writeAttribute("altezza", "10m");
		for (int i = 1; i <= 10; i++) {
			writer.writeStartElement("ramo" + i);
			writer.writeCharacters("text of node " + i);
			writer.writeEndElement();
		}
		
		writer.writeEmptyElement("banner");
		writer.writeEndElement();
		writer.writeEndDocument();
		
		System.out.println(sw);
	}
}
