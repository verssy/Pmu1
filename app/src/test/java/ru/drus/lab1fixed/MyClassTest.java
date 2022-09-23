package ru.drus.lab1fixed;

import org.junit.Assert;
import org.junit.Test;
import ru.drus.lab1fixed.MyClass;

public class MyClassTest {
    @Test
    public void test_max_1_2_2() {
        Assert.assertEquals(2, MyClass.myMax(1, 2));
    }
    @Test
    public void test_max_2_minus1_2() {
        Assert.assertEquals(2, MyClass.myMax(2, -1));
    }
    @Test
    public void test_max_minus1_minus2_minus1() {
        Assert.assertEquals(-1, MyClass.myMax(-1, -2));
    }
    @Test
    public void test_max_0_minus2_0() {
        Assert.assertEquals(0, MyClass.myMax(0, -2));
    }
    @Test
    public void test_min_1_2_1() {
        Assert.assertEquals(1, MyClass.myMin(1, 2));
    }
    @Test
    public void test_min_2_minus1_minus1() {
        Assert.assertEquals(-1, MyClass.myMin(2, -1));
    }
    @Test
    public void test_min_minus1_minus2_minus2() {
        Assert.assertEquals(-2, MyClass.myMin(-1, -2));
    }
    @Test
    public void test_min_0_minus2_minus2() {
        Assert.assertEquals(-2, MyClass.myMin(0, -2));
    }
}