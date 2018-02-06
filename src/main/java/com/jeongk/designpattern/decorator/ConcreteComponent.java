package com.jeongk.designpattern.decorator;

public class ConcreteComponent extends Component {

  @Override
  public void doSomething() {
    System.out.println("Original Component Functionalities");
  }

}
