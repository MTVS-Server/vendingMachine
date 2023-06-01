package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MBTITest {

    private FTQuestion FTq;
    private IEQuestion IEq;
    private NSQuestion NSq;
    private PJQuestion PJq;

    @BeforeEach
    public void setUp() {
        this.FTq = new FTQuestion();
        this.IEq = new IEQuestion();
        this.NSq = new NSQuestion();
        this.PJq = new PJQuestion();
    }

    @DisplayName("MBTI 테스트")
    @Test
    public void testFT() {
        //given
        int answer1 = 1;
        String result1 = this.FTq.question(answer1);

        int answer2 = 2;
        String result2 = this.FTq.question(answer2);
        //when
        Assertions.assertEquals("F", result1);
        Assertions.assertEquals("T", result2);
    }

    @DisplayName("그외 번호를 입력하면 IllegalArgumentException가 발생하는지 체크")
    @Test
    public void testInputArgument() {
        //given
        int answer = 3;
        //when
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> this.FTq.question(answer));
    }
}