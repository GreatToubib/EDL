package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ProduitTest {

    @Test
    public void multiEquals() {
        System.out.println("Test multiEqquals");
        assertEquals(Addition.add( 5, 3), 15 );
    }

    @Test
    public void multiNotEquals() {
        System.out.println("Test MultiNotEqquals");
        assertNotEquals(Addition.add(1,1), 3 );
    }

}