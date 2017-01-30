package classes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CompositeSpec {

	@Test
	public void should_treat_items_the_same_way_as_groups() {
		Item item1 = new Item("test_item_1", 5.0);
		Item item2 = new Item("test_item_2", 2.0);
		Group group = new Group();
		group.add(item1);
		group.add(item2);
		
		double item1Price = item1.getPrice();
		double groupPrice = group.getPrice();
		
		assertThat(item1Price, is(equalTo(5.0)));
		assertThat(groupPrice, is(equalTo(7.0)));
	}

}
