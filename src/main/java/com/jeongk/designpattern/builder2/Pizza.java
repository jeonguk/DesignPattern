package com.jeongk.designpattern.builder2;

public class Pizza {
	private float totalPrice = 0;
	private Size size;
	private Topping topping;
	private Crust crust;
	private Cheese cheese;

	public void addToPrice(float price) {
		this.totalPrice = totalPrice + price;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public void setTopping(Topping topping) {
		this.topping = topping;
	}

	public void setCrust(Crust crust) {
		this.crust = crust;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public Size getSize() {
		return size;
	}

	public Topping getTopping() {
		return topping;
	}

	public Crust getCrust() {
		return crust;
	}

	public Cheese getCheese() {
		return cheese;
	}
}
