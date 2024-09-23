package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class DemoApplicationTest {

    // Test for addition with three parameters
    @Test
    public void testAddPass() {
        DemoApplication app = new DemoApplication();
        int result = app.add(4, 2, 1);
        assertEquals(7, result);  // 4 + 2 + 1 = 7
    }

//    @Test
//    public void testAddFail() {
//        DemoApplication app = new DemoApplication();
//        int result = app.add(4, 2, 1);
//        assertEquals(8, result);  // This should fail
//    }

    // Test for subtraction with three parameters
    @Test
    public void testSubtractPass() {
        DemoApplication app = new DemoApplication();
        int result = app.sub(4, 2, 1);
        assertEquals(1, result);  // 4 - 2 - 1 = 1
    }

//    @Test
//    public void testSubtractFail() {
//        DemoApplication app = new DemoApplication();
//        int result = app.sub(4, 2, 1);
//        assertEquals(2, result);  // This should fail
//    }

    // Test for multiplication with three parameters
    @Test
    public void testMultiplyPass() {
        DemoApplication app = new DemoApplication();
        int result = app.mul(4, 2, 1);
        assertEquals(8, result);  // 4 * 2 * 1 = 8
    }

//    @Test
//    public void testMultiplyFail() {
//        DemoApplication app = new DemoApplication();
//        int result = app.mul(4, 2, 1);
//        assertEquals(9, result);  // This should fail
//    }

    // Test for division with three parameters
    @Test
    public void testDividePass() {
        DemoApplication app = new DemoApplication();
        int result = (int) app.div(8, 4, 1);
        assertEquals(2, result);  // 8 / 4 / 1 = 2
    }

//    @Test(expected = ArithmeticException.class)
//    public void testDivideByZero() {
//        DemoApplication app = new DemoApplication();
//        app.div(4, 0, 1);  // This should throw an exception
//    }

//    @Test
//    public void testDivideFail() {
//        DemoApplication app = new DemoApplication();
//        double result = app.div(8, 4, 1);
//        assertEquals(3, result);  // This should fail
//    }
}
