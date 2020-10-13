package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square() {
        double out = SqArea.square(6, 2);
        Assert.assertEquals(2, out, 0.01);
    }
}