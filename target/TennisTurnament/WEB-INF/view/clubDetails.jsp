<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista klubów</title>
</head>

<body>
  <br><br><br><br><br><br>
  <div style="color: teal; font-size: medium;">Player Details</div>
  <br><br>
  <c:if test="${!empty club}">
      <table border="1" bgcolor="black" width="600px">
          <tr style="background-color: teal;color: white;text-align: center;" height="40px">
              <td>Nazwa klubu</td>
              <td>Ulica</td>
              <td>Numer</td>
              <td>Kod pocztowy</td>
              <td>Miasto</td>
              <td>Opis</td>
          </tr>
          <c:forEach items="${club}" var="club">
              <tr style="background-color:white;color: black;text-align: center;" height="30px" >
                  <td><c:out value="${club.clubName}"/></td>
                  <td><c:out value="${club.street}"/></td>
                  <td><c:out value="${club.streetNumber}"/></td>
                  <td><c:out value="${club.postCode}"/></td>
                  <td><c:out value="${club.city}"/></td>
                  <td><c:out value="${club.description}"/></td>
              </tr>
          </c:forEach>
      </table>
  </c:if>

  <a href="club.html">Dodaj nowy klub</a>

</center>
</body>
</html>