//package com.example;
//
//public class DemoApplication {
//    // Method to add two numbers
//    public int add(int a, int b, int c) {
//        return a + b+ c;
//    }
//
//    public int sub(int a, int b, int c) {
//        return a - b;
//    }
//
//    public int mul(int a, int b, int c) {
//        return a * b;
//    }
//    public int div(int a, int b, int c) {
//        return a / b / c;
//    }
//    public int percent(int a, int b, int c) {
//        return a /100;
//    }
//}


package com.example;

public class DemoApplication {
    // Method to add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to subtract the second and third numbers from the first
    public int sub(int a, int b, int c) {
        return a - b - c;
    }

    // Method to multiply three numbers
    public int mul(int a, int b, int c) {
        return a * b * c;
    }

    // Method to divide the first number by the second and third
    public double div(int a, int b, int c) {
        if (b == 0 || c == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b / c;
    }

    // Method to calculate percentage of the first number based on the second number
    public double per(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed for percentage calculation.");
        }
        return (double) a / b * 100;
    }
}
