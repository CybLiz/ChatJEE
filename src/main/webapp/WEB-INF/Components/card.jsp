
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="container" >
    <h1>Liste de chats</h1>

    <ul class="list-group" style="width: 25%">
        <c:forEach var="cat" items="${cats}">
            <li class="list-group-item">
                <strong>${cat.name}</strong>
                <p>Breed : ${cat.breed} </p>
                <p>Favorite Meal : ${cat.favoriteMeal}</p>
                <p>Birthdate : ${cat.birthDate}</p>

            </li>
        </c:forEach>
    </ul>
</div>

