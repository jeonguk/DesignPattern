package com.jeongk.designpattern.builder;

public class TextBuilder extends Builder {

	private StringBuilder sb = new StringBuilder();
	
	@Override
	public void makeTitle(String title) {
		sb.append("============================================\n");
		sb.append(" " + title + " ");
		sb.append("\n");
	}

	@Override
	public void makeString(String str) {
		sb.append(" " + str + " ");
		sb.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			sb.append(" . " + items[i] + "\n");
		}
		sb.append("\n");
	}

	@Override
	public Object getResult() {
		sb.append("============================================\n");
		return sb.toString();
	}

}
