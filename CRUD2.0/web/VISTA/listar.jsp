<%-- 
    Document   : listar
    Created on : 14/05/2020, 07:06:23 PM
    Author     : EL LOL
--%>

<%@page import="modelodao.PersonaDAO"%>
<%@page import="modelo.Persona"%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>personas</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>DNI</th>
                        <th>NOMBRES</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                
         PersonaDAO dao=new PersonaDAO();
         List<Persona>list=dao.listar();
         Iterator<Persona>iter=list.iterator();
         Persona per= null; 
            while (iter.hasNext()) {
            per=iter.next();
       
                %>
                
                
                <tbody>
                    <tr>
                        <td> <%=per.getId()%> </td>
                        <td> <%=per.getDni()%></td>
                        <td> <%=per.getNombre()%></td>
                        <td> 
                            <a> Editar</a>
                            <a>Remove </a>
                        </td>
                    </tr>
                </tbody>
            </table>

        </div>
    </body>
</html>
