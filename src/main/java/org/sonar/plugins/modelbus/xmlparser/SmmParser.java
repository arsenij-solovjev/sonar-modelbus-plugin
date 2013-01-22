package org.sonar.plugins.modelbus.xmlparser;

import java.io.IOException; 
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SmmParser extends DefaultHandler {
	public static final Logger LOG = LoggerFactory.getLogger(SmmParser.class);

	public List<SmmMeasurement> measures = new ArrayList<SmmMeasurement>();

	@Override
	public void startDocument() {
		System.out.println("Dokument gestartet!");
	}

	@Override
	public void endDocument() {
		System.out.println("Dokument beendet!");
		System.out.println("Ergebnisse: ");
		printList();
	}

	@Override
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) {
		if (qName.equals("sMMElement")) {
			// if this is a normal element, describing a new metric
			if (atts.getValue("xsi:type").equals("SoftwareMetricsMetamodel2:DirectMeasure")) {
				String id = atts.getValue("xmi:id");
				String name = atts.getValue("name");
				String description = atts.getValue("description");
				SmmMeasurement m = new SmmMeasurement(id, name, description);
				LOG.info(m.toString());
				measures.add(m);
			}
			// if this is an element, describing the result of the computed
			// metric
			if (atts.getValue("xsi:type").equals("SoftwareMetricsMetamodel2:DirectMeasurement")) {
				String measure = atts.getValue("measure");
				// get index of object in the list
				int index = getIndexOfMeasurement(measure);
				Float value = Float.parseFloat(atts.getValue("value"));
				// the corresponding measure is in the list, thus just update
				// its 'value' field
				updateMeasurement(index, value);
			}
		}
	}

	private void updateMeasurement(int index, float value) {
		// LOG.info("INSIDE!!");
		SmmMeasurement m = measures.get(index);
		m.setValue(value);
	}

	// why not use measures.indexOf(measure) ?
	private int getIndexOfMeasurement(String measure) {
		for (int i = 0; i < measures.size(); i++) {
			if (measures.get(i).getId().equals(measure)) {
				return measures.indexOf(measures.get(i));
			}
		}
		return -1;
	}

	private void printList() {
		Iterator<SmmMeasurement> iterator = measures.iterator();
		while (iterator.hasNext()) {
			SmmMeasurement measurement = iterator.next();
			System.out.println(measurement);
		}
	}

	public void parse(InputStream file) {
		// create SAX parser
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser;
		try {
			saxParser = factory.newSAXParser();
			// call parser handler
			SmmParser handler = new SmmParser();
			saxParser.parse(file, handler);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
