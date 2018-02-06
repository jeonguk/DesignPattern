package com.jeongk.designpattern.iteratorpattern;

public class IteratorPatternDemo {

  public static void main(String[] args) {
    ColorCollection colorCollection = new ColorCollection();
    Iterator iter = colorCollection.createIterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }

  }

}
