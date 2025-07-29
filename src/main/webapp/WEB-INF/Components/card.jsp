
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="Cat" scope="request" type="java.util.List"/>


<div class="container" >
    <h1>Liste de chats</h1>

    <ul class="list-group" style="width: 25%">
        <c:forEach var="cat" items="${cats}">
            <li class="list-group-item">
                <strong>${cat.name} ${cat.breed}</strong>
                <p>Âge : ${cat.favoriteMeal}, Email : ${cat.birthDate}</p>
            </li>
        </c:forEach>
    </ul>
</div>

