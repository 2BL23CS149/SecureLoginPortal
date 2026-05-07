package com.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserLogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if(session != null) {

            session.invalidate();
        }

        response.sendRedirect("login.html");
    }
}