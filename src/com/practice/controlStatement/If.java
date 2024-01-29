package com.practice.controlStatement;

public class If {
    public static void main(String[] args) {
        //1. 제어문
        //- 조건문과 반복문이 있음
        //- 조건문: if문(중요), switch문
        //- 반복문: for문(중요), while문, do-while문

        //2. if문
        //- if(조건식) {
        //      실행문1;   int value = 1;
        //      실행문2;   int value1 = 2; ...
        //      ...
        //  }
        //- 실행문이 하나일 경우에는 if문을 단 한 줄로 표현할 수 있음
        //      -> if(조건식) 실행문1;
        //      -> if(조건식) 실행문1; 실행문2; 이렇게 사용하면 if(조건식){ 실행문1;} 실행문2;과 같음

        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if(score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");


        //3. if-else문
        //- if문의 조건식이 true이면 if문의 블록이 실행되고, 조건식이 false이면 else 블록이 실행됨
        //if(조건식) {
        //   실행문1; ...
        // } else {
        //   실행문2; ...
        // }

        int score1 = 85;

        if(score1 >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }

        //번외)
        //- ||을 뒤집으면 &&
        //!(score1 > 90 || score1 == 90)
        //-> score1 <= 90 && score1 != 90
        
        
        //4. else if문
        //- 조건이 여러 개인 if문을 작성할 때에는 else if를 사용
        //- else if문은 개수 제한이 없음
        //- 여러 개의 조건식 중 true가 되는 블록만 실행하고 전체 if문을 벗어나게 됨
        //- else if 블록의 마지막에는 else 블록을 추가할 수 있는데, 모든 조건식이 false일 경우 else 블록을 실행

        int score2 = 75;

        if(score2 >= 90) {
            System.out.println("점수가 100 - 90입니다.");
            System.out.println("등급은 A입니다.");
        } else if(score2 >= 80) {
            System.out.println("점수가 80 - 89입니다.");
            System.out.println("등급은 B입니다.");
        } else if(score2 >= 70) {
            System.out.println("점수가 70 - 79입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 70미만입니다.");
            System.out.println("등급은 D입니다.");
        }

        //score2 = 75;
        if(score2 >= 60) {
            System.out.println("1번");
        } else if(score2 >= 70) {
            System.out.println("2번");
        } else {
            System.out.println("3번");
        }
        
        //- 조건문을 사용할 때에는 if는 무조건 있어야 하고 else if, else는 생략 가능
        






    }
}
