package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AlgoArrayTest {

    @Test
    public void sortArray10(){
        int[] in = new int[]{-3,2,4,1,7,0,-1,8,9,2};
        int[] out = new int[]{-3,-1,0,1,2,2,4,7,8,9};
        assertThat(AlgoArray.sort(in), is(out));
    }
}