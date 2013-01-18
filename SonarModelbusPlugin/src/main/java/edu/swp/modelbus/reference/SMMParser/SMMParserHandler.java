package edu.swp.modelbus.reference.SMMParser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import edu.swp.modelbus.reference.batch.CountClassesDecorator;


public class SMMParserHandler extends DefaultHandler {
	public static final Logger LOG = LoggerFactory.getLogger(CountClassesDecorator.class);
	public String exampleResultString = "";
	
	public float numberOfClasses = 3; 
	public String numberOfClassesId = null;
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
		
		
		if(qName.equals("sMMElement")) {
			//Mesurement definitiin for count classes
			if(atts.getValue("xsi:type").equals("SoftwareMetricsMetamodel2:DirectMeasure"));
			{
				numberOfClassesId = atts.getValue("xmi:id");
			}
			
			//get the value of metrino
			if( atts.getValue("measure") != null)
			{
				LOG.info("INSIDE!!");
				numberOfClasses = Float.parseFloat(atts.getValue("value"));
			}
		
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
