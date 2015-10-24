<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

<html>
<head>
  <title>Rejestracja Klubu</title>
</head>
<body>
<H1>Club</H1>
<c:url var="clubRegistration" value="saveClub.html"/>
<form:form id="clubRegisterForm" modelAttribute="club" method="post" action="${clubRegistration}">
  <table width="400px" height="150px">
      <tr>
          <td><form:label path="clubName">Nazwa</form:label></td>
          <td><form:input path="clubName"/>
      </tr>
      <tr>
          <td><form:label path="street">Ulica</form:label></td>
          <td><form:input path="street"/>
      </tr>
      <tr>
          <td><form:label path="streetNumber">Numer</form:label></td>
          <td><form:input path="streetNumber"/>
      </tr>
      <tr>
          <td><form:label path="postCode">Kod pocztowy</form:label></td>
          <td><form:input path="postCode"/>
      </tr>
      <tr>
          <td><form:label path="city">Miasto</form:label></td>
          <td><form:input path="city"/>
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

    </tiles:putAttribute>
</tiles:insertDefinition>
