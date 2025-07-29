
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<jsp:useBean id="Cat" scope="request" type="java.util.List"/>--%>

<div class="container" style="width: 25%">

    <h1>Ajouter un chat</h1>

    <form action="cats" method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Name :</label>
                <input type="text" class="form-control" id="name" name="name" >
            </div>
            <div class="mb-3">
                <label for="breed" class="form-label">Breed :</label>
                <input type="text" class="form-control" id="breed" name="breed">
            </div>

            <div class="mb-3">
                <label for="favoriteMeal" class="form-label">Favorite Meal :</label>
                <input type="text" class="form-control" id="favoriteMeal" name="favoriteMeal">
            </div>
            <div class="mb-3">
                <label for="birthDate" class="form-label">Birth Date :</label>
                <input type="date" class="form-control" id="birthDate"  name="birthDate">>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>


