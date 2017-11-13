package com.jeongk.designpattern.iterator;

/**
 * Iterator Pattern Test Main Class
 * 하나씩 열거하면서 처리 한다.
 * @author jk
 *
 */
public class TestMain {
	public static void main(String[] args) {
		ItemShelf itemShelf = new ItemShelf(4);
		itemShelf.apppendItem(new Item("Apple IPhone"));
		itemShelf.apppendItem(new Item("LG V30"));
		itemShelf.apppendItem(new Item("SAMSUNG Galaxy Note 8"));
		itemShelf.apppendItem(new Item("SONY Xperia™ XZ1"));
		Iterator it = itemShelf.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			System.out.println("" + item.getName());
		}
	}
}
