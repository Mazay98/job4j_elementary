package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound_3_Then_0_1_4() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4};
        assertThat(rst, is(expect));
    }

    @Test
    public void WhenBound_5_Then_0_1_4_9_16(){
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] except = new int[]{0,1,4,9,16};
        assertThat(rst, is(except));
    }
}