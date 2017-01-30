package classes;

import java.util.ArrayList;
import java.util.List;

public class Group extends AbstractComponent {
	private List<AbstractComponent> items = new ArrayList<AbstractComponent>();
	
	public Group() {
		super();
	}

	public Group(String name, double size) {
		super(name, size);
	}

	@Override
	public double getPrice() {
		double price = 0;		
		for (AbstractComponent item : items) {
			price += item.getPrice();
		}
		
		return price;
	}

	public List<AbstractComponent> getItems() {
		return items;
	}

	public void add(AbstractComponent item) {
		this.items.add(item);
	}
	
}
