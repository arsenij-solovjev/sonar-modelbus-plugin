package org.sonar.plugins.modelbus.xmlparser;

public class SmmMeasurement {
	
	private String id;
	private String name;
	private String description;
	private double value;
	
	public SmmMeasurement(String id, String name, String description, double value) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	public SmmMeasurement(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Measurement [id=" + id + ", name=" + name + ", description="
				+ description + ", value=" + value + "]";
	}
}
 