package com.jeongk.designpattern.abstractfactory.factory;

/**
 * 추상적인 부품 : Item class
 * @author jk
 *
 */
public abstract class Item {
	protected String caption;
	public Item(String caption) {
		this.caption = caption;
	}
	public abstract String makeHTML();
}
