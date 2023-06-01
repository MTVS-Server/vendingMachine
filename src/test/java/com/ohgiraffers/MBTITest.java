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
        int answer1 = 2;
        String result1 = this.FTq.question(answer1);
        String resultN=this.NSq.question(answer1);

        int answer2 = 2;
        String result2 = this.FTq.question(answer2);
        String resultF=this.NSq.question(answer2);

        //when
        Assertions.assertEquals("F", result1);
        Assertions.assertEquals("T", result2);
        Assertions.assertEquals("N", resultN);
        Assertions.assertEquals("S", resultF);
    }

    @DisplayName("그외 번호를 입력하면 IllegalArgumentException가 발생하는지 체크")
    @Test
    public void testInputArgument() {
        //given
        int answer = 3;
        //when
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> this.FTq.question(answer));
    }

    @DisplayName("I/E 테스트")
    @Test
    public void testJudgeIE() {
        int answer1 = 1;
        int answer2 = 2;

        Assertions.assertEquals("E", this.IEq.checkNumbers(answer1));
        Assertions.assertEquals("I", this.IEq.checkNumbers(answer2));
    }

    @DisplayName("그 외 번호를 입력하면 IllegalArgumentException가 발생하는지 체크")
    @Test
    public void testInputException() {
        int answer = 3;

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> this.IEq.checkNumbers(answer)
        );
    }

    @DisplayName("MBTI P/J 테스트")
    @Test
    public void testPJ() {
        // given
        int answer1 = 1;
        int answer2 = 2;

        // when
        String result1 = this.PJq.question(answer1);
        String result2 = this.PJq.question(answer2);

        // then
        Assertions.assertEquals("P", result1);
        Assertions.assertEquals("J", result2);
    }

    @DisplayName("선택지 외 번호 입력 시 확인")
    @Test
    public void setPJInputArgument() {
        // given
        int answer = 0;

        // when & then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> this.PJq.question(answer)
        );
    }
}
