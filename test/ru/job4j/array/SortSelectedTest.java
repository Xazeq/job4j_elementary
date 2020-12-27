package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort5() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = {9, 5, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = {5, 7, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort8() {
        int[] input = {9, 5, 7, 3, 5, 7, 7, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = {3, 5, 5, 7, 7, 7, 9, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort20() {
        int[] input = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        assertThat(result, is(expect));
    }
}