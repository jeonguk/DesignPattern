package com.jeongk.designpattern.abstractfactory.factory;

/**
 * 추상적인 부품 : Link class
 * @author jk
 *
 */
public abstract class Link extends Item {
	protected String url;
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
}
