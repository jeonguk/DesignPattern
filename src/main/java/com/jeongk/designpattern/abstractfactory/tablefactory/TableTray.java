package com.jeongk.designpattern.abstractfactory.tablefactory;

import java.util.Iterator;

import com.jeongk.designpattern.abstractfactory.factory.Item;
import com.jeongk.designpattern.abstractfactory.factory.Tray;

/**
 * 구체적인 부품 : TableTray class
 * @author jk
 *
 */
public class TableTray extends Tray {

	public TableTray(String caption) {
		super(caption);
	}

	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<td>");
		sb.append("<table width=\"100%\" border=\"1\"></tr>");
		sb.append("<td>");
		sb.append("<tr>");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</tr>");
		sb.append("</table>");
		return sb.toString();		
	}
}
