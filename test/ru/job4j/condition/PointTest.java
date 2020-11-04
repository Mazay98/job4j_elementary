package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(2, out, 0.01);
    }

    @Test
    public void when010to15020then150() {
        Point a = new Point(0, 10);
        Point b = new Point(150, 20);
        double out = a.distance(b);
        Assert.assertEquals(150.33, out, 0.01);
    }

    @Test
    public void when1010to30020then290() {
        Point a = new Point(10, 10);
        Point b = new Point(300, 20);
        double out = a.distance(b);
        Assert.assertEquals(290.17, out, 0.01);
    }

    @Test
    public void when6200to125200then533() {
        Point a = new Point(620, 0);
        Point b = new Point(125, 200);
        double out = a.distance(b);
        Assert.assertEquals(533.87, out, 0.01);
    }
}