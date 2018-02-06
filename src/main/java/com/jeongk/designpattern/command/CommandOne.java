package com.jeongk.designpattern.command;

public class CommandOne implements ICommand {

  Receiver receiver;

  public CommandOne(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void doSomething() {
    receiver.operation1();
  }

}
