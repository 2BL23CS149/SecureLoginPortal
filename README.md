# Secure Login Portal using HttpSession

## Student Details

| Field | Details |
|------|------|
| Name | Soumya Pujari |
| USN | 2BL23CS149 |
| Branch | Computer Science & Engineering |
| Semester | VI Semester |
| Subject | Advanced Java Programming |
| Problem No. | Problem 21 |

---

## Problem Statement

This project is a Simple Login Web Application developed using Java Servlets and HttpSession.

The application accepts username and password from the user and validates them using hardcoded credentials. After successful login, session is created and the user is redirected to the dashboard page.

Logout functionality invalidates the session and redirects the user back to the login page.

---

## Technologies Used

- Java (Servlets)
- HTML
- HttpSession
- Apache Tomcat Server
- Eclipse IDE

---

## Screenshots

### Login Page

[View Login Screenshot](screenshots/Screenshot%201.png)

![Login Page](screenshots/Screenshot%201.png)

### Dashboard Page

[View Dashboard Screenshot](screenshots/Screenshot%202.png)

![Dashboard Page](screenshots/Screenshot%202.png)

---

## How to Run This Project

1. Clone this repository or download the ZIP.
2. Import the project into Eclipse as a Dynamic Web Project.
3. Add Apache Tomcat Server in Eclipse.
4. Right-click project → Run As → Run on Server.
5. Open browser and go to:

[Open Login Page](http://localhost:8080/SecureLoginPortal/index.html)

---

## Valid Login Credentials

| Username | Password |
|------|------|
| admin | 1234 |

---

## Output Links

### Login Page

[http://localhost:8080/SecureLoginPortal/index.html](http://localhost:8080/SecureLoginPortal/index.html)

### Dashboard Page

[http://localhost:8080/SecureLoginPortal/DashboardServlet](http://localhost:8080/SecureLoginPortal/DashboardServlet)

### Logout Page

[http://localhost:8080/SecureLoginPortal/UserLogoutServlet](http://localhost:8080/SecureLoginPortal/UserLogoutServlet)

---

## Features

- User Login Authentication
- Session Management using HttpSession
- Dashboard Access after Login
- Logout Functionality
- Invalid Login Handling

---

## Project Structure

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

## Servlet Concepts Practiced

This project demonstrates:

- HttpSession handling
- Session creation and invalidation
- Login authentication using Servlets
- Request and Response handling
- Redirecting between pages
- Dynamic dashboard generation
