package com.jeongk.designpattern.abstractfactory.listfactory;

import java.util.Iterator;

import com.jeongk.designpattern.abstractfactory.factory.Item;
import com.jeongk.designpattern.abstractfactory.factory.Page;

/**
 * 구체적인 제품 : ListPage class
 * @author jk
 *
 */
public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><title>" + title + "</title></head>\n");
		sb.append("<body>\n");
		sb.append("<h1>" + title + "</h1>\n");
		sb.append("<ul>\n");
		Iterator<Item> it = content.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("<hr><address>" + author + "</address>");
		sb.append("</body></html>\n");
		return sb.toString();
	}

}
