package edu.swp.modelbus.reference.SMMParser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import edu.swp.modelbus.reference.batch.CountClassesDecorator;


public class SMMParserHandler extends DefaultHandler {
	public static final Logger LOG = LoggerFactory.getLogger(CountClassesDecorator.class);

	// List of all Measurement objects
	public List<Measurement> measures = new ArrayList<Measurement>();

	@Override
	public void startDocument(){
		System.out.println("Dokument gestartet!");
	}

	@Override
	public void endDocument(){
		System.out.println("Dokument beendet!");
		System.out.println("Ergebnisse: ");
		printList();
	}

	@Override
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts){
		if(qName.equals("sMMElement")) {
			// if this is a normal element, describing a new metric
			if(atts.getValue("xsi:type").equals("SoftwareMetricsMetamodel2:DirectMeasure")) {
				String id = atts.getValue("xmi:id");
				String name = atts.getValue("name");
				String description = atts.getValue("description");
				Measurement m = new Measurement(id, name, description);
				measures.add(m);
			}
			// if this is an element, describing the result of the domputed metric
			if(atts.getValue("xsi:type").equals("SoftwareMetricsMetamodel2:DirectMeasurement")) {
				String measure = atts.getValue("measure");
				// get index of object in the list
				int index = getIndexOfMeasurement(measure);
				Float value = Float.parseFloat(atts.getValue("value"));
				// the corresponding measure is in the list, thus just update its 'value' field
				updateMeasurement(index, value);
			}
		}
	}

	private void updateMeasurement(int index, float value){
		//LOG.info("INSIDE!!");
		Measurement m = measures.get(index);
		m.setValue(value);
	}

	private int getIndexOfMeasurement(String measure){		
		for(int i = 0; i < measures.size(); i++){
			if(measures.get(i).getId().equals(measure)){
				return measures.indexOf(measures.get(i));
			}
		}
		return -1;
	}

	private void printList(){
		Iterator<Measurement> iterator = measures.iterator();
		while(iterator.hasNext()){
			Measurement measurement = iterator.next();
			System.out.println(measurement);
		}
	}
}
