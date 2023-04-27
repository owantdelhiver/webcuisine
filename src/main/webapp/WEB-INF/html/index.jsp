<%--
  Created by IntelliJ IDEA.
  User: owenb
  Date: 27/04/2023
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/html/include/head.jsp" %>
<%@include file="/WEB-INF/html/include/nav.jsp" %>

<main class="container mt-5">
    <h2>Recettes du moment</h2>

    <div class="row mt-5">
        <%--@elvariable id="recettes" type="java.util.List"--%>
        <c:forEach items="${recettes}" var="recette">
            <div class="col col-4 d-flex align-items-stretch">
                <div class="card" style="width: 100%">
                    <img src="${recette.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${recette.titre}</h5>
                        <p class="card-text">${recette.description}</p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</main>

<%@include file="/WEB-INF/html/include/footer.jsp" %>
