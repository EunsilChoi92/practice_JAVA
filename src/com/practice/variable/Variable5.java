package com.practice.variable;

public class Variable5 {
    public static void main(String[] args) {
        //1. float 타입과 double 타입
        //- 4byte, 8byte
        //- 메모리 사용 크기는 각각 int와 long의 크기와 같지만 더 큰 범위의 값을 저장할 수 있음
        //- float보다 double이 더 정밀한 값을 저장함
        //- 자바는 실수 리터럴의 기본 타입을 double로 간주함

        //실수값 저장
        double var1 = 3.14;
        //float var2 = 3.14;    //컴파일 에러
        float var3 = 3.14F;

        //정밀도 테스트
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789f;

        System.out.println("var1 = " + var1);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);

        //e 사용하기
        int var6 =  3000000;
        double var7 = 3e6;
        float var8 = 3e6F;
        double var9 = 2e-3;

        System.out.println("var6 = " + var6);
        System.out.println("var7 = " + var7);
        System.out.println("var8 = " + var8);
        System.out.println("var9 = " + var9);

        System.out.println("\n-----------------------------------------------\n");


        //2. boolean 타입
        //- 1byte
        //- true와 false만 저장
        //- 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는 데 주로 이용됨

        boolean stop = true;
        if(stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        boolean result1 = 1 == 1;
        boolean result2 = 1 == 2;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
