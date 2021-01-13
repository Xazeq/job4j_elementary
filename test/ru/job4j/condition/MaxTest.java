package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To3Then4() {
        int result = Max.max(4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To7To9Then9() {
        int result = Max.max(5, 7, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax4To4To4Then4() {
        int result = Max.max(4, 4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax8To5To3Then8() {
        int result = Max.max(8, 5, 3);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax11To519To15Then19() {
        int result = Max.max(11, 19, 15);
        assertThat(result, is(19));
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax9To7To5To3Then9() {
        int result = Max.max(3, 5, 7, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax10To19To13To18Then19() {
        int result = Max.max(10, 19, 13, 18);
        assertThat(result, is(19));
    }

    @Test
    public void whenMax10To13To19To18Then19() {
        int result = Max.max(10, 13, 19, 18);
        assertThat(result, is(19));
    }

    @Test
    public void whenMax7To7To7To7Then7() {
        int result = Max.max(7, 7, 7, 7);
        assertThat(result, is(7));
    }
}