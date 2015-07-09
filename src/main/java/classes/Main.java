package classes;

public class Main {

	public static void main(String[] args) {
		Item coffe = new Item("coffee", 0.5);
		Item orange = new Item("orange", 0.01);
		CompositeItem miniBox = new CompositeItem("Mini Box", 1);
		
		miniBox.addItems(orange);
		miniBox.addItems(coffe);
		
		CompositeItem box = new CompositeItem("Box", 2);
		box.addItems(miniBox);
		box.print();
	}

}
