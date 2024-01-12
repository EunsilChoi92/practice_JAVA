package com.practice.variable;

public class Variable4 {
    public static void main(String[] args) {
        //1. 데이터 타입
        //- 모든 변수에넌 type이 있으며, 타입에 따라 저장할 수 있는 값의 종류와 범위가 달라짐
        //- 변수를 선언할 때 주어진 타입은 변수를 사용하는 도중에 변경할 수 없음


        //2. 기본 타입
        //- 정수, 실수, 문자, 논리 리터럴을 직접 저장하는 타입
        //- 정수타입: byte, char, short, int, long
        //- 실수타입: float, double
        //- 논리타입: boolean


        //3. bit
        //- 0과 1을 저장하는 최소 기억 단위
        //- 8개의 비트를 묶어서 바이트라고 함
        //- 기본 타입은 정해진 메모리 사용 크기만큼 값을 저장함
        //- 표현할 수 있는 값의 범위를 초과해서 저장할 경우 컴파일 에러 발생


        //4. byte 타입
        //- 1byte
        //- 색상 정보 및 파일 또는 이미지 등의 이진(바이너리) 데이터를 처리할 때 주로 사용됨
        //- 정수 타입 중에서 가장 작은 범위의 수를 저장함

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128;  //컴파일 에러

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        //- 실행 중에 저장할 수 있는 값의 범위를 초과하면 최솟값부터 다시 반복 저장됨
        //- -128부터 시작해서 127을 넘으면 다시 128부터 시작함

        byte var6 = 125;
        int var7 = 125;

        for(int i=0; i<5; i++) {
            var6++;
            var7++;
            System.out.println("var6: " + var6 + "\t" + "var7: " + var7);
        }

        System.out.println("\n-----------------------------------------------\n");


        //5. char 타입
        //- 2byte
        //- character의 줄임말
        //- 단 하나의 문자만 저장
        //- 자바는 모든 문자를 유니코드로 처리함
        //- 유니코드: 세계 각국의 문자들을 코드값으로 매핑한 국제 표준 규약
        //- 유니코드는 하나의 문자에 대해 하나의 코드값을 부여
        //- 유니코드는 음수가 없으므로 char 타입 변수에는 음수를 저장할 수 없음
        //- 작은 따옴표(')를 사용해 문자를 저장하거나 유니코드 정수값을 저장

        char c1 = 'A';          //문자를 직접 저장
        char c2 = 65;           //10진수로 저장
        char c3 = '\u0041';     //16진수로 저장

        char c4 = '가';         //문자를 직접 저장
        char c5 = 44032;        //10진수로 저장
        char c6 = '\uac00';     //16진수로 저장

        int unicCode = c1;      //유니코드 얻기

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);
        System.out.println("c6: " + c6);
        System.out.println("uniCode: " + unicCode);

        //- 문자열을 저장하고 싶다면 String을 사용
        //- String은 클래스 타입

        //char c7 = '홍길동';  //에러
        String str = "홍길동";
        System.out.println("str = " + str);

        System.out.println("\n-----------------------------------------------\n");


        //6. short 타입
        //- 2byte
        //- 2byte로 표현되는 정수값 저장 가능
        //- C언어와의 호환을 위해 사용되며 비교적 자바에서는 잘 사용하지 않음


        //7. int 타입
        //- 4byte
        //- 자바에서 정수 연산을 하기 위한 기본 타입
        //- 일반적으로 정수를 저장할 때는 int 타입을 사용
        //- 정수값을 직접 코드에서 입력할 rud우 8진수, 10진수, 16진수로 표현할 수 있음
        //- 변수에 어떤 진수로 입력을 하더라도 동일한 값이 2진수로 변환되어 저장됨

        int intVar1 = 10;   //10진수로 저장
        int intVar2 = 012;  //8진수로 저장
        int intVar3 = 0xA;  //16진수로 저장

        System.out.println("intVar1 = " + intVar1);
        System.out.println("intVar2 = " + intVar2);
        System.out.println("intVar3 = " + intVar3);

        System.out.println("\n-----------------------------------------------\n");

        //8. long 타입
        //- 8byte
        //- 수치가 큰 데이터를 다루는 프로그램에서는 long 타입이 필수적으로 사용됨
        //- long 타입의 변수를 초기화할 때 int 값을 초과할 경우 정수값 뒤에 소문자 l이나 대문자 L을 붙임

        long longVar1 = 10;
        long longVar2 = 20L;
        //long longVar3 = 100000000000; //컴파일 에러
        long longVar4 = 100000000000l;

        System.out.println("longVar1 = " + longVar1);
        System.out.println("longVar2 = " + longVar2);
        System.out.println("longVar4 = " + longVar4);
    }
}
