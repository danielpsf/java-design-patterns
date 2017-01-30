package classes;

public abstract class AbstractComponent {
	protected String name;
	protected double size;
	protected boolean group = false;
	
	public AbstractComponent() {}

	public AbstractComponent(String name, double size) {
		this.name = name;
		this.size = size;
	}
	
	public AbstractComponent(String name, double size, boolean group) {
		this(name, size);
		this.setGroup(group);
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

	public void setSize(double size) {
		this.size = size;
	}
	
	public boolean isGroup() {
		return group;
	}

	public void setGroup(boolean group) {
		this.group = group;
	}

	public String getInfo() { return null; }
}
