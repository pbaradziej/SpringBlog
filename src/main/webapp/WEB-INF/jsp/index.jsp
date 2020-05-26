<%@ page import="webappservlet.data.Post" %>
<%@ page import="java.util.List" %>
<%@ page import="org.springframework.ui.Model" %>
<%@ page import="webappservlet.services.PostService" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<link rel="stylesheet" href="http://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="../public/css/index.css" th:href="@{/css/index.css}"/>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script src="https://kit.fontawesome.com/be1973d3d0.js" crossorigin="anonymous"></script>
<!--<head>-->
<!--    <meta charset="utf-8"/>-->
<!--    <title></title>-->
<!--</head>-->
<div class = "app">
<jsp:include page="layout.jsp"/>
</div>
<div class = "app">
    <div class="row">
        <div class="leftcolumn">
            <div class="in">
                <form th:action="@{/create}" th:object="${post}" th:method="post">
                    <div class = "centr"><p>Stwórz nowy post</p></div>
                    <div class = "lefts">
                        <input type="hidden" id="id" th:field="*{id}"/>
                        <input type="hidden" id="author.id" th:field="*{author.id}"/>
                        <input class="texts" type = "text" id="title" th:field="*{title}" name = "titles" placeholder = "Title" required minlength="4" formControlName = "titles">
                        <br/>
                        <input class="texts" type = "text" id="category" th:field="*{category}" name = "category" placeholder = "category" formControlName = "category">
                        <input class="texts" type = "text" id="img" th:field="*{img}" name = "category" placeholder = "LinkImage" formControlName = "category">
                        <br/>
                    </div>
                    <div class ="rights">
                        <input class= textlong type = "text" id="body" th:field="*{body}" name = "textlong" placeholder = "Text" formControlName = "category">
                    </div>
                    <input type = "submit" [disabled] = "!formdata.valid" class = "forsubmit" value = "Add Post">
                </form>
            </div>
            <br>
            <%
            Post post = new Post();
                PostService postService;
                List<Post> view5posts  = postService.view5posts(page);
                pageContext.setAttribute("view5posts", view5posts);
            %>
            <main id="posts">
                <c:forEach items="${view5posts}" var ="post">
<%--                <article th:each="post : ${view5posts} ">--%>
                    <div class="column">
                        <div class="left">
                            <h2 class="titles" ${post.title}>Title</h2>
                            <div class="categorydate">
                                <span ${post.category}></span>
                                <i class="fas fa-calendar-day"></i>
                                <span <fmt:formatDate value="${post.date}" type="date" pattern="dd-MM-yyyy"/>></span>
                                <i>by</i>
                                <span ${post.author.username}></span>
                            </div>
                            <div class = "image"><img src=@{${post.img}}></div>
                        </div>
                        <div class="dropdown">
                            <button class="dropbtn">
                                <i class="fas fa-ellipsis-v"></i>
                            </button>
                            <div class="dropdown-content">
                                <a th:href="@{'/edit/' + ${post.id}}">Edit</a>
                                <a th:href="@{'/delete/' + ${post.id}}">Delete</a>
                            </div>
                        </div>
                        <p class="text" ${post.body}></p>
                    </div>
                </c:forEach>
<%--                </article>--%>
            </main>
        </div>
        <jsp:include page="footer.jsp"/>
    </div>
</div>
<jsp:include page="css.jsp"/>
</html>