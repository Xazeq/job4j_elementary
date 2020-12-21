package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom20To30Then150() {
        int rsl = Counter.sumByEven(20, 30);
        int expected = 150;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom101To109Then420() {
        int rsl = Counter.sumByEven(101, 109);
        int expected = 420;
        assertThat(rsl, is(expected));
    }
}