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


        //3. 문자열 연결 연산자
        //- 문자열 연결 연산자인 +는 문자열을 서로 결합하는 연산자
        //- + 연산자는 산술 연산자, 부호 연산자인 동시에 문자열 연결 연산자이기도 함
        //- 피연산자 중 한 쪽이 문자열이면 + 연산자는 문자열 연결 연산자로 사용되어 다른 피연산자를 문자열로 변환하고 서로 결합함
        //- 문자열과 숫자가 혼합된 + 연산식은 왼쪽에서부터 오른쪽으로 연산이 진행됨

        String str1 = "JDK" + 6.0;  //str1 == JDK6.0
        String str2 = str1 + " 특징"; //str2 == JDK6.0 특징
        System.out.println("str2 = " + str2);   //str2 = JDK6.0 특징

        String str3 = "JDK" + 3 + 3.0;  //JDK3 -> "JDK3" + 3.0 -> "JDK3" + "3.0" -> JDK33.0
        String str4 = 3 + 3.0 + "JDK";  //6.0 -> 6.0 + "JDK" -> "6.0" + "JDK" -> 6.0JDK
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

        System.out.println("\n-----------------------------------------------\n");


        //4. 비교 연산자
        //- 대소 또는 동등을 비교해서 boolean 타입인 true/false를 산출함
        //- 대소 연산자는 boolean 타입을 제외한 기본 타입에 사용 가능    //true > false ?    -> boolean 안됨
        //- 동등 연산자는 모든 타입에 사용 가능    // == -> true == false ? -> boolean도 됨
        //- 비교 연산자는 흐름 제어문인 조건문(if), 반복문(for, while)에서 주로 이용됨
        //- 동등 비교: ==, !=
        //- 크기 비교: > , >=, <, <=
        //- 피연산자가 char 타입이면 유니코드 값으로 비교 연산을 수행함 //'A' > 'B' -> false(B의 유니코드값이 더 커서)

        int num1 = 10;
        int num2 = 10;
        boolean result11 = (num1 == num2);  //true
        boolean result12 = (num1 != num2);  //false
        boolean result13 = (num1 <= num2);  //true

        System.out.println("result11 = " + result11);
        System.out.println("result12 = " + result12);
        System.out.println("result13 = " + result13);

        char char1 = 'A';
        char char2 = 'B';
        boolean result14 = (char1 < char2);
        System.out.println("result14 = " + result14);

        System.out.println("\n-----------------------------------------------\n");

        //- 비교 연산자에서도 연산을 수행하기 전에 타입 변환을 통해 피연산자의 타입을 일치시킴
        //- 'A' == 65는 'A'가 int 타입으로 변환되어 65가 된 다음 65 == 65로 비교함
        //- 3 == 3.0에서 3은 int 타입으고 3.0 double 타입이므로 int 타입인 3을 보다 큰 타입은 double 타입으로 변환한 다음 3.0 == 3.0으로 비교함
        //- 0.1 == 0.1f는 좌측 0.1이 double로 변환되어 true가 되어야 하지만 false가 산출됨
        //  -> 이진 포맷의 가수를 사용하는 모든 부동소수점 타입은 0.1을 정확히 표현할 수가 없어서 0.1의 근사값으로 표현됨
        //  -> 해결책은 모두 float 타입으로 강제 변환하거나 정수로 변환해서 비교함

        int num3 = 1;
        double num4 = 1.0;
        System.out.println("num3 == num4: " + (num3 == num4));  //num3 == num4: true

        double num5 = 0.1;
        float num6 = 0.1f;
        System.out.println("num5 == num6: " + (num5 == num6));  //num5 == num6: false
        System.out.println("(float)num5 == num6: " + ((float)num5 == num6));    //(float)num5 == num6: true
        System.out.println("((int)(num5*10) == (int)(num6*10)): " + ((int)(num5*10) == (int)(num6*10)));//((int)(num5*10) == (int)(num6*10)): true

        System.out.println("\n-----------------------------------------------\n");

        //- String 타입의 문자열을 비교할 때에는 대소 연산자를 사용할 수 없고, 동등 비교 연산자는 사용할 수 있으나 용도가 다름
        //- String 타입의 문자열을 비교할 경우에는 equals() 메소드를 사용

        String str6 = "홍길동";
        boolean result15 = "홍길동".equals(str6);
        System.out.println("result15 = " + result15);   //result15 = true

        System.out.println("\n-----------------------------------------------\n");


        //5. 논리 연산자
        //- 논리곱(&, &&: and), 논리합(|, ||: or), 배타적 논리합(^), 논리 부정(!)
        //- 논리 연산자의 피연산자는 boolean 타입만 사용 가능
        //- &&는 앞의 피연산자가 false라면 뒤의 피연산자를 평가하지 않고 바로 false라는 산출 결과를 냄
        //- &는 두 피연산자를 모두 평가해 산출 결과를 냄
        //- &보다 &&가 효율적
        //- and는 둘 다 참일 경우에만 true, or는 둘 중 하나만 참이라도 true

        int charCode = 'A'; //65

        if((charCode >= 65) & (charCode <= 90)) {   //(true) & (true)   -> true -> if(true)
            System.out.println("대문자이군요.");
        }

        if((charCode >= 97) && (charCode <= 122)) { //(false) && (true) -> false -> if(false)
            System.out.println("소문자이군요.");
        }

        if(!(charCode < 48) && !(charCode > 57)) {  //!(false) -> (true) && (false) -> if(false)
            System.out.println("0에서 9 사이의 숫자이군요.");
        }

        int value = 6;

        if((value % 2 == 0) | (value % 3 == 0)) {   //if(true | true)
            System.out.println("2 또는 3의 배수이군요.");
        }

        if((value % 2 == 0) || (value % 3 == 0)) {   //if(true || true)
            System.out.println("2 또는 3의 배수이군요.");
        }

        System.out.println("\n-----------------------------------------------\n");


        //6. 대입 연산자
        //- 오른쪽 피연산자의 값을 좌측 피연산자인 변수에 저장함
        //- 단순 대입 연산자: 변수 = 피연산자
        //- 복합 대입 연산자: +=, -=, *=, /=, %= ...
        //- 대입 연산자는 모든 연산자들 중에서 가장 낮은 연산 순위를 가지고 있기 때문에 제일 마지막에 수행됨

        int result16 = 0;

        result16 += 10; //-> result16 = result16 + 10; -> result16: 10
        result16 += 32; //result16: 42
        result16 += 13; //result16: 55

        System.out.println("result16 = " + result16);

        //result16: 55
        result16 -= 5;
        System.out.println("result16 = " + result16);

        //result16: 50
        result16 *= 3;
        System.out.println("result16 = " + result16);

        result16 = 52;
        result16 /= 5;
        System.out.println("result16 = " + result16);

        result16 = 133;
        result16 %= 10;
        System.out.println("result16 = " + result16);

        int result17 = 147;
        int num7 = 5;
        result17 %= ++num7;
        //result17 = result17 % ++num7  -> 147 % 6  -> 24...3
        System.out.println("result17 = " + result17);   //result17 = 3






    }
}
