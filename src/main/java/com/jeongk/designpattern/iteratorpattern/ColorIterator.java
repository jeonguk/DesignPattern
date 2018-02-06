package com.jeongk.designpattern.iteratorpattern;

public class ColorIterator implements Iterator {

  String[] colors;
  int position = 0;

  public ColorIterator(String[] colors) {
    this.colors = colors;
  }

  @Override
  public boolean hasNext() {
    if (position >= colors.length || colors[position] == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public String next() {
    String color = colors[position];
    position++;
    return color;
  }

}
