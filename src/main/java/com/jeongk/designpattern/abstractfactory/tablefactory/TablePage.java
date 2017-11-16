package com.jeongk.designpattern.abstractfactory.tablefactory;

import java.util.Iterator;

import com.jeongk.designpattern.abstractfactory.factory.Item;
import com.jeongk.designpattern.abstractfactory.factory.Page;

/**
 * 구체적인 제품 : TablePage class
 * @author jk
 *
 */
public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}

	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<td>");
		sb.append("<table width=\"100%\" border=\"1\"></tr>");
		sb.append("<td>");
		sb.append("<tr>");
		Iterator<Item> it = content.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</tr>");
		sb.append("</table>");
		return sb.toString();	
	}
}
