package com.danielpsf.labs;

public abstract class AbstractComponent {
	protected String name;
	protected double price;
	
	public AbstractComponent() {}

	public AbstractComponent(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double size) {
		this.price = size;
	}
}
