<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page">
<jsp:directive.page contentType="text/html"/>
<html>
<body>
	<jsp:scriptlet>
	if (request.getParameter("text") != null){
		
	}
	else
		response.sendError(500);
	</jsp:scriptlet>
</body>
</html>
</jsp:root>