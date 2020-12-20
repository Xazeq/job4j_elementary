package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void whenMonday() {
        String result = SwitchWeek.nameOfDay(1);
        assertThat(result, is("Понедельник"));
    }

    @Test
    public void whenTuesday() {
        String result = SwitchWeek.nameOfDay(2);
        assertThat(result, is("Вторник"));
    }

    @Test
    public void whenWednesday() {
        String result = SwitchWeek.nameOfDay(3);
        assertThat(result, is("Среда"));
    }

    @Test
    public void whenThursday() {
        String result = SwitchWeek.nameOfDay(4);
        assertThat(result, is("Четверг"));
    }

    @Test
    public void whenFriday() {
        String result = SwitchWeek.nameOfDay(5);
        assertThat(result, is("Пятница"));
    }

    @Test
    public void whenSaturday() {
        String result = SwitchWeek.nameOfDay(6);
        assertThat(result, is("Суббота"));
    }

    @Test
    public void whenSunday() {
        String result = SwitchWeek.nameOfDay(7);
        assertThat(result, is("Воскресенье"));
    }

    @Test
    public void whenError() {
        String result = SwitchWeek.nameOfDay(24);
        assertThat(result, is("Ошибка"));
    }
}