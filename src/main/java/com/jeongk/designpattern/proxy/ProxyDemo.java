package com.jeongk.designpattern.proxy;

/*
* 프록시 패턴은 다른 객체에 대한 대표 또는 자리 표시자 객체를 만듭니다.
* 원격 또는 값 비싼 오브젝트에 대한 액세스를 제어하는 ​​데 도움이 됩니다.
*/
public class ProxyDemo {

  public static void main(String[] args) {
    Proxy proxy = new Proxy();
    proxy.doSomething();
  }

}
