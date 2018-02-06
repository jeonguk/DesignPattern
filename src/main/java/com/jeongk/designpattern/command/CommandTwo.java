package com.jeongk.designpattern.command;

public class CommandTwo implements ICommand {

  Receiver receiver;

  public CommandTwo(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void doSomething() {
    receiver.operation2();
  }

}
