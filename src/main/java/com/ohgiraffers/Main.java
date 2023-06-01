package com.ohgiraffers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IEQuestion IE = new IEQuestion();
        NSQuestion NS = new NSQuestion();
        FTQuestion FT = new FTQuestion();
        PJQuestion PJ = new PJQuestion();

        int answerIE = 1;
        int answerNS = 2;
        int answerFT = 1;
        int answerPJ = 2;

        IE.judgeIE();
        String resultNS = NS.question(answerNS);
        String resultFT = FT.question(answerFT);
        String resultPJ = PJ.question(answerPJ);


        String MBTI = "I" + resultNS + resultFT + resultPJ;

        System.out.println(MBTI);
    }




}
