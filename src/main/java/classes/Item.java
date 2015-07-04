package classes;

import interfaces.ItemBase;

public class Item implements ItemBase {
	private String name;
	private double size;

	public Item() {}
	
	public Item(String name, double size) {
		super();
		this.name = name;
		this.size = size;
	}

	@Override
	public void print() {
		System.out.println("Item name: " + this.getName() + ". Item size: " + this.getSize());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

}
