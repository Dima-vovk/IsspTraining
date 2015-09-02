<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page">
<html>
<head>
</head>
<body>
<jsp:scriptlet>
out.print(session.getLastAccessedTime()- session.getCreationTime());
</jsp:scriptlet>
</body>
</html>
</jsp:root>