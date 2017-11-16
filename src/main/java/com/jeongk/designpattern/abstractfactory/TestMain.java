package com.jeongk.designpattern.abstractfactory;

import com.jeongk.designpattern.abstractfactory.factory.Factory;
import com.jeongk.designpattern.abstractfactory.factory.Link;
import com.jeongk.designpattern.abstractfactory.factory.Page;
import com.jeongk.designpattern.abstractfactory.factory.Tray;

/**
 * Abstract Factory Pattern Test Class
 * - 관련된 부품을 조립해서 제품을 만든다.
 * @author jk
 *
 */
public class TestMain {
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Usage: java TestMain class.name.of.ConcreateFactory");
			System.out.println("Example 1: java TestMain listfactory.ListFactory");
			System.out.println("Example 2: java TestMain tablefactory.TableFactory");
			System.exit(0);
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
		Link hani = factory.createLink("한겨레 신문", "http://www.hani.co.kr/");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(hani);

		Page page = factory.createPage("LinkPage", "Jeonguk Lee");
		page.add(traynews);
		page.output();
	}
	
}
