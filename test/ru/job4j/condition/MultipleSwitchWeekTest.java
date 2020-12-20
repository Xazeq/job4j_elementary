package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMonday() {
        int result = MultipleSwitchWeek.numberOfDay("Monday");
        assertThat(result, is(1));
    }

    @Test
    public void whenWednesday() {
        int result = MultipleSwitchWeek.numberOfDay("Среда");
        assertThat(result, is(3));
    }

    @Test
    public void whenSaturday() {
        int result = MultipleSwitchWeek.numberOfDay("Saturday");
        assertThat(result, is(6));
    }

    @Test
    public void whenError() {
        int result = MultipleSwitchWeek.numberOfDay("Какой-то текст");
        assertThat(result, is(-1));
    }
}