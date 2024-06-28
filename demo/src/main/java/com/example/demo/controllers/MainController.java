package com.example.demo.controllers;

import com.example.demo.service.ICalculatorService;
import com.example.demo.service.impl.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="MainController", value = "/main")
public class MainController extends HttpServlet {
    private ICalculatorService calculatorService = new CalculatorService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("main.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
        int c = calculatorService.sum(a,b);
        req.setAttribute("result",c);
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
