package com.jeongk.designpattern.proxy;

public class Proxy implements Subject {

  RealSubject rs;

  @Override
  public void doSomething() {
    System.out.println("Proxy object.. calling real object");
    if (rs == null) {
      rs = new RealSubject();
    }
    rs.doSomething();
  }

}
