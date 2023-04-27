package com.owen.webcuisine.servlet;

import com.owen.webcuisine.service.RecetteService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("recettes", new RecetteService().fetchAll());

        req.getRequestDispatcher("WEB-INF/html/index.jsp").forward(req,resp);
    }
}
