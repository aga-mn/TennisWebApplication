
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="header">
    <%@include file="PlayerMenu.jsp" %>
  </tiles:putAttribute>
  <tiles:putAttribute name="body">
    <html>
    <body>
    <div style="color: teal; font-size: medium;">Player Details</div>
    <br><br>
    <c:if test="${!empty player}">
      <table border="1" bgcolor="black" width="600px" hight="100%">
        <tr style="background-color: teal;color: white;text-align: center;" height="40px">
          <td>PlayerId</td>
          <td>First Name</td>
          <td>Last Name</td>
          <td>Username</td>
          <td>Gender</td>
        </tr>
        <c:forEach items="${player}" var="player">
          <tr style="background-color:white;color: black;text-align: center;" height="30px" >
            <td><c:out value="${player.playerId}"/></td>
            <td><c:out value="${player.firstName}"/></td>
            <td><c:out value="${player.lastName}"/></td>
            <td><c:out value="${player.username}"/></td>
            <td><c:out value="${player.gender}"/></td>
          </tr>
        </c:forEach>
      </table>
    </c:if>
    </body>
    </html>
  </tiles:putAttribute>
</tiles:insertDefinition>