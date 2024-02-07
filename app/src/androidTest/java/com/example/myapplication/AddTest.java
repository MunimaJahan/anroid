package com.example.myapplication;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class AddTest {
    @Test
    public void testAdd(){
        Calculator cal=new Calculator();
        int p1=5;
        int p2=3;
        int actual=8;
        int expected=cal.add(5,3);
        assertEquals(expected,actual);
    }
}
