

<font color="red"> <%
if (request.getAttribute("msg") !=null){

       out.print(request.getAttribute("msg"));
}

%>
</font>




<form action="LoginServlet">

	user name : <input type="text" name="uname" /> </br> password : <input
		type="text" name="pass" /> <input type="submit" value="submit.." />
</form>
