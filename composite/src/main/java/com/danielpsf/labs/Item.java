package com.danielpsf.labs;

public class Item extends AbstractComponent {

	public Item() {
		super();
	}
	
	public Item(String name, double size) {
		super(name, size);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(float size) {
		this.price = size;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
