package com.thinhle.helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(55, App.add(50, 5));
        assertNotEquals(1, App.add(50, 5));
    }

}
