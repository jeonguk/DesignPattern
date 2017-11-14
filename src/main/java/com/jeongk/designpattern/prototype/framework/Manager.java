package com.jeongk.designpattern.prototype.framework;

import java.util.Hashtable;

public class Manager {
	private Hashtable<String, Product> showcase = new Hashtable<>();
	public void register(String name, Product product) {
		showcase.put(name, product);
	}
	public Product create(String productName) {
		Product p = showcase.get(productName);
		return p.createClone();
	}
}
