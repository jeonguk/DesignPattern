package com.jeongk.designpattern.abstractfactory.factory;

import java.util.Vector;

/**
 * 추상적인 부품 : Tray class
 * @author jk
 *
 */
public abstract class Tray extends Item {
	protected Vector<Item> tray = new Vector<>();
	public Tray(String caption) {
		super(caption);
	}
	public void add(Item item) {
		tray.add(item);
	}
}
