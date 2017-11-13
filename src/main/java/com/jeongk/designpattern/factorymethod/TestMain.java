package com.jeongk.designpattern.factorymethod;

import com.jeongk.designpattern.factorymethod.framework.Factory;
import com.jeongk.designpattern.factorymethod.framework.Product;
import com.jeongk.designpattern.factorymethod.idcard.IDCardFactory;

/**
 * Factory Method Pattern Test Class
 * - 인스턴스 작성을 하위 클래스에게 위임
 * @author jk
 *
 */
public class TestMain {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("MIKE");
		Product card2 = factory.create("DAVID");
		Product card3 = factory.create("JEONGUK");
		card1.use();
		card2.use();
		card3.use();
	}
}
