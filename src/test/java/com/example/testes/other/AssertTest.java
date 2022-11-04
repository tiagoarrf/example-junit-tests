package com.example.testes.other;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertTest {

    @Test
    public void testAssertArrayEqualsd() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEquals() {
        assertEquals("teste", "teste");
    }
    
    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertNotNulld() {
        assertNotNull(new Object());
    }
    
    @Test
    public void testAssertNotSame() {
        assertNotSame(new Object(), new Object());
    }
    
    @Test
    public void testAssertNotNull() {
        assertNotNull("");
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }
    
    @Test
    public void testAssertSame() {
        Integer num = Integer.valueOf(123);
        assertSame(num, num);
    }
    
}
