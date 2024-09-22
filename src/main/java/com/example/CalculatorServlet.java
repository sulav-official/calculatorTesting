//package com.example;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
////test
//
////@WebServlet("/calculate")
//public class CalculatorServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int num3 = Integer.parseInt(request.getParameter("num3"));
//
//        DemoApplication demoApplication = new DemoApplication();
//        int result = demoApplication.add(num1, num2, num3);
//        request.setAttribute("result", result);
//        request.getRequestDispatcher("result.jsp").forward(request, response);
//    }
//}


package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int num3 = Integer.parseInt(request.getParameter("num3"));
            String operation = request.getParameter("operation");

            DemoApplication demoApplication = new DemoApplication();
            double result =0 ; // Changed to double for percentage calculations

            switch (operation) {
                case "add":
                    result = demoApplication.add(num1, num2, num3);
                    break;
                case "sub":
                    result = demoApplication.sub(num1, num2, num3);
                    break;
                case "mult":
                    result = demoApplication.mul(num1, num2, num3);
                    break;
                case "div":
                    if (num2 == 0 || num3 == 0) {
                        request.setAttribute("error", "Cannot divide by zero!");
                    } else {
                        result = demoApplication.div(num1, num2, num3);
                    }
                    break;
                case "per":
                    if (num2 == 0) {
                        request.setAttribute("error", "Cannot calculate percentage with zero as denominator!");
                    } else {
                        result = demoApplication.per(num1, num2);
                    }
                    break;
                default:
                    request.setAttribute("error", "Invalid operation.");
            }

            request.setAttribute("result", result);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Invalid input. Please enter valid numbers.");
            request.getRequestDispatcher("result.jsp").forward(request, response);
        }
    }
}

