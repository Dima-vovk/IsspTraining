<%@page import="ua.ComparatorNameDown"%>
<%@page import="ua.ComparatorNameUP"%>
<%@page import="ua.ComparatorCashDown"%>
<%@page import="ua.ComparatorCashUP"%>
<%@page import="ua.ComparatorNumberDown"%>
<%@page import="ua.ComparatorNumber"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Arrays"%>
<%@page import="ua.Client"%>
<html>
<head>
</head>
<body>
	<%
		if (request.getParameter("sort") != null && request.getParameter("order") != null){
			Client[] array = {
								new Client(1, 2500.68, "Valera"),
								new Client(4, 5476.23, "Ivan"),
								new Client(3, 12745.13, "Oleg")};
	%>
	<a>Sort number: </a>
	<%
	for( int i = 0; i < array.length; i++){
		out.println(array[i] + "\t");}
	%>
	<%
	if (request.getParameter("sort").equals("number") && request.getParameter("order").equals("up") ){
		out.println("Sort Number UP:");
		Arrays.sort(array, new ComparatorNumber());
		for( int i = 0; i < array.length; i++)
		out.println(array[i] + "\t");}
	if (request.getParameter("sort").equals("number") && request.getParameter("order").equals("down") ){
		out.println("Sort Number DOWN:");
		Arrays.sort(array, new ComparatorNumberDown());
		for( int i = 0; i < array.length; i++)
		out.println(array[i] + "\t");
	}	
	if (request.getParameter("sort").equals("cash") && request.getParameter("order").equals("up") ){
		out.println("Sort Cash Up:");
		Arrays.sort(array, new ComparatorCashUP());
		for( int i = 0; i < array.length; i++)
		out.println(array[i] + "\t");
	}	
	if (request.getParameter("sort").equals("cash") && request.getParameter("order").equals("down") ){
		out.println("Sort Cash DOWN:");
		Arrays.sort(array, new ComparatorCashDown());
		for( int i = 0; i < array.length; i++)
		out.println(array[i] + "\t");
	}
	if (request.getParameter("sort").equals("name") && request.getParameter("order").equals("up") ){
		out.println("Sort Name UP:");
		Arrays.sort(array, new ComparatorNameUP());
		for( int i = 0; i < array.length; i++)
		out.println(array[i] + "\t");
	}
	if (request.getParameter("sort").equals("name") && request.getParameter("order").equals("down") ){
		out.println("Sort Name DOWN:");
		Arrays.sort(array, new ComparatorNameDown());
		for( int i = 0; i < array.length; i++)
		out.println(array[i] + "\t");
	}
	}
	%>
</body>
</html>