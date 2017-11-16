package com.jeongk.designpattern.abstractfactory.tablefactory;

import com.jeongk.designpattern.abstractfactory.factory.Link;

/**
 * 구체적인 부품 : TableLink 클래스
 * @author jk
 *
 */
public class TableLink extends Link {

	public TableLink(String caption, String url) {
		super(caption, url);
	}
	
	public String makeHTML() {
		return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
	}

}
