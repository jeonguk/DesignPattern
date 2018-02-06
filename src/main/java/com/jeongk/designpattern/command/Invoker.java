package com.jeongk.designpattern.command;

/*
* Command 패턴은 요청을 객체로 캡슐화하므로 클라이언트를 다른 매개 변수로 매개 변수화 할 수 있습니다.
* 요청, 큐 또는 로그 요청, 실행 취소 가능한 작업 지원 등이 있습니다. [GOF 정의]
*/
public class Invoker {

  ICommand cmd;

  public void executeComand(ICommand cmd) {
    this.cmd = cmd;
    cmd.doSomething();
  }

}
