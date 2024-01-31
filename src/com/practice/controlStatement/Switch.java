package com.practice.controlStatement;

public class Switch {
    public static void main(String[] args) {
        //1. switch문
        //- if문과 마찬가지로 조건 제어문
        //- if문처럼 조건식이 true일 경우에 블록 내부의 실행문을 실행하는 것이 아니라, 변수가 어떤 값을 갖느냐에 따라 실행문이 선택됨
        //- if문의 조건식의 결과가 true, false 두 가지 밖에 없기 때문에 경우의 수가 많아질수록 else if를 복합적으로 추가해야 하므로 코드가 복잡해짐
        //- switch문은 변수의 값에 따라 실행문이 결정되기 때문에 같은 기능의 if문보다 코드가 간결함

        int num = (int) (Math.random() * 6) + 1;    //주사위 번호(1-6) 랜덤으로 하나 뽑기
                                                    //(0 <= num < 1) * 6
                                                    //(0 <= num < 6) + 1
                                                    //(1 <= num < 7)
        System.out.println("주사위 수: " + num);

        switch(num) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:    //else(1~5 중 아무것도 아닌 경우)
                System.out.println("6번이 나왔습니다.");
                break;
        }

        System.out.println("\n-----------------------------------------------\n");

        //- case 끝에 break가 없으면 switch문을 빠져나가지 못해 다음 case가 연달아 실행됨

        int time = (int) (Math.random() * 4) + 8;   //8-11 사이의 정수 뽑기
        System.out.println("[현재시간: " + time + "시]");

        switch(time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:    //else(11)
                System.out.println("외근을 나갑니다.");
        }

        System.out.println("\n-----------------------------------------------\n");

        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }

        System.out.println("\n-----------------------------------------------\n");

        //- 자바6까지는 switch문의 괄호에는 정수 타입(byte, char, short, int, long) 변수나 정수값을 산출하는 연산식만 올 수 있었음
        //- 자바7부터는 String 타입의 변수도 올 수 있음

        String position = "과장";

        switch (position) {
            case "부장":
                System.out.println("700만원");
                break;
            case "과장":
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
        }

        if(position.equals("부장")) {
            System.out.println("700만원");
        } else if(position.equals("과장")) {
            System.out.println("500만원");
        } else {
            System.out.println("300만원");
        }





    }
}
