package com.jeongk.designpattern.proxy;

/*
* 프록시 패턴은 다른 객체에 대한 대표 또는 자리 표시자 객체를 만듭니다.
* 원격 또는 값 비싼 오브젝트에 대한 액세스를 제어하는 ​​데 도움이 됩니다.
*
* - Difference between Proxy and Decorator
* 프록시는 객체에 대한 액세스를 제어합니다.
* 클라이언트는 원하지 않는 액세스로부터 실제 피사체를 보호 할 수 있기 때문에 실제 피사체의 스탠드 인으로 사용할 수 있습니다.
* 장식자는 추가 동작을 추가하여 객체를 장식합니다.
*
* 프록시는 실제 대상을 인스턴스화 할 수 있지만 Decorator는 주제에 추가 동작 만 제공하고 인스턴스화하지 않습니다.
*/
public class ProxyDemo {

  public static void main(String[] args) {
    Proxy proxy = new Proxy();
    proxy.doSomething();
  }

}
