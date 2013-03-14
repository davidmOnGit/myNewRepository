<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<form action="authenticationResponse.jsp" method="get">
<label>nutzer</label>
<input type="text" name="nutzer"></input>
<br/>
<label>passwort</label>
<input type="password" name="passwort"/>
<input type="submit" value="anmelden"/>
</form>
</body>
</html>