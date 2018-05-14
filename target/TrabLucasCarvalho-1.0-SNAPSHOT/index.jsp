<%-- 
    Document   : index
    Created on : 07/05/2018, 02:31:37
    Author     : Lucas Carvalho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="selects" uri="WEB-INF/selects.tld"%>
<%@page import ="java.util.*"%>
<%@page import ="javax.servlet.*"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="recupDadosServlet" method ="POST"> 
            <div>
                <label for="nome">Entre com a Empresa e ano do Orçamento:</label> 
            </div>
                
            <div  >
                <label for="nome">Empresa:</label> 
                        <select name="empresa">
                            <option value=""></option>
                            <option value="teste" ${ param.empresa eq "teste" ? "selected": "" } >teste</option>
                        </select>${ msgErroEmp}<br>
            </div>
            <div >
                <label for="nome">Ano do Orçamento</label>
                        <select name="anoOrcamento">
                            <option value=""></option>
                            <option value="2018" ${ param.anoOrcamento eq "2018" ? "selected": "" } >2018</option>
                        </select>${ msgErroAno}<br>
                <label for="msgOrc">${msgSemResu}</label>
            </div>
            
           <button class="btn btn-primary" type="submit">Enviar</button> 
            
        </form>
       
            <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js" ></script>
    </body>
</html>
