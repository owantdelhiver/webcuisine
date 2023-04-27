<%--
  Created by IntelliJ IDEA.
  User: owenb
  Date: 18/04/2023
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/">
        <img src="${pageContext.request.contextPath}/image/100.png" width="30" height="30" class="d-inline-block align-top" alt="">
        WebCuisine
    </a>

    <div class="collapse navbar-collapse d-flex justify-content-end">
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/connexion">Connexion</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/deconnexion">Deconnexion</a>
            </li>
        </ul>
    </div>
</nav>