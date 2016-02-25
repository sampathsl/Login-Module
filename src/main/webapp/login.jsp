<%--
  Created by IntelliJ IDEA.
  User: SAMPATH
  Date: 2/25/2016
  Time: 12:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/login.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
</head>
<body>

    <form class="login">

        <h1>SwiZZ Soft Inc.</h1>

        <fieldset>

            <legend class="legend">Login</legend>

            <div class="input">
                <input type="email" placeholder="Email" required />
                <span><i class="fa fa-envelope-o"></i></span>
            </div>

            <div class="input">
                <input type="password" placeholder="Password" required />
                <span><i class="fa fa-lock"></i></span>
            </div>

            <button type="submit" class="submit"><i class="fa fa-long-arrow-right"></i></button>

        </fieldset>

        <div class="feedback">
            login successful <br />
            redirecting...
        </div>

    </form>

</body>
</html>
