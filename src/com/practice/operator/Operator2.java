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
        int result5 = z++ + 10;

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

        int num1 = 50;
        int num2 = 30;
        int num3 = 10;
        int num4 = num1++ + --num2 + ++num3;

        System.out.println("num1 = " + num1);   //51
        System.out.println("num2 = " + num2);   //29
        System.out.println("num3 = " + num3);   //11
        System.out.println("num4 = " + num4);   //91

        System.out.println("\n-----------------------------------------------\n");

        int aa = 15;
        int bb = 10;
        int cc = 30;

        aa++;
        --bb;
        cc = --aa - bb++;

        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("cc = " + cc);

        System.out.println("\n-----------------------------------------------\n");


        //4. 논리 부정 연산자
        //- !는 논리 부정 연산자, 피연산자 앞에 붙임
        //- 피연산자가 true이면 false 값을 산출, 피연산자가 false이면 true 값을 산출
        boolean play = true;
        System.out.println("play = " + play);

        play = !play;
        System.out.println("play = " + play);

        play = !play;
        System.out.println("play = " + play);

        int num5 = 10;
        int num6 = 10;

        //내가 result라는 변수에다가 num5와 num6가 같냐는 물음의 결과를 저장하고 싶다면?
        boolean result = num5 == num6;
        System.out.println("result = " + !result);

        System.out.println("\n-----------------------------------------------\n");


        //5. 비트 반전 연산자(~)
        //- 정수 타입의 피연산자에만 사용됨
        //- 피연산자를 2진수로 표현했을 때 비트값인 0을 1로. 1은 0으로 반전함
        //- 10을 2진수로 표현하면 1010  -> 비트 반전 -> 0101
        //- 연산 후, 부호 비트인 최상위 비트를 포함해서 모든 비트가 반전되기 때문에 부호가 반대인 새로운 값이 산출됨
        //- 피연산자는 연산을 수행하기 전에 int 타입으로 변환되고 비트 반전이 일어남
        byte bV1 = 10;
        //byte bV2 = ~bV1;    //~v1이 iht 타입으로 변환되어서 컴파일 에러

        int v1 = 10;
        int v2 = ~v1;
        int v3 = ~v1 + 1;
        System.out.println("32비트 이진 문자열: " + toBinaryString(v1) + " 십진수: " + v1);
        System.out.println("32비트 이진 문자열: " + toBinaryString(v2) + " 십진수: " + v2);
        System.out.println("32비트 이진 문자열: " + toBinaryString(v3) + " 십진수: " + v3);

        System.out.println("\n-----------------------------------------------\n");

        int v4 = -10;
        int v5 = ~v4;
        int v6 = ~v4 + 1;
        System.out.println("32비트 이진 문자열: " + toBinaryString(v4) + " 십진수: " + v4);
        System.out.println("32비트 이진 문자열: " + toBinaryString(v5) + " 십진수: " + v5);
        System.out.println("32비트 이진 문자열: " + toBinaryString(v6) + " 십진수: " + v6);

        //- 2의 보수 구하기
        //- 10진수의 절대값을 2진수로 바꾼 다움 모두 뒤집고 1을 더해서 부호를 붙임


    }

    //정수값을 32비트의 이진 문자열로 리턴
    public static String toBinaryString(int value) {
        String str = Integer.toBinaryString(value);
        while(str.length() < 32) {
            str = "0" + str;
        }

        return str;
    }
}
