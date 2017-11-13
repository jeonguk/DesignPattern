package com.jeongk.designpattern.factorymethod.idcard;

import java.util.Vector;

import com.jeongk.designpattern.factorymethod.framework.Factory;
import com.jeongk.designpattern.factorymethod.framework.Product;

public class IDCardFactory extends Factory {
	
	private Vector<String> owners = new Vector<>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public Vector<String> getOwners() {
		return owners;
	}
}
