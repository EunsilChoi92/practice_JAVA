package com.practice.valuable;

public class Valuable1 {
    public static void main(String[] args) {
        //1. 변수 --
        //변수란?
        //하나의 값을 담는 저장공간(메모리)
        //변수명: 메모리 주소에 붙여진 이름
        //리터럴: 변수가 담고 있는 값
        //변수는 한 가지 타입의, 하나의 값만 저장 가능

        //변수의 타입
        //기본타입, 클래스타입

        //기본타입
        //정수타입, 실수타입, 논리타입

        //1-1. 정수타입
        //byte, char, short, int, long
        //char: character의 줄임말
        //     : 유니코드를 저장
        //int: 제일 많이 쓰는 정수타입
        //long: int보다 더 큰 숫자를 저장할 때 사용하는 정수타입

        //변수는 변수선언 + 초기화
        //변수선언: 변수타입 변수명
        //초기화: 변수명 = 값;

        int a;  //변수선언(단 한 번만)
        a = 3;  //초기화

        int b = 4; //변수선언 + 초기화(많이 사용)

        //변수명은 위에 사용했던 변수명을 재사용할 수 없음

        a = 5;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //정수 뒤에 L 또는 l을 붙이면 long으로 인식
        long v1 = 3234242342342L;
        //4byte의 int는 8byte인 long을 담을 수 없음
        //int v2 = 2342342344234; //4Byte가 담기에는 너무 큰 숫자다.
        //int v3 = 2342342344234L; //int라서 long 타입을 담을 수 없다.




    }
}
