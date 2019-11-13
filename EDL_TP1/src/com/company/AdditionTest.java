package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class AdditionTest {

    @Test
    public void addEquals() {
        System.out.println("Test addEqquals");
        assertEquals(Addition.add( 5, 3), 8 );
    }

    @Test
    public void addNotEquals() {
        System.out.println("Test addNotEqquals");
        assertNotEquals(Addition.add( 1, 1), 3 );
    }

}