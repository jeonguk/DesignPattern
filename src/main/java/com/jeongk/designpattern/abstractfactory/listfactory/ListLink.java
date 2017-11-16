package com.jeongk.designpattern.abstractfactory.listfactory;

import com.jeongk.designpattern.abstractfactory.factory.Link;

/**
 * 구체적인 부품 : ListLink class
 * @author jk
 *
 */
public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}

}
