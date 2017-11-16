package com.jeongk.designpattern.abstractfactory.listfactory;

import java.util.Iterator;

import com.jeongk.designpattern.abstractfactory.factory.Item;
import com.jeongk.designpattern.abstractfactory.factory.Tray;

/**
 * 구체적인 부품 : ListTray class
 * @author jk
 *
 */
public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<li>\n");
		sb.append(caption + "\n");
		sb.append("<ul>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("</li>\n");
		return sb.toString();
	}

}
