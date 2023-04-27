package com.owen.webcuisine.servlet.auth;

import com.owen.webcuisine.service.AuthService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = "/connexion")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/html/auth/connexion.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String redirect = "/connexion";

        String email = req.getParameter("email");

        if(new AuthService().getFromCredential(email, req.getParameter("mot_de_passe")) != null) {
            req.getSession().setAttribute("email", email);
            redirect = "/";
        }
        resp.sendRedirect(redirect);
    }
}
