package com.jeongk.designpattern.decorator;

/*
* Decorator 패턴은 객체 자체를 수정하지 않고 객체에 책임을 추가합니다.
* 기존 객체에 대한 추가 기능이 필요할 때이 패턴을 사용할 수 있습니다.
* 원래 클래스를 래핑하고 필수적인 추가 기능을 제공하는 데코레이터 클래스를 만드는 것이 좋습니다.
*
* - 데코레이터를 사용하면 기존 코드를 수정하지 않고도 behavior 를 확장 할 수 있습니다.
* 이것은 Open-Closed 원칙에 부합합니다.
* 즉, 클래스는 확장을 위해 열려 있어야하지만 수정을 위해 닫혀 있어야합니다.
*/
public class DecoratorDemo {

  public static void main(String[] args) {
    Component component = new ConcreteComponent();

    ConcreteDecorator decoratedComponent = new ConcreteDecorator(component);
    decoratedComponent.doSomething();
  }

}
