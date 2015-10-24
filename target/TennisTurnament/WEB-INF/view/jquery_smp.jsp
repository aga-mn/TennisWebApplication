
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="body">
    <%--http://stackoverflow.com/questions/14590598/passing-json-data-from-servlet-to-jsp-to-js-file--%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
      <TITLE>Crunchify - Spring MVC Example with AJAX call</TITLE>


      <script type="text/javascript"
              src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
      <script type="text/javascript">
        function crunchifyAjax() {
          $.ajax({
            url : 'ajaxtest.html',
            success : function(data) {
              $('#result').html(data);
            }
          });
        }
      </script>


      $('#autocomplete').autocomplete({
      serviceUrl: '/autocomplete/countries',
      onSelect: function (suggestion) {
      alert('You selected: ' + suggestion.value + ', ' + suggestion.data);
      }
      });

      <script type="text/javascript">
        var intervalId = 0;
        intervalId = setInterval(crunchifyAjax, 3000);
      </script>
    </head>

    <body>
    <div align="center">
      <br> <br> ${message} <br> <br>
      <div id="result"></div>
      <br>

    </div>
    </body>
    </html>


  </tiles:putAttribute>
</tiles:insertDefinition>



