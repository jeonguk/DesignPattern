package com.jeongk.designpattern.command;

public class CommandPatternDemo {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();

    ICommand one = new CommandOne(receiver);
    ICommand two = new CommandTwo(receiver);

    Invoker invoker = new Invoker();
    invoker.executeComand(one);
    invoker.executeComand(two);
  }

}
