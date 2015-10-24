


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





    <div style="color: teal; font-size: medium;">Delete Form </div>





    <br/><br/>
    <c:url var="DelPlayerProfile" value="saveDelPlayerProfile"/>


    <table border="1" bgcolor="black" width="600px" hight="100%">
      <tr style="background-color: teal;color: white;text-align: center;" height="40px">
        <td>PlayerId</td>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Username</td>
        <td>Gender</td>
      </tr>

      <tr style="background-color:white;color: black;text-align: center;" height="30px" >
        <td><c:out value="${player.playerId}"/></td>
        <td><c:out value="${player.firstName}"/></td>
        <td><c:out value="${player.lastName}"/></td>
        <td><c:out value="${player.username}"/></td>
        <td><c:out value="${player.gender}"/></td>
      </tr>

    </table>


  <BR>

    <table border="1" bgcolor="black" width="600px" hight="100%">
      <tr style="background-color: teal;color: white;text-align: center;" height="40px">
        <td>favouritePlayer</td>
        <td>description</td>
        <td>hand</td>
        <td>racquet</td>
        <td>photo</td>
      </tr>
<H1>Player profile :</H1>
      <tr style="background-color:white;color: black;text-align: center;" height="30px" >
        <td><c:out value="${player.playerProfile.favouritePlayer}"/></td>
        <td><c:out value="${player.playerProfile.description}"/></td>
        <td><c:out value="${player.playerProfile.hand}"/></td>
        <td><c:out value="${player.playerProfile.racquet}"/></td>
        <td><c:out value="${player.playerProfile.photo}"/></td>
      </tr>

    </table>


    playerProfile


    <form:form id="registerForm" modelAttribute="player" method="post" action="${DelPlayerProfile}">
      <table width="400px" height="150px">
        <tr>
          <td><form:label path="playerId">Pleyerid:</form:label></td>
          <td><form:input path="playerId"/>
        </tr>



        <tr>

          <td>
            <input type="submit" value="DelPlayerProfile">
          </td>
        </tr>
      </table>
    </form:form>




  </tiles:putAttribute>
</tiles:insertDefinition>



