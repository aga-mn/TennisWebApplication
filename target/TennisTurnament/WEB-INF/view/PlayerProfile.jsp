<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="header">
    <BR>
    <%@include file="PlayerMenu.jsp" %>

  </tiles:putAttribute>
  <tiles:putAttribute name="body">



    <div class="body">
      <h1>Player&Profile Operations</h1>


    </div>



  </tiles:putAttribute>
</tiles:insertDefinition>