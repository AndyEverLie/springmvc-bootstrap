<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>Greeting</h3>
<c:set var="greeting"><%=request.getAttribute("greeting")%></c:set>
<c:if test="${greeting!=''}">
	<p>${greeting}</p>
</c:if>