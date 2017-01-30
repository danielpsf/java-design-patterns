package classes;

public class Item extends AbstractComponent {

	public Item() {
		super();
	}
	
	public Item(String name, double size) {
		super(name, size);
	}

	@Override
	public String getInfo() {
		return "Item name: " + this.getName() + ". Item size: " + this.getSize();
	}

	public String getName() {
		return this.name;
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
