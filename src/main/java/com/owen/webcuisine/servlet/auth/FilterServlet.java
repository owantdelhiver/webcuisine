package com.owen.webcuisine.servlet.auth;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class FilterServlet extends HttpFilter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        HttpServletResponse httpServletResponse = (HttpServletResponse) res;
        HttpSession httpSession = httpServletRequest.getSession();

        if(httpServletRequest.getRequestURI().equals(httpServletRequest.getContextPath() + "/login") || httpServletRequest.getRequestURI().contains(httpServletRequest.getContextPath() + "/webapi")) {
            chain.doFilter(req, res);
        } else {
            if (httpSession.getAttribute("username") == null) {
                httpServletResponse.sendRedirect(getServletContext().getContextPath() + "/login");
            } else {
                chain.doFilter(req, res);
            }
        }
    }
}
