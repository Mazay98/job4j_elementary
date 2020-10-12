package ru.job4j.calculate;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then40() {
        int rsl = X2.calc(10, 0, 0, 2);
        Assert.assertEquals(40, rsl);
    }

    @Test
    public void whenA1B1C1X1Then() {
        int rsl = X2.calc(1, 1, 1, 1);
        Assert.assertEquals(3, rsl);
    }

    @Test
    public void whenA0B1C1X1Then() {
        int rsl = X2.calc(0, 1, 1, 1);
        Assert.assertEquals(2, rsl);
    }

    @Test
    public void whenA1B1C0X1Then() {
        int rsl = X2.calc(1, 1, 0, 1);
        Assert.assertEquals(2, rsl);
    }

    @Test
    public void whenA1B1C1X0Then() {
        int rsl = X2.calc(1, 1, 1, 0);
        Assert.assertEquals(1, rsl);
    }
}