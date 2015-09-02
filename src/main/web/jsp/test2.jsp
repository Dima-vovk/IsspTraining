<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
			xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">>
<jsp:directive.page />
<html>
<head>
</head>
<body>
	<jsp:scriptlet>if (request.getParameter("title") != null) {
				String s = request.getParameter("title");
				for (int i = 0; i < s.length(); i++ ){
	out.println(s.substring(i, i+1));</jsp:scriptlet>
	<br></br>
	<jsp:scriptlet>}
			}
			</jsp:scriptlet>
</body>
</jsp:root>