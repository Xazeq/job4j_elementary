package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        assertThat(result, closeTo(2, 0.001));
    }

    @Test
    public void when13To56Then5() {
        Point a = new Point(1, 3);
        Point b = new Point(5, 6);
        double result = a.distance(b);
        assertThat(result, closeTo(5, 0.001));
    }

    @Test
    public void when000To333Then5() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 3, 3);
        double result = a.distance3d(b);
        assertThat(result, closeTo(5.196, 0.001));
    }

    @Test
    public void when333To777Then6() {
        Point a = new Point(3, 3, 3);
        Point b = new Point(7, 7, 7);
        double result = a.distance3d(b);
        assertThat(result, closeTo(6.928, 0.001));
    }

    @Test
    public void when999To111Then13() {
        Point a = new Point(9, 9, 9);
        Point b = new Point(1, 1, 1);
        double result = a.distance3d(b);
        assertThat(result, closeTo(13.856, 0.001));
    }

    /*@Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to58then5() {
        int expected = 5;
        int x1 = 2;
        int y1 = 4;
        int x2 = 5;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to22then1() {
        int expected = 1;
        int x1 = 2;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when68to62then6() {
        int expected = 6;
        int x1 = 6;
        int y1 = 8;
        int x2 = 6;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }*/
}