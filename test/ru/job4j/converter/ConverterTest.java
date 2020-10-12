package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert15000RblThen214Euros() {
        int out = Converter.rubleToCourse(15000, 70);
        Assert.assertEquals(214, out);
    }

    @Test
    public void whenConvert15000RblThen500Dollars() {
        int out = Converter.rubleToCourse(15000, 30);
        Assert.assertEquals(500, out);
    }
}