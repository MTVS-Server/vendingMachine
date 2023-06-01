package com.ohgiraffers;

import java.util.Scanner;

public class NSQuestion {
    public String question(int num){

        System.out.println("당신의 mbti 중 \"정보수집\"을(를) 검사해보겠습니다.");
        System.out.println("===============================");
        System.out.println("1. 백설공주");
        System.out.println("2. 맛있다");

        if (num == 1) {
            return "N";
        } else if(num ==2){
            return "S";
        }
        else {
            throw new IllegalArgumentException("그 외 숫자를 입력하였습니다.");
        }
    }
}
