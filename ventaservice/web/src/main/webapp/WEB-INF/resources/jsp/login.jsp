<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>My JSP 'MyJsp.jsp' starting page</title>  
  </head>  
    
  <body>  
    <h1>${message}</h1>  
    <img alt="" src="/static/img/1.jpg">  
    <form:form action="/login" commandName="user" method="post">  
        Login：<form:input path="username"/> <form:errors path="username" cssClass="error"/> <br/>  
        Pass：<form:password path="password"/> <form:errors path="password" cssClass="error" /> <br/>  
        <form:button name="button">submit</form:button>  
    </form:form>  
  </body>  
</html>  