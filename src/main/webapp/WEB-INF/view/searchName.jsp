<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 20.04.15
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java"%>
<%@ page import="net.sf.json.JSONArray,net.sf.json.JSONObject"%>
<%
  String name = request.getParameter("name");
  JSONArray jsonArr = new JSONArray();

  JSONObject json=new JSONObject();

  json.put("name","abc");
  json.put("value","abc101");
  jsonArr.add(json);

  json.put("name","bcd");
  json.put("value","bcd201");
  jsonArr.add(json);

  json.put("name","cde");
  json.put("value","cde301");
  jsonArr.add(json);

  json.put("name","efg");
  json.put("value","efg401");
  jsonArr.add(json);

  out.println(jsonArr);
%>