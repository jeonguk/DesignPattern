package com.jeongk.designpattern.builderpattern;

public class BuilderPatternTest {

  public static void main(String[] args) {
    // 빌더 객체 생성
    PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
    // 빌더 객체데 데이터 입력
    PersonInfo result = personInfoBuilder.setName("NAME")
            .setAge(20)
            .setFavoriteAnimal("cat")
            .setFavoriteColor("blue")
            .setFavoriteNumber(5)
            .build();
    System.out.println(result.getPersonInfo());
  }

}
