<%-- 
    Document   : response
    Created on : May 4, 2012, 2:29:56 PM
    Author     : Niroshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="modelBean" scope="session" class="com.mycompany.myschoo_lmini_niroshan.StudentDetails" />
    </head>
    <body>
        <h1>Marks View</h1>
        <table><tr><th>Student Name:</th><td> <jsp:getProperty name="modelBean" property="stuName" /></td></tr>
            <tr><th>Grade:</th><td> <jsp:getProperty name="modelBean" property="grade" /></td></tr>
            <tr><th>Subject:</th><td> <jsp:getProperty name="modelBean" property="subject" /></td></tr>
            <tr><th>Marks:</th><td> <jsp:getProperty name="modelBean" property="marks" /> </td></tr>
        </table>
    </body>
</html>
