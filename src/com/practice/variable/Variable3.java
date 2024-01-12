package com.practice.variable;

public class Variable3 {
    public static void main(String[] args) {
        //1. 변수의 사용범위
        //- 변수는 중괄호 {} 블록 내에서 선언되고 사용됨


        //2. 로컬 변수(local variable)
        //- 메소드 블록 내에서 선언된 변수
        //- 메소드 실행이 끝나면 메모리에서 자동으로 없어짐
        int value = 10;         //변수 선언 및 초기값 저장
        int sum = value + 20;   //변수 선언 및 초기값 저장
        System.out.println(sum);

        //- if, for, while 등의 제어문 블록에서 선언된 변수는 해당 제어문 블록 내에서만 사용 가능
        int var1;
        if(true) {
            int var2;   //if 블록에서 선언
            //var1과 var2 사용 가능
        }

        for(int i=0; i<3; i++) {
            int var3;   //for 블록에서 선언
            //var 1과 var 3 사용 가능
            //var2는 사용 못함
        }

        //var1 사용 가능
        //var2와 var3는 사용 못함

        int v1 = 15;
        if(v1 > 10) {
            int v2 = v1 - 10;
        }
        //int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생생
    }
}
