package com.jeongk.designpattern.decorator;

public class Decorator extends Component {

  Component comp;

  public Decorator(Component comp) {
    this.comp = comp;
  }

  @Override
  public void doSomething() {
    comp.doSomething();
  }

}
