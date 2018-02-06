package com.jeongk.designpattern.proxy;

public class RealSubject implements Subject {

  @Override
  public void doSomething() {
    System.out.println("Real object.. Doing some real work !!");
  }

}
