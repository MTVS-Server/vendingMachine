package com.ohgiraffers;

public class FTQuestion {

    public String question(int num){
        if (num == 1) {
            return "F";
        } else if(num ==2){
            return "T";
        }
        else {
            throw new IllegalArgumentException("그 외 숫자를 입력하였습니다.");
        }
    }
}
