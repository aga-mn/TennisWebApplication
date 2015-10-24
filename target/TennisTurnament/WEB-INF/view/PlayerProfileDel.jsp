


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







