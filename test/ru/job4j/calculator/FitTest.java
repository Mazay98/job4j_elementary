package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        double out = Fit.manWeight((short) 180);
        Assert.assertEquals(92, out, 0.01);
    }

    @Test
    public void whenWoman180Then80() {
        double out = Fit.womanWeight((short) 180);
        Assert.assertEquals(80.5, out, 0.01);
    }
}