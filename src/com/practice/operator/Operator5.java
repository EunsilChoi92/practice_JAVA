package com.practice.operator;

public class Operator5 {
    public static void main(String[] args) {
        //1. 다음 코드를 실행했을 때의 출력 결과는?
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("\n-----------------------------------------------\n");


        //2. 다음 코드를 실행했을 때의 출력 결과는?
        int score = 85;
        String result = !(score>90) ? "가" : "나";
        System.out.println("result = " + result);

        System.out.println("\n-----------------------------------------------\n");


        //3. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당 몇개를 가질 수 있고, 몇 개가 남는지 구하는 코드일 때
        //괄호 안에 들어갈 코드는?
        int pencils = 534;
        int students = 30;

        //학생 한 명이 가지는 연필 수
        //int pencilsPerStudent = (   1    )
        //System.out.println("pencilsPerStudent = " + pencilsPerStudent);

        //남은 연필 수
        //int pencisLeft  = (   2    )
        //System.out.println("pencisLeft = " + pencisLeft);

        System.out.println("\n-----------------------------------------------\n");


        //4. 십의 자리 이하를 버리는 다음 코드에서 변수 value의 값이 356이라면 300이 나올 수 있도록 괄호를 채우시오.
        //- 산술 연산자만 사용할 것
        int value = 356;
        //755 -> 700
        //834 -> 800
        //value에 어떤 숫자가 들어가든 무조건 그 숫자의 백 단위만 나오도록!
        //System.out.println("value = " + (   1    ));

        System.out.println("\n-----------------------------------------------\n");


        ///5. 다음 코드의 결과는?
        int x1 = 10;
        int y1 = 5;

        System.out.println((x1 > 7) && (y1 <= 5));
        System.out.println((x1 % 3 == 2) || (y1 % 2 != 1));







    }
}
