package com.jeongk.designpattern.iterator;

public class ItemShelfIterator implements Iterator {

	private ItemShelf itemShelf;
	private int index;
	
	public ItemShelfIterator(ItemShelf itemShelf) {
		this.itemShelf = itemShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index < itemShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Item item = itemShelf.getItemsAt(index);
		index++;
		return item;
	}

}
