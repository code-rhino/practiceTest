package com.codedifferently.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Part01Test {

    private Part01 part01;

    @BeforeEach
    public void setUp(){
        part01 = new Part01();
    }

    @Test
    public void test1() {
        String string1 = "The";
        String string2 = "Quick";
        String expected = "TheQuick";
        String actual = part01.concatentate(string1,string2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        String string1 = "racecar";
        String string2 = "r";
        String expected = "aceca";
        String actual = part01.removeCharacters(string1, string2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test3(){
        String string1 = "The";
        String expected = "ehT";
        String actual = part01.reverse(string1);
        Assertions.assertEquals(expected, actual);
    }



}
