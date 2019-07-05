



<form action="QualServlet">
	qual name : <input type="text" name="Qualname" /> 
	
	<input type="hidden"name="skillname1" value="<%=request.getAttribute("skill") %>"/>
	
		 <input type="submit" value="next..." />
</form>