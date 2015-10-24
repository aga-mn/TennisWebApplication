<%@taglib prefix="sec"
          uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="body">
    <html>
    <body>
    <h1>Title : ${title}</h1>
    <h1>Message : ${message}</h1>

    <sec:authorize access="hasRole('ROLE_USER')">
      <!-- For login user -->
      <c:url value="/j_spring_security_logout" var="logoutUrl" />
      <form action="${logoutUrl}" method="post" id="logoutForm">
        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}" />
      </form>
      <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
      <script src="http://underscorejs.org/underscore-min.js"></script>
      <script>
        $(document).ready(function() {

          var list = ${list};
          $.each(list, function( index, value ) {
            alert( index + ": " + value );
          });

        });
      </script>
      <script>
        function formSubmit() {
          document.getElementById("logoutForm").submit();
        }
      </script>

      <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
          User : ${pageContext.request.userPrincipal.name} | <a
                href="javascript:formSubmit()"> Logout</a>
        </h2>
      </c:if>


    </sec:authorize>
    </body>
    </html>
  </tiles:putAttribute>
</tiles:insertDefinition>


