# java8-functional-interface
Java Functional Interface in Java 8
- 단 1개의 public abstract method 만 있는 Interface 
- 함수의 arguement 로 lummda 사용

## Consumer 함수기능 인터페이스
- return 값이 없이 소비만 하는 accept() 를 가지고 있음

## Supplier 함수기능 인터페이스
- 매개 변수는 없고 리턴값이 있는 getXXX() 메소드
- 메소드들은 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역할

## Function 함수기능 인터페이스
- 매개값과 리턴값이 있는 applyXXX() 메소드
- 매개값을 리턴값으로 매핑하는 역할

## Operator 함수기능 인터페이스
- 매개 변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있음.
- 매개값을 이용해서 연산을 수행한 후 동일한 타입으로 리턴값을 제공하는 역할

## Predicate 함수기능 인터페이스
- 매개 변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고 있음.
- 매개값을 조사해서 true 또는 false를 리턴함.
