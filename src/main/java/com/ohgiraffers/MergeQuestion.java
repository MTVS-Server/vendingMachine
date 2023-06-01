package com.ohgiraffers;

import java.util.ArrayList;
import java.util.List;

public class MergeQuestion {
    private FTQuestion FTq;
    private IEQuestion IEq;
    private NSQuestion NSq;
    private PJQuestion PJq;
    private List<Question> questionList;

    public void setUp() {
        this.questionList = new ArrayList<Question>();
        this.FTq = new FTQuestion();
        questionList.add(this.FTq);
        this.IEq = new IEQuestion();
        questionList.add(this.IEq);
    }

    public void run() {
        this.setUp();
        String userMBTI = "";
        int[] answerList = { 2,1 };
        for (Question question : this.questionList) {
            int answer = answerList[questionList.indexOf(question)];
            String FT = question.question(answer);
            userMBTI = userMBTI.concat(FT);
        }
        System.out.println(userMBTI);
    }
}