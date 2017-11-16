package com.jeongk.designpattern.abstractfactory.listfactory;

import com.jeongk.designpattern.abstractfactory.factory.Factory;
import com.jeongk.designpattern.abstractfactory.factory.Link;
import com.jeongk.designpattern.abstractfactory.factory.Page;
import com.jeongk.designpattern.abstractfactory.factory.Tray;

/**
 * 구체적인 공장 : ListFactory class
 * @author jk
 *
 */
public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
	
}
