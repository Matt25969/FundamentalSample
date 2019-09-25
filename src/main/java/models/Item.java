package models;

public class Item {
	
	private String name;
	private int value;

	public Item(String itemName, int itemValue) {
		
		this.name = itemName;
		this.value = itemValue;
		
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

}
