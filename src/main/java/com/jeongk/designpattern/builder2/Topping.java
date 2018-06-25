package com.jeongk.designpattern.builder2;

public enum Topping {
	PEPPERONI {
		@Override
		public float getCost() {
			return 30;
		}
	}, CHICKEN {
		@Override
		public float getCost() {
			return 35;
		}
	}, MUSHROOM {
		@Override
		public float getCost() {
			return 20;
		}
	};
	public abstract float getCost();
}
