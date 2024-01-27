package com.practice.operator;

public class Operator4 {
    public static void main(String[] args) {
        //1. 삼항 연산자
        //- 세 개의 피연산자를 필요로 하는 연산자를 말함
        //- 조건식 ? (값 또는 연산식) : (값 또는 연산식)
        //- 조건식을 연산하여 true가 나오면 전자, false가 나오면 후자를 결과로 가짐
        //- if문으로 대신할 수 있지만 한 줄에 간단하게 삽입해서 사용할 경우에는 삼항 연산자를 사용하는 것이 효율적

        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        //(false) ? true일 떄 해당 : false일 때 해당
        //(score > 80) ? 'B' : 'C' -> (true) ? -> 'B'
        //(false) ? 'A' : 'B'       -> grade는?? 'B'
        System.out.println("grade = " + grade);





    }
}
