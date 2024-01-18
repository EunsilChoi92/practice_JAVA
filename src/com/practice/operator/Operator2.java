package com.practice.operator;

public class Operator2 {
    public static void main(String[] args) {
        //1. 단항 연산자
        //- 피연산자가 단 하나뿐인 연산자
        //- 부호 연산자(+, -), 증감 연산자(++, --), 논리 부정 연산자(!), 비트 반전 연산자(~)가 있음


        //2. 부호 연산자
        //- 양수 및 음수를 표시하는 +, - 를 말함
        //- boolean 타입과 char 타입을 제외한 나머지 기본 타입에 사용할 수 있음
        //- +, -는 산술 연산자이기도 하고, 부호 연산자이기도 함
        //- 부호 연산자로 쓰일 때에는 하나의 피연산자만 필요
        int i1 = +100;
        int i2 = -100;
        double d1 = +3.14;
        double d2 = -10.5;

        //- 부호 연산자는 정수 또는 실수 타입 변수 앞에 붙일 수도 있음
        //- 이 경우 변수를 양수 및 음수로 표현한 것이 아니고, 변수 값의 부호를 유지하거나 바꾸기 위해 사용
        int x = -100;
        int result1 = +x;
        int result2 = -x;

        //- 부호 연산자의 산출 타입은 int 타입이 됨
        short s = 100;
        //short result3 = -s;    //s가 int값으로 바뀌면서 컴파일 에러 발생
        int result3 = -s;


        //3. 증감 연산자
        //- 변수의 값을 1 증가(++)시키거나 1 감소(--)시키는 연산자를 말함
        //- boolean을 제외한 모든 기본 타입의 피연산자에 사용할 수 있음
        //- 증감 연산자의 위치에 따라 연산식의 결과가 다르게 나옴(전치, 후치)
        int y = 1;
        int z = 1;
        int result4 = ++y + 10;
        int result5 = y++ + 10;

        int a = 10;
        int b = 10;
        int c;

        System.out.println("\n-----------------------------------------------\n");

        a++;
        ++a;
        System.out.println("a = " + a);

        System.out.println("\n-----------------------------------------------\n");

        b--;
        --b;
        System.out.println("b = " + b);

        System.out.println("\n-----------------------------------------------\n");

        c = a++;
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        System.out.println("\n-----------------------------------------------\n");

        c = ++a;
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        System.out.println("\n-----------------------------------------------\n");

        c = ++a + b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\n-----------------------------------------------\n");

    }
}
