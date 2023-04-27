

<%--
  Created by IntelliJ IDEA.
  User: owenb
  Date: 27/04/2023
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="/WEB-INF/html/include/head.jsp" %>
<%@include file="/WEB-INF/html/include/nav.jsp" %>
<main>
    <h1 class="text-center mt-5">Web Cuisine</h1>

    <div class="row justify-content-center mt-5">
        <div class="col-md-7 col-lg-5 mt-5">
            <div class="wrap">
                <div class="login-wrap p-4 p-md-5">
                    <div class="text-center">
                        <h3 class="mb-4">Se connecter</h3>
                    </div>
                    <form action="${pageContext.request.contextPath}/connexion" method="post">
                        <div class="form-floating mt-5 mb-5">
                            <input id="email" type="email" name="email" class="form-control" placeholder="name@example.com" required>
                            <label for="email">email</label>
                        </div>
                        <div class="form-floating mt-5 mb-5">
                            <input id="mot_de_passe" type="password" name="mot_de_passe" class="form-control" placeholder="password" required>
                            <label class="form-control-placeholder" for="mot_de_passe">Password</label>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="form-control btn btn-primary rounded submit px-3">Se connecter</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</main>
<%@include file="/WEB-INF/html/include/footer.jsp" %>
