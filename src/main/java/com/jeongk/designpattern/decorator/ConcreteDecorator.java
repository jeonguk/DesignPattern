package com.jeongk.designpattern.decorator;

public class ConcreteDecorator extends Decorator {

  public ConcreteDecorator(Component comp) {
    super(comp);
  }

  public void doSomething() {
    super.doSomething();
    System.out.println("Performing Additional functionalities in Concrete Decorator");
  }

}
