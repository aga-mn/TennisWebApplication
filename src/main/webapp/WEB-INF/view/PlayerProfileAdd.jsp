
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



    <div style="color: teal; font-size: medium;">Registration Form </div>
    <br/><br/>
    <c:url var="AddPlayerProfile" value="saveAddPlayerProfile"/>

    <sec:authorize ifAllGranted="ROLE_ADMIN">
      If your Role is ROLE_ADMIN you can see this
    </sec:authorize>

    <sec:authorize ifAllGranted="ROLE_USER">
      If your Role is ROLE_USER you can see this
    </sec:authorize>

    <sec:authorize ifAllGranted="ROLE_USER">
      <h2> Zalogowany</h2>
    </sec:authorize>

    <form:form id="registerForm" modelAttribute="player" method="post" action="${AddPlayerProfile}">
      <table width="400px" height="150px">
        <tr>
          <td><form:label path="firstName">First Name</form:label></td>
          <td><form:input path="firstName"/>
        </tr>
        <tr>
          <td><form:label path="lastName">Last Name</form:label></td>
          <td><form:input path="lastName"/>
        </tr>
        <tr>
          <td><form:label path="username">Username</form:label></td>
          <td><form:input path="username"/>
        </tr>
        <tr>
          <td><form:label path="gender">Gender</form:label></td>
          <td><form:radiobuttons path="gender" items="${model.gender}"/></td>
        </tr>
        <tr>
          <td/>
          <td>
            <input type="submit" value="AddPlayerProfile">
          </td>
        </tr>
      </table>
    </form:form>



  </tiles:putAttribute>
</tiles:insertDefinition>