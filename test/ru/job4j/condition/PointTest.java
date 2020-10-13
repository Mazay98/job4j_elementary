package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(2, out, 0.01);
    }

    @Test
    public void when010to15020then150() {
        double out = Point.distance(0, 10, 150, 20);
        Assert.assertEquals(150.33, out, 0.01);
    }

    @Test
    public void when1010to30020then290() {
        double out = Point.distance(10, 10, 300, 20);
        Assert.assertEquals(290.17, out, 0.01);
    }

    @Test
    public void when6200to125200then533() {
        double out = Point.distance(620, 0, 125, 200);
        Assert.assertEquals(533.87, out, 0.01);
    }
}