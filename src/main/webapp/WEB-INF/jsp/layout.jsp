<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head th:fragment="site-head">
    <link rel="stylesheet" href="http://www.w3schools.com/w3css/4/w3.css">
    <%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
    <link rel="stylesheet" href="../public/css/index.css" th:href="@{/css/index.css}"/>
    <script src="https://kit.fontawesome.com/be1973d3d0.js" crossorigin="anonymous"></script>
    <meta charset="utf-8"/>
    <title></title>
</head>
<body><header th:fragment="site-header">
    <div class = "app">
        <div class="header">
            <h1>Wagon Blog</h1>
            <p>O wagonach i innych</p>
        </div>

        <div class="topnav">
            <a href="index.html" th:href="@{/}" style="float:left"><i class="fas fa-train"></i></a>
            <a href="login.jsp" th:href="@{/login}" style="float:right"><i class="fas fa-address-card"></i> Zaloguj się</a>
            <a href="register.html" th:href="@{/register}" style="float:right"><i class="fas fa-sign-in-alt"></i> Zarejestruj się</a>
        </div>

    </div>
</header>

</body>
</html>