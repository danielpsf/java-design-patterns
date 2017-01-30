package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.ItemBase;

public class Group extends AbstractComponent {
	private List<AbstractComponent> items = new ArrayList<AbstractComponent>();
	
	public Group() {
		super();
		super.setGroup(true);
	}

	public Group(String name, double size) {
		super(name, size, true);
	}

	@Override
	public String getInfo() {
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append("\r\tBox of items containing:\r ");
		
		for (AbstractComponent item : items) {
			strBuilder.append("\t\t- ");
			strBuilder.append(item.getInfo());
		}
		
		return strBuilder.toString();
	}

	public List<AbstractComponent> getItems() {
		return items;
	}

	public void addItems(AbstractComponent item) {
		this.items.add(item);
	}
	
}
