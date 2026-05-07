package com.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String username = request.getParameter("userName");
        String password = request.getParameter("userPassword");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(username.equals("admin") && password.equals("1234")) {

            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.sendRedirect("DashboardServlet");

        } else {

            out.println("<h1 style='color:red;'>Invalid Login Credentials</h1>");
            out.println("<a href='login.html'>Try Again</a>");
        }
    }
}
