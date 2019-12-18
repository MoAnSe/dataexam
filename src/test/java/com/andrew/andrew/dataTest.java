package com.andrew.andrew;

import org.junit.Assert;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static com.andrew.andrew.data.*;

public class dataTest {

    @Test
    public void Tdatam() {
        int a = 11;
        int b = 18;
        Assert.assertEquals(46,datam(a,b));
        System.out.println("Test successful!");
    }
}