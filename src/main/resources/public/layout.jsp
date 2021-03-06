<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head th:fragment="site-head">
    <link rel="stylesheet" href="http://www.w3schools.com/w3css/4/w3.css">
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
<%--<style>--%>

<%--    .app{--%>

<%--        background-color: lightgray;--%>
<%--    }--%>
<%--    /* Style The Dropdown Button */--%>
<%--    .in{--%>
<%--        height: 340px;--%>
<%--    }--%>

<%--    .texts{--%>
<%--        padding: 12px 20px;--%>
<%--        /*margin: 8px 0;*/--%>
<%--        display: inline-block;--%>
<%--        border: 1px solid #ccc;--%>
<%--        border-radius: 4px;--%>
<%--        box-sizing: border-box;--%>
<%--        width: 90%;--%>
<%--        margin-left: 20px;--%>
<%--        margin-bottom: 10px;--%>
<%--        word-wrap: break-word;--%>
<%--    }--%>

<%--    .rights {--%>
<%--        /*margin-right: 10px;*/--%>
<%--        width: 47%;--%>
<%--        /*padding: 12px 20px;*/--%>
<%--        float: left;--%>
<%--        /*height: 100px;*/--%>
<%--        /*margin-top: 8px;*/--%>
<%--        /*display: inline-block;*/--%>
<%--        /*border: 1px solid #ccc;*/--%>
<%--        /*border-radius: 4px;*/--%>
<%--        /*box-sizing: border-box;*/--%>
<%--    }--%>
<%--    .textlong{--%>
<%--        width: 100%;--%>
<%--        margin-right: 10px;--%>
<%--        padding: 12px 20px;--%>
<%--        height: 160px;--%>
<%--        margin-bottom: 10px;--%>
<%--        display: inline-block;--%>
<%--        border: 1px solid #ccc;--%>
<%--        border-radius: 4px;--%>
<%--        box-sizing: border-box;--%>

<%--    }--%>
<%--    .textleft{--%>
<%--        width: 95%;--%>
<%--        padding: 12px 20px;--%>
<%--        margin: 8px 0;--%>
<%--        margin-left: 10px;--%>
<%--        border: 1px solid #ccc;--%>
<%--        border-radius: 4px;--%>
<%--        box-sizing: border-box;--%>
<%--    }--%>

<%--    .dropbtn {--%>
<%--        background-color: #4CAF50;--%>
<%--        color: white;--%>
<%--        padding: 16px;--%>
<%--        font-size: 16px;--%>
<%--        border: none;--%>
<%--        cursor: pointer;--%>
<%--    }--%>

<%--    /* The container <div> - needed to position the dropdown content */--%>
<%--    .dropdown {--%>
<%--        float: right;--%>
<%--        position: relative;--%>
<%--        display: inline-block;--%>
<%--    }--%>

<%--    /* Dropdown Content (Hidden by Default) */--%>
<%--    .dropdown-content {--%>
<%--        display: none;--%>
<%--        position: absolute;--%>
<%--        background-color: #f9f9f9;--%>
<%--        min-width: 160px;--%>
<%--        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);--%>
<%--        z-index: 1;--%>
<%--    }--%>

<%--    /* Links inside the dropdown */--%>
<%--    .dropdown-content a {--%>
<%--        color: black;--%>
<%--        padding: 12px 16px;--%>
<%--        text-decoration: none;--%>
<%--        display: block;--%>
<%--    }--%>

