package ru.job4j.sort;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {

    @Test
    public void whenEquals() {
        int[] expect = {};
        int[] rsl = Machine.change(100, 100);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50By35() {
        int[] expect = {10, 5};
        int[] rsl = Machine.change(50, 35);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when100By35() {
        int[] expect = {10, 10, 10, 10, 10, 10, 5};
        int[] rsl = Machine.change(100, 35);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50By39() {
        int[] expect = {10, 1};
        int[] rsl = Machine.change(50, 39);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50By38() {
        int[] expect = {10, 2};
        int[] rsl = Machine.change(50, 38);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50By37() {
        int[] expect = {10, 2, 1};
        int[] rsl = Machine.change(50, 37);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50By32() {
        int[] expect = {10, 5, 2, 1};
        int[] rsl = Machine.change(50, 32);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50By31() {
        int[] expect = {10, 5, 2, 2};
        int[] rsl = Machine.change(50, 31);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when50By30() {
        int[] expect = {10, 10};
        int[] rsl = Machine.change(50, 30);
        assertThat(rsl, is(expect));
    }
}