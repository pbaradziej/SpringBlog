<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<body>
<footer th:fragment="site-footer">
    <div class="rightcolumn">
        <div class="card">
            <h2>O mnie:</h2>
            <p>Nazywam się Paweł Baradziej i jestem początkującym programistą. Studiuję na Uniwersytecie Śląskim.</p>
            <hr>
            <h2>Dzisiaj jest:</h2>
            <!--            <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js">var i =0;</script>-->
            <!--            <script>-->
            <!--                const today = moment();-->
            <!--                document.write("<p>" + today.format('DD-MM-YYYY') + "</p>")-->
            <!--            </script>-->
            <hr>
            <h2>Kategorie:</h2>
            <span ng-click="sortBy('item.category')"></span>
            <button class="btn" href="/filter/Sport">Sport</button>
            <button class="btn" href="/filter/Zwierzęta">Zwierzęta</button>
            <button class="btn" href="/filter/Gry">Gry</button>
            <button class="btn" href="/filter/Wiadomości">Wiadomości</button>
        </div>
        <div class="card">
            <h2>Moje profile:</h2>
            <button class="btn" onclick="window.location.href = 'https://github.com/pbaradziej';">Github</button>
        </div>
    </div>
    </div>

    <div class="pagination">
        <!--    <a href="#">&laquo;</a>-->
        <a href="/1">1</a>
        <a href="/2">2</a>
        <a href="/3">3</a>
        <a href="/4">4</a>
        <a href="/5">5</a>
        <a href="/6">6</a>
        <!--    <a href="#">&raquo;</a>-->
    </div>
    <div class="footer">
        <h2>Autor: Paweł Baradziej</h2>
    </div>
    </div>
</footer>
</body>
</html>