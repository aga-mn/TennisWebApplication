<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
    <title>Profil gracza</title>
</head>
<body>

    <c:url var="profileRegistration" value="saveProfile.html"/>
    <form:form id="profileRegisterForm" modelAttribute="playerProfile" method="post" action="${profileRegistration}">
        <table width="400px" height="150px">
            <tr>
                <td><form:label path="player.playerId">Id gracza</form:label></td>
                <td>
                    <form:select path="player.playerId">
                        <form:option value="NONE">----Wybierz gracza----</form:option>
                            <c:forEach items="${model.players}" var="player">
                                <option value="${player.playerId}">${player.username}</option>
                            </c:forEach>

                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="racquet">Rakieta</form:label></td>
                <td><form:input path="racquet"/>
            </tr>
            <tr>
                <td><form:label path="hand">Ręka</form:label></td>
                <td><form:radiobuttons path="hand" items="${model.hand}"/></td>
            </tr>
            <tr>
                <td><form:label path="favouritePlayer">Ulubiony gracz</form:label></td>
                <td><form:input path="favouritePlayer"/>
            </tr>
            <tr>
                <td><form:label path="description">Opis</form:label></td>
                <td><form:input path="description"/>
            </tr>
            <tr>
                <td/>
                <td>
                  <input type="submit" value="Dodaj">
            </td>
            </tr>
        </table>
    </form:form>


</body>
</html>