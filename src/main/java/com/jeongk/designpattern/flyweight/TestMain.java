package com.jeongk.designpattern.flyweight;

import com.jeongk.designpattern.flyweight.PersonFactory.Person;

/**
 * Flyweight 는 동일한 것을 공유해서 객체 생성을 줄여 가볍게 만드는 것입니다.
 */
public class TestMain {

  public static void main(String[] args) {
    Person p1 = PersonFactory.getPerson("홍길동");
    Person p2 = PersonFactory.getPerson("김말자");
    Person p3 = PersonFactory.getPerson("홍길동");

    System.out.println(p1 == p2);
    System.out.println(p1 == p3);
  }

}