<%--    /* Change color of dropdown links on hover */--%>
<%--    .dropdown-content a:hover {background-color: #f1f1f1}--%>

<%--    /* Show the dropdown menu on hover */--%>
<%--    .dropdown:hover .dropdown-content {--%>
<%--        display: block;--%>
<%--    }--%>

<%--    /* Change the background color of the dropdown button when the dropdown content is shown */--%>
<%--    .dropdown:hover .dropbtn {--%>
<%--        background-color: #3e8e41;--%>
<%--    }--%>

<%--    .pagination{--%>

<%--        margin-left: 46%;--%>
<%--    }--%>

<%--    * {--%>
<%--        box-sizing: border-box;--%>

<%--    }--%>

<%--    body {--%>
<%--        font-family: Arial;--%>
<%--        padding: 10px;--%>
<%--        background: lightgray;--%>
<%--    }--%>

<%--    p{--%>
<%--        font-size: 25px;--%>
<%--    }--%>

<%--    .header {--%>
<%--        padding: 5px;--%>
<%--        text-align: center;--%>
<%--        background: brown;--%>
<%--    }--%>

<%--    .btn {--%>
<%--        border: none;--%>
<%--        width: 100%;--%>
<%--        text-align: left;--%>
<%--        background-color: inherit;--%>
<%--        padding: 14px 28px;--%>
<%--        font-size: 20px;--%>
<%--        cursor: pointer;--%>
<%--        display: inline-block;--%>
<%--    }--%>

<%--    .btn:hover {background: #eee;}--%>

<%--    .date {--%>
<%--        font-size: 25px;--%>
<%--    }--%>

<%--    .header h1 {--%>
<%--        font-size: 50px;--%>
<%--    }--%>

<%--    h2 {--%>
<%--        font-size: 25px;--%>
<%--    }--%>

<%--    .topnav {--%>
<%--        overflow: hidden;--%>
<%--        background-color: brown;--%>
<%--    }--%>

<%--    .topnav a {--%>
<%--        float: left;--%>
<%--        display: block;--%>
<%--        color: #f2f2f2;--%>
<%--        text-align: center;--%>
<%--        padding: 14px 16px;--%>
<%--        text-decoration: none;--%>
<%--    }--%>

<%--    .topnav a:hover {--%>
<%--        background-color: #ddd;--%>
<%--        color: black;--%>
<%--    }--%>

<%--    .delete{--%>
<%--        float: right;--%>
<%--    }--%>



<%--    .leftcolumn {--%>
<%--        float: left;--%>
<%--        background: lightgray;--%>
<%--        width: 75%;--%>
<%--    }--%>

<%--    .titles {--%>
<%--        text-align: center;--%>
<%--    }--%>

<%--    .centr{--%>
<%--        text-align: center;--%>
<%--    }--%>

<%--    .lefts {--%>
<%--        float: left;--%>
<%--        width: 50%;--%>
<%--        /*//padding: 12px 20px;*/--%>
<%--        /*//margin: 8px 0;*/--%>
<%--        /*//  display: inline-block;*/--%>
<%--        /*//  border: 1px solid #ccc;*/--%>
<%--        /*//  border-radius: 4px;*/--%>
<%--        /*//  box-sizing: border-box;*/--%>
<%--    }--%>

<%--    input[type=submit] {--%>
<%--        width: 90%;--%>
<%--        background-color: #4CAF50;--%>
<%--        color: white;--%>
<%--        margin-left: 60px;--%>
<%--        padding: 14px 20px;--%>

<%--        border: none;--%>
<%--        border-radius: 4px;--%>
<%--        cursor: pointer;--%>
<%--    }--%>

<%--    /*input[class=textlong] or .textlong {*/--%>
<%--    /*    margin-right: 10px;*/--%>
<%--    /*    width: 48%;*/--%>
<%--    /*    padding: 12px 20px;*/--%>
<%--    /*    float: right;*/--%>
<%--    /*    height: 100px;*/--%>
<%--    /*    margin-top: 8px;*/--%>
<%--    /*    display: inline-block;*/--%>
<%--    /*    border: 1px solid #ccc;*/--%>
<%--    /*    border-radius: 4px;*/--%>
<%--    /*    box-sizing: border-box;*/--%>
<%--    /*}*/--%>


<%--    .categorydate{--%>
<%--        text-align: center;--%>
<%--    }--%>
<%--    .image{--%>
<%--        display: block;--%>
<%--        margin-left: auto;--%>
<%--        margin-right: auto;--%>
<%--        width: 50%;--%>
<%--        margin-bottom: 15px;--%>
<%--    }--%>


<%--    .rightcolumn {--%>
<%--        float: left;--%>
<%--        width: 25%;--%>
<%--        background-color: lightgray;--%>
<%--        padding-left: 5px;--%>
<%--    }--%>

<%--    .icon {--%>
<%--        height: 47px;--%>
<%--        width: 47px;--%>
<%--        padding-left: 5px;--%>
<%--        padding-top: 5px;--%>

<%--    }--%>


<%--    .card {--%>
<%--        background-color: white;--%>
<%--        padding: 10px;--%>
<%--        margin-top: 5px;--%>
<%--        border-style: solid;--%>
<%--        border-radius: 25px;--%>
<%--        border-color: lightgray;--%>
<%--    }--%>

<%--    .left{--%>
<%--        float: left;--%>
<%--        width: 50%;--%>
<%--    }--%>

<%--    .text {--%>
<%--        float: right;--%>
<%--        width: 48%;--%>
<%--        margin-right: 20px;--%>
<%--        word-wrap: break-word;--%>
<%--    }--%>

<%--    .in {--%>
<%--        background-color: white;--%>
<%--        border-style: solid;--%>
<%--        border-radius: 25px;--%>
<%--        border-color: lightgray;--%>
<%--        width: 100%;--%>

<%--    }--%>

<%--    .column {--%>
<%--        background-color: white;--%>
<%--        float: left;--%>

<%--        margin-bottom: 5px;--%>
<%--        width: 100%;--%>
<%--        border-style: solid;--%>
<%--        border-radius: 25px;--%>
<%--        border-color: lightgray;--%>
<%--    }--%>

<%--    .row:after {--%>
<%--        content: "";--%>
<%--        display: table;--%>
<%--        clear: both;--%>
<%--    }--%>

<%--    .pagination a {--%>
<%--        color: black;--%>
<%--        float: bottom;--%>
<%--        padding: 8px 16px;--%>
<%--        text-decoration: none;--%>
<%--        transition: background-color .3s;--%>
<%--    }--%>

<%--    .pagination a.active {--%>
<%--        background-color: dodgerblue;--%>
<%--        color: white;--%>
<%--    }--%>

<%--    .pagination a:hover:not(.active) {background-color: #ddd;}--%>

<%--    .footer {--%>
<%--    //padding: px;--%>
<%--        background: brown;--%>
<%--        text-align: center;--%>
<%--        margin-top: 20px;--%>
<%--        padding-top: 5px;--%>
<%--    }--%>

<%--    @media screen and (max-width: 800px) {--%>
<%--        .leftcolumn, .rightcolumn {--%>
<%--            width: 100%;--%>
<%--            padding: 0;--%>
<%--        }--%>
<%--    }--%>

<%--    @media screen and (max-width: 400px) {--%>
<%--        .topnav a {--%>
<%--            float: none;--%>
<%--            width: 100%;--%>
<%--        }--%>
<%--    }--%>


<%--    /* Style The Dropdown Button */--%>
<%--    .dropbtn {--%>
<%--        background-color: #4CAF50;--%>
<%--        color: white;--%>
<%--        padding: 16px;--%>
<%--        font-size: 16px;--%>
<%--        border: none;--%>
<%--        cursor: pointer;--%>
<%--    }--%>

<%--    /* The container <div> - needed to position the dropdown content */--%>
<%--    .dropdown {--%>
<%--        position: relative;--%>
<%--        display: inline-block;--%>
<%--    }--%>

<%--    /* Dropdown Content (Hidden by Default) */--%>
<%--    .dropdown-content {--%>
<%--        display: none;--%>
<%--        position: absolute;--%>
<%--        background-color: #f9f9f9;--%>
<%--        min-width: 160px;--%>
<%--        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);--%>
<%--        z-index: 1;--%>
<%--    }--%>

<%--    /* Links inside the dropdown */--%>
<%--    .dropdown-content a {--%>
<%--        color: black;--%>
<%--        padding: 12px 16px;--%>
<%--        text-decoration: none;--%>
<%--        display: block;--%>
<%--    }--%>

<%--    /* Change color of dropdown links on hover */--%>
<%--    .dropdown-content a:hover {background-color: #f1f1f1}--%>

<%--    /* Show the dropdown menu on hover */--%>
<%--    .dropdown:hover .dropdown-content {--%>
<%--        display: block;--%>
<%--    }--%>

<%--    /* Change the background color of the dropdown button when the dropdown content is shown */--%>
<%--    .dropdown:hover .dropbtn {--%>
<%--        background-color: #3e8e41;--%>
<%--    }--%>

<%--</style>--%>
</html>