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

# Problem Statement

This project is a Simple Login Web Application developed using Java Servlets and HttpSession.

The application accepts username and password from the user and validates them using hardcoded credentials. After successful login, the username is stored in session and the user is redirected to the dashboard page.

Logout functionality invalidates the session and redirects the user back to the login page.

---

# Technologies Used

- Java (Servlets)
- HTML
- Apache Tomcat Server
- Eclipse IDE

---

# How to Run This Project

1. Clone this repository or download the ZIP.
2. Import the project into Eclipse as a Dynamic Web Project.
3. Add Apache Tomcat Server in Eclipse.
4. Right-click project → Run As → Run on Server.
5. Open browser and go to:

http://localhost:8080/SecureLoginPortal/login.html

---

# Valid Login Credentials

| Username | Password |
|------|------|
| admin | 111 |
| student | 222 |
| faculty | 333 |

---

# Screenshots

## Login Page

![Login Page](screenshots/login.png)

## Dashboard Page

![Dashboard Page](screenshots/dashboard.png)

## Invalid Login Page

![Invalid Login](screenshots/invalid.png)

---

# Features

- User Login Authentication
- Session Management using HttpSession
- Dashboard Welcome Page
- Logout Functionality
- Invalid Login Handling

---

# Output

- User enters username and password
- Valid login redirects to Dashboard page
- Dashboard displays welcome message
- Logout destroys session and redirects to login page

---

# Servlet Concept Practiced

This project demonstrates the use of HttpSession in Java Servlets.

- Session is created using:

request.getSession()

- Username stored in session using:

session.setAttribute("loggedUser", username)

- Session invalidated during logout using:

session.invalidate()

The application also checks whether the user session exists before accessing the dashboard page.
