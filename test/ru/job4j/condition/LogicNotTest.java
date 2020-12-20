package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void when4ThenTrue() {
        boolean result = LogicNot.isEven(4);
        assertThat(result, is(true));
    }

    @Test
    public void when5ThenFalse() {
        boolean result = LogicNot.isEven(5);
        assertThat(result, is(false));
    }

    @Test
    public void when6ThenTrue() {
        boolean result = LogicNot.isPositive(6);
        assertThat(result, is(true));
    }

    @Test
    public void whenMinus6ThenFalse() {
        boolean result = LogicNot.isPositive(-6);
        assertThat(result, is(false));
    }

    @Test
    public void when7ThenTrue() {
        boolean result = LogicNot.notEven(7);
        assertThat(result, is(true));
    }

    @Test
    public void when8ThenFalse() {
        boolean result = LogicNot.notEven(8);
        assertThat(result, is(false));
    }

    @Test
    public void whenMinus8ThenTrue() {
        boolean result = LogicNot.notPositive(-8);
        assertThat(result, is(true));
    }

    @Test
    public void when1ThenFalse() {
        boolean result = LogicNot.notPositive(1);
        assertThat(result, is(false));
    }

    @Test
    public void when9ThenTrue() {
        boolean result = LogicNot.notEvenAndPositive(9);
        assertThat(result, is(true));
    }

    @Test
    public void when10ThenFalse() {
        boolean result = LogicNot.notEvenAndPositive(10);
        assertThat(result, is(false));
    }

    @Test
    public void whenMinus9ThenFalse() {
        boolean result = LogicNot.notEvenAndPositive(-9);
        assertThat(result, is(false));
    }

    @Test
    public void whenMinus12ThenTrue() {
        boolean result = LogicNot.evenOrNotPositive(-12);
        assertThat(result, is(true));
    }

    @Test
    public void whenMinus11ThenTrue() {
        boolean result = LogicNot.evenOrNotPositive(-11);
        assertThat(result, is(true));
    }

    @Test
    public void when12ThenTrue() {
        boolean result = LogicNot.evenOrNotPositive(12);
        assertThat(result, is(true));
    }

    @Test
    public void when13ThenFalse() {
        boolean result = LogicNot.evenOrNotPositive(13);
        assertThat(result, is(false));
    }
}