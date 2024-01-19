package com.practice.operator;

public class Operator3 {
    public static void main(String[] args) {
        //1. 이항 연산자
        //- 피연산자가 두 개인 연산자를 말함


        //2. 산술 연산자
        //- 일반적인 사칙연산에 사용되는 +, -, *, /, %
        //- boolean 타입을 제외한 모든 기본 타입에 사용할 수 있음
        //- 연산할 때의 기본 타입은 int, int 보다 더 큰 타입이 있는 경우에는 그 타입으로 자동변환됨

        int v1 = 5;
        int v2 = 2;
        int result1 = v1 + v2;
        System.out.println("result1 = " + result1);

        int result2 = v1 - v2;
        System.out.println("result2 = " + result2);

        int result3 = v1 * v2;
        System.out.println("result3 = " + result3);

        int result4 = v1 / v2;
        System.out.println("result4 = " + result4);

        int result5 = v1 % v2;
        System.out.println("result5 = " + result5);

        double result6 = v1 / v2;
        System.out.println("result6 = " + result6);

        double result7 = (double) (v1 / v2);
        System.out.println("result7 = " + result7);

        double result8 = (double) v1 / v2;  //핵심은!! 둘 중에 하나는 더블 타입이 되어야지만
        //나머지 하나가 더블 타입으로 자동변환되어서
        //실수와 실수의 연산이 가능하다.
        System.out.println("result8 = " + result8);

        System.out.println("\n-----------------------------------------------\n");





    }
}
