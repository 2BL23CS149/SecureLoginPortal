# Secure Login Portal using HttpSession

A simple Java Servlet-based web application that demonstrates user authentication and session management using HttpSession.

---

# Student Details

| Field | Details |
|---|---|
| Name | Soumya Pujari |
| USN | 2BL23CS149 |
| Branch | Computer Science & Engineering |
| Semester | VI Semester |
| Subject | Advanced Java Programming |
| Problem No. | Problem 21 |

---

# Problem Statement

Develop a secure login portal using Java Servlets and HttpSession.

The application should:

- Accept username and password from the user
- Validate login credentials
- Create session after successful login
- Redirect user to dashboard page
- Invalidate session during logout
- Redirect back to login page after logout

---

# Technologies Used

- Java Servlets
- HTML
- HttpSession
- Apache Tomcat Server
- Eclipse IDE

---

# Valid Login Credentials

| Username | Password |
|---|---|
| admin | 1234 |

---

# Screenshots

## Login Page

[View Screenshot](screenshots/Screenshot%201.png)

![Login Page](screenshots/Screenshot%201.png)

---

## Dashboard Page

[View Screenshot](screenshots/Screenshot%202.png)

![Dashboard Page](screenshots/Screenshot%202.png)

---

# Output Links

## Login Page

```text
http://localhost:8080/SecureLoginPortal/index.html
```

## Dashboard Page

```text
http://localhost:8080/SecureLoginPortal/DashboardServlet
```

## Logout Page

```text
http://localhost:8080/SecureLoginPortal/UserLogoutServlet
```

---

# How to Run This Project

1. Download or clone the repository

2. Open Eclipse IDE

3. Import the project as Dynamic Web Project

4. Configure Apache Tomcat Server

5. Right click the project

6. Select:

```text
Run As → Run on Server
```

7. Open browser and run:

```text
http://localhost:8080/SecureLoginPortal/index.html
```

---

# Features

- Secure Login Authentication
- Session Handling using HttpSession
- Dashboard Redirection
- Logout Functionality
- Invalid Login Handling
- Simple Servlet-Based Web Application

---

# Project Structure

```text
SecureLoginPortal
│
├── screenshots
│   ├── Screenshot 1.png
│   └── Screenshot 2.png
│
├── src/main
│   ├── DashboardServlet.java
│   ├── UserLoginServlet.java
│   └── UserLogoutServlet.java
│
├── webapp
│   └── web.xml
│
├── index.html
│
└── README.md
```

---

# Servlet Concepts Practiced

- HttpSession Creation
- Session Invalidation
- Login Authentication
- Request Handling
- Response Handling
- Redirecting Between Pages
- Dynamic HTML Response using Servlets

---

# Conclusion

This project demonstrates a simple and secure login system using Java Servlets and HttpSession. It helps understand session tracking, authentication, servlet handling, and web application deployment using Apache Tomcat Server.
