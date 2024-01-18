package com.practice.variable;

public class Variable6 {
    public static void main(String[] args) {
        //1. 타입 변환
        //- 데이터 타입을 다른 데이터 타입으로 변환하는 것을 말함


        //2. 자동 타입 변환(Promotion)
        //- 프로그램 실행 도중에 자동적으로 타입 변환이 일어나는 것
        //- 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때 발생함
        //- byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
        //- 자동 타입 변환이 발생되면 변환 이전의 값과 변환 이후의 값은 동일함
        //- char 타입의 경우 int 타입으로 자동 변환되면 유니코드 값이 int 타입에 저장됨

        char charValue0 = 'A';
        int intValue0 = charValue0;   //65가 저장됨

        //char는 2byte의 크기를 가지지만 음수를 저장할 수 없으므로 byte타입은 char 타입으로 자동 변환할 수 없음
        byte byteValue0 = 65;
        //char charValue1 = byteValue0;          //컴파일 에러(자동 변환 불가)
        char charData0 = (char) byteValue0;       //강제 타입 변환

        byte byteValue = 10;
        int intValue = byteValue;       //int <- byte
        System.out.println("intValue = " + intValue);

        char charValue = '가';
        intValue = charValue;           //int <- char
        System.out.println("가의 유니코드 = " + intValue);

        intValue = 500;
        long longValue = intValue;      //long <- int
        System.out.println("longValue = " + longValue);

        intValue = 200;
        double doubleValue = intValue;  //double <- int
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("\n-----------------------------------------------\n");


        //3. 강제 타입 변환(Casting)
        //- 큰 크기의 타입은 작은 크기의 타입으로 자동 타입 변환을 할 수가 없음
        //- 하지만 큰 타입의 값을 쪼개어서 그 일부만 작은 타입에 저장하는 것은 가능
        //- 강제 타입 변환은 캐스팅 연산자 ()를 사용
        //- 큰 타입의 변수값이 작은 타입의 범위 내라면 버려지는 값 없이 그대로 저장 가능(75P)

        int intValue1 = 44032;  //유니코드값 범위 내(0 ~ 65535)
        char charValue1 = (char) intValue1;
        System.out.println("charValue1 = " + charValue1);

        long longValue1 = 500;
        intValue1 = (int) longValue1;
        System.out.println("intValue1 = " + intValue1);

        double doubleValue1 = 3.14;
        intValue1 = (int) doubleValue1;
        System.out.println("intValue1 = " + intValue1);

        //- 강제 타입 변환을 할 때에는 값 손실이 발생하는지 검사하는 것이 중요함

        int i = 128;
        if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
            System.out.println("byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 확인해주세요.");
        } else {
            byte b = (byte) i;
            System.out.println(b);
        }

        //- 정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 파악해야 함

        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.println("result = " + result);

        //- float는 부호(1비트) + 지수(8비트) + 가수(23비트)로 구성됨(69P)
        //- int 값을 손실 없이 float 타입의 값으로 변환할 수 있으려면 가수 23비트로 표현 가능한 값이어야 함(2^23 - 1 = 8388607)
        //- 123456780은 23비트로 표현할 수 없기 때문에 근사치로 변환됨  -> 정밀도 손실
        //- 그러므로 모든 int 값을 실수 타입으로 안전하게 변환시키는 double 타입을 사용해야 함
        //- double은 부호(1비트) + 지수(11비트) + 가수(52비트)로 구성됨

        int num4 = 123456780;
        int num5 = 123456780;

        double num6 = num5;
        num5 = (int) num6;

        int result2 = num4 - num5;
        System.out.println("result2 = " + result2);

        System.out.println("\n-----------------------------------------------\n");


        //3. 연산식에서의 자동 타입 변환
        //- 연산을 할 때에는 서로 다른 타입의 피연산자가 있을 경우 두 피연산자 중 크기가 큰 타입으로 자동 변환됨
        //- 자바는 정수 연산일 경우 int 타입을 기본으로 함
        //      -> 피연산자를 4byte 단위로 저장하기 때문

        byte byteValue2 = 10;
        byte byteValue3 = 20;
        //byte byteValue4 = byteValue2 + byteValue3;    //컴파일 에러
        int intValue2 = byteValue2 + byteValue3;
        System.out.println("intValue2 = " + intValue2);

        //- char 타입의 연산 결과는 int 타입으로 산출되므로 int 타입 변수에 결과를 저장해야 함
        //- 연산의 결과를 다시 문자로 출력 또는 저장하기 위해서는 int 값을 char 타입으로 강제 변환해야 함

        char charValue2 = 'A';
        char charValue3 = 1;
        //char charValue4 = charValue2 + charValue3;    //컴파일 에러
        int intValue3 = charValue2 + charValue3;
        System.out.println("유니코드 = " + intValue3);
        System.out.println("출력문자 = " + (char)intValue3);

        //- 정수 간의 나눗셈은 소수 부분이 버려짐

        int intValue4 = 10;
        int intValue5 = intValue4 / 4;
        System.out.println("intValue5 = " + intValue5);

        double doubleValue2 = intValue4 / 4;
        System.out.println("doubleValue2 = " + doubleValue2);

        //- 정수와 실수가 연산하면 정수가 실수로 자동 타입 변환되어 결과값도 실수 타입이 됨
        //- 자바에서는 실수 리터럴은 기본적으로 double로 간주

        //int intValue6 = intValue4 / 4.0;    //컴파일 에러
        double doubleValue3 = intValue4 / 4.0;
        System.out.println("doubleValue3 = " + doubleValue3);
    }
}
