package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DemoApplicationTest {

    @Test
    public void testAdd() {
        DemoApplication app = new DemoApplication();
        int result = app.add(4, 2);
        assertEquals(4, result);
    }
}
