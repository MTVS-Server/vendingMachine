package com.ohgiraffers;

public class PJQuestion {
    public String question(int answer) {

        System.out.println("당신의 mbti 중 \"생활양식\"을(를) 검사해보겠습니다.");
        System.out.println("=============================");
        System.out.println("1. 즉흥적");
        System.out.println("2. 계획적");

        if (answer == 1) {
            System.out.println("당신의 mbti 중 \"생활양식\"은 \"P\"입니다.");
            return "P";
        } else if (answer == 2) {
            System.out.println("당신의 mbti 중 \"생활양식\"은 \"J\"입니다.");
            return "J";
        } else {
            throw new IllegalArgumentException("질문 선택지 외에 번호를 선택하셨습니다.");
        }

    }
}