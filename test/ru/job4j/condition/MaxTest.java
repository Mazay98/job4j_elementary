package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int res = Max.max(1, 2);
        assertThat(res, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int res = Max.max(2, 1);
        assertThat(res, is(2));
    }

    @Test
    public void whenMax2To2ThenOther() {
        int res = Max.max(2, 2);
        assertThat(res, is(2));
    }

    @Test
    public void whenMax3() {
        int res = Max.max(2, 2,3);
        assertThat(res, is(3));
    }

    @Test
    public void whenMax4() {
        int res = Max.max(4, 2, 5,1);
        assertThat(res, is(5));
    }
}