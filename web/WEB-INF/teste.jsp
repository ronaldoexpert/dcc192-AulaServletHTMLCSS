<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="jspf/cabecalho.jspf" %>
    
    <c:if test="${idade>0}">
        <p>Voce tem ${idade} anos!</p>
    </c:if>

<%@include file="jspf/rodape.jspf" %>

