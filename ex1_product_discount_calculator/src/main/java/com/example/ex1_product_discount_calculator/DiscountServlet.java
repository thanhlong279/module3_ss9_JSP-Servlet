package com.example.ex1_product_discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("price"));
        float discount = Float.parseFloat(req.getParameter("discount"));
        float total = (float) (price * discount* 0.01);
//        PrintWriter writer = resp.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Total discount: " + total + "</h1>");
//        writer.println("</html>");
        req.setAttribute("total", total);
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
