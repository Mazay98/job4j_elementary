package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        assertThat(rsl, is(30));
    }

    @Test
    public void whenSumEvenNumbersFrom1To30Then() {
        int rsl = Counter.sumByEven(1, 30);
        assertThat(rsl, is(240));
    }
}