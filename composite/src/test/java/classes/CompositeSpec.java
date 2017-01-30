package classes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import interfaces.ItemBase;

public class CompositeSpec {

	@Test
	public void should_treat_items_the_same_way_as_groups() {
		Item item = new Item("test_item", 5.0);
		Group group = new Group();
		
		group.addItems(item);
		
		assertThat(item.getInfo(), is(equalTo("Item name: test_item. Item size: 5.0")));
		assertThat(group.getInfo(), is(equalTo("\r\tBox of items containing:\r \t\t- Item name: test_item. Item size: 5.0")));
	}

}
