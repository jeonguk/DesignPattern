package com.jeongk.designpattern.iterator;

public class ItemShelf implements Aggregate {
	
	private Item[] items;
	private int last = 0;
	
	public ItemShelf(int maxSize) {
		this.items = new Item[maxSize];
	}
	
	public Item getItemsAt(int index) {
		return items[index];
	}
	
	public void apppendItem(Item item) {
		this.items[last] = item;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public Iterator iterator() {
		return new ItemShelfIterator(this);
	}
}
