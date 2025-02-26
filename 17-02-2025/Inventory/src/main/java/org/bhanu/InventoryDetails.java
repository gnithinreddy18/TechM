package org.bhanu;

public class InventoryDetails {
	private String name;
	private int count;
	private float cost;
	public InventoryDetails(String name, int count, float cost) {
		this.name=name;
		this.count=count;
		this.cost=cost;
	}
	public void display() {
		System.out.println("Item name is: "+name);
		System.out.println("Quanitity is: "+count);
		System.out.println("Price per item is: \u20B9"+cost);
		System.out.println("Total cost is: \u20B9"+(cost*count));
	}
}
