<%@page import="java.util.ArrayList"%>
<font color="green"> <%
 	ArrayList<Integer> al = (ArrayList<Integer>) request.getAttribute("data");
 %><table border="3">
		<%
			for (int ss : al) {
		%>
		<tr>
			<td>
				<%
					out.println(ss);
				%>
			</td>
		</tr>
		<%
			}
		%>
	</table></font>
