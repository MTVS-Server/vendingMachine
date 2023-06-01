package com.ohgiraffers;

public class IEQuestion extends Question{
    public String question(int num) {
        if (num == 1) {
            return "I";
        } else if(num ==2){
            return "E";
        }
        else {
            throw new IllegalArgumentException("그 외 숫자를 입력하였습니다.");
        }
    }
}
