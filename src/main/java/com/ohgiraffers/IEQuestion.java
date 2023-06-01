package com.ohgiraffers;

public class IEQuestion {
    public void judgeIE() {
        while (true) {
            System.out.println("당신은 사람 많은 곳을 좋아합니까?");
            System.out.println("1. 네 \n2. 아니오");
            String result = giveQuestions();
            if (result.equals("E") || result.equals("I")) {
                System.out.println(result);
                break;
            }
        }
    }

    public String giveQuestions() {
        // 여기에 입력 문법 추가 가능
        return returnString(1); // 일단 '네'로 대답
    }

    public String checkNumbers(int num) {

        if (num == 1) {
            return "E";
        }
        if (num == 2) {
            return "I";
        }
        throw new IllegalArgumentException("그 외 숫자를 입력하였습니다.");

    }

    public String returnString(int num) {
        try {
            checkNumbers(num);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return checkNumbers(num);
    }
}
