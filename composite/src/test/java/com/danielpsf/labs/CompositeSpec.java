package com.danielpsf.labs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.danielpsf.labs.Group;
import com.danielpsf.labs.Item;

public class CompositeSpec {

	@Test
	public void should_treat_items_the_same_way_as_groups() {
		Item item1 = new Item("test_item_1", 5.0);
		Item item2 = new Item("test_item_2", 2.0);
		Group group = new Group();
		group.add(item1);
		group.add(item2);
		
		double item1Price = item1.getPrice();
		double item2Price = item2.getPrice();
		double groupPrice = group.getPrice();
		
		assertThat(item1Price, is(equalTo(5.0)));
		assertThat(item2Price, is(equalTo(2.0)));
		assertThat(groupPrice, is(equalTo(7.0)));
	}

}
