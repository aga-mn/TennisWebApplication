<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="header">
    I am the header
    <sec:authorize access="hasRole('ROLE_USER')">
        <!-- For login user -->
        <c:url value="/j_spring_security_logout" var="logoutUrl" />



        <c:if test="${pageContext.request.userPrincipal.name != null}">

            <p>  <a href="<c:url value="j_spring_security_logout" />" > Logout</a>  User : ${pageContext.request.userPrincipal.name}</p>
        </c:if>


    </sec:authorize>
</div>