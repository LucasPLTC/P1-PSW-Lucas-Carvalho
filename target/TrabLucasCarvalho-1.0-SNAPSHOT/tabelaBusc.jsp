<%-- 
    Document   : tabelaBusc
    Created on : 16/04/2018, 20:26:45
    Author     : Lucas Carvalho
--%>
<%@page import="Control.ContaTabTag"%>
<%@ taglib prefix="selects" uri="WEB-INF/selects.tld"%>
<%@page import="Entidades.ContaOrcamento"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import ="java.util.*"%>
<%@page import ="javax.servlet.*"%>
<%@page import ="Entidades.Conta "%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style> 
            table{border-collapse: collapse;}
            table,td,th{border:1px solid black;padding:0px;font-family:verdana;font-size:14px;}
        </style>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
        
            <table class="table">
              <thead class="thead-dark ">
                <tr>
                    <th scope="col">Orçamento de ${param.anoOrcamento}</th>
                    <th scope="col">Orçado</th>
                    <th scope="col">Realizado</th>
                    <th scope="col">Comprometido</th>
                    <th scope="col">Disponível</th>
                    
                </tr>
              </thead>
              <tbody>
                  <c:forEach var="conta" items="${ContaImp}">
                      <selects:ContaTabTag contaPR="${conta}"/><br>
                  </c:forEach>            
                    
              </tbody>
              
            </table>
              
              <form action ="alteraContasServlet" method ="POST" >
                  <div class="input-group input-group-sm mb-3">
                       <input name="codconta" class="form-control" placeholder="Digite o codigo da conta">
                       <input name="valoralt" class="form-control" placeholder="Digite o valor desejado">
                  </div>
            
                 
                      <button class="btn btn-outline-primary btn-sm" type="submit">Alterar Valor de Conta</button>${msgAltera}<br>
              </form>
              
              <form action="index.jsp" >
                  <button class="btn btn-success btn-sm" type="submit">Voltar</button>
              </form>
              
        <script src="js/jquery-3.2.1.slim.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>