package com.jeongk.designpattern.abstractfactory.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Vector;

/**
 * 추상적인 제품 : Page class
 * @author jk
 *
 */
public abstract class Page {
	protected String title;
	protected String author;
	protected Vector<Item> content = new Vector<>();
	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void add(Item item) {
		content.add(item);
	}
	public void output() {
		try {
			String fileName = title + ".html";
			Writer writer = new FileWriter(fileName);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(fileName + "을 작성했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public abstract String makeHTML();
}
