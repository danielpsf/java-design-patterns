package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.ItemBase;

public class CompositeItem extends Item implements ItemBase {
	private List<Item> items = new ArrayList<Item>();
	
	public CompositeItem() {
		super();
	}

	public CompositeItem(String name, double size) {
		super(name, size);
	}

	@Override
	public void print() {
		for (Item item : items) {
			item.print();
		}
	}

	public List<Item> getItems() {
		return items;
	}

	public void addItems(Item item) {
		this.items.add(item);
	}
	
}
