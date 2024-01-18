package com.practice.variable;

public class Variable7 {
    public static void main(String[] args) {
        //확인문제

        //1. 변수는 하나의 값만 저장할 수있다?

        //2. 변수는 선언 시에 사용한 타입의 값만 저장할 수 있다?

        //3. 변수는 변수가 선언된 중괄호 안에서만 사용 가능하다?

        //4. 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다?

        //5. 1byte, 2bye, 4byte, 8byte의 용량을 가지는 기본 타입은?

        //6. 다음 중 에러가 발생하는 경우는?
        byte byteValue = 10;
        char charValue = 'A';
        //① int intValue = byteValue;
        //② int intValue = charValue;
        //③ short shortValue = charValue;
        //④ double doubleValue = byteValue;

        //7. 다음 중 에러가 발생하는 경우는?
        int intValue = 10;
        char charValue2 = 'A';
        double doubleValue = 5.7;
        String strValue = "A";
        //① double var = (double) intValue;
        //② byte var = (byte) intValue;
        //③ int var = (int) doubleValue;
        //④ char var = (char) strValue;

        //8. 다음 중 에러가 발생하는 경우는?
        byte byteValue2 = 10;
        float floatValue = 2.5F;
        double doubleValue2 = 2.5;
        //① byte result1 = byteValue2 + byteValue2;
        //② int result2 = 5 + byteValue2;
        //③ float result3 = 5 + floatValue;
        //④ double result4 = 5 + doubleValue2;



    }
}
