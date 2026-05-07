package com.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if(session != null) {

            String username = (String) session.getAttribute("username");

            out.println("<h1>Welcome " + username + "</h1>");
            out.println("<h2>Login Successful</h2>");
            out.println("<a href='UserLogoutServlet'>Logout</a>");

        } else {

            response.sendRedirect("login.html");
        }
    }
}
