<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="jspf/cabecalho.jspf" %>
    
    <c:if test="${idade>0}">
        <p>Voce tem ${idade} anos!</p>
    </c:if>

<c:forEach items="${numeros}" var="numero">    
    <li>${numero}</li>   
</c:forEach>

<%@include file="jspf/rodape.jspf" %>

