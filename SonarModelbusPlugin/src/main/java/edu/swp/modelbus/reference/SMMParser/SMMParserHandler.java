package edu.swp.modelbus.reference.SMMParser;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SMMParserHandler extends DefaultHandler {
	
	public String exampleResultString = "";
	
	@Override
	public void startDocument(){
		exampleResultString += ("SMM-Dokument gestartet.");
	}
	
	@Override
	public void endDocument(){
		exampleResultString += ("SMM-Dokument beendet.");
	}
	
	@Override
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts){
		System.out.println("##########################################################");
		System.out.println("namespaceURI: " + namespaceURI);
		System.out.println("localName: " + localName);
		System.out.println("qName: " + qName);
		for(int i = 0; i < atts.getLength(); i++){
			exampleResultString += ("Attribute nr. " + i + " = " + atts.getQName(i) + atts.getValue(i));
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length){
		System.out.println("characters");
		for(int i = 0; i < (start + length); i++){
			System.out.print(ch[i]);
		}
	}
}
