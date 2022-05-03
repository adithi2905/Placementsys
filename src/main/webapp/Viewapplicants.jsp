<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<style>
body
{
background-color: orange;
}
input
{
  border-color: rgb(0,0,102);
  color: red;
}
div
{
background-color: white;
color: red;
font-family: lato;
font-size:120%;
height:20%;
width:20%;
line-height: 1.5;
  display: inline-block;
  vertical-align: middle;
  border-width: 2px;
  border-color: rgb(0,0,102);
  padding:2%;
  position: absolute;
  transform:translate(0%,0%);
  top:20%;
  left:40%;
  

}
input[type=submit] {
            background-color:rgb(0,0,102);
            border: none;
            text-decoration: none;
            color: white;
            padding: 20px 20px;
            margin: 20px 20px;
            cursor: pointer;
            top: 75%;
}

img
{
width: 2%;
radius: 2%
length: 5%;
}


</style>
<a href="frontpage.html"><img align="left" src="https://th.bing.com/th/id/R.1e41d3d4dd2a766424f54a0a4273f227?rik=Iq%2f0ZB4JikT%2bmw&riu=http%3a%2f%2fphotos.gograph.com%2fthumbs%2fCSP%2fCSP320%2fk3200969.jpg&ehk=kasQi8Eh4KvE%2bLU9AotsHIFwnY9mKgkHUknVRY8TRHg%3d&risl=&pid=ImgRaw&r=0"></a>
	<a href="logout"><img align="right" src="https://www.kindpng.com/picc/m/19-194789_logout-button-png-transparent-png.png">
	</a><br><br><br><br>

<%@page import="java.util.List,com.daorecruiterpost.viewjobs,com.entitylayer.Post,com.daolayerStudentPost.Viewappliedjobs,java.sql.*" %>
<%
if(session.getAttribute("id")==null)
	response.sendRedirect("recsignup.jsp");
else
{
HttpSession sess=request.getSession(false);
		int id=(int)sess.getAttribute("id");
		viewjobs v=new viewjobs();
		List<Post>post=v.Service(id);
		for(int i=0;i<post.size();i++)
		{
			int jid=post.get(i).getJobid();
			ResultSet rs=Viewappliedjobs.viewapplications(jid);
			while(rs.next())
			{
				String rollno=rs.getString("rollno");
				String name=rs.getString("name");
				String dept=rs.getString("dept");
				int year=rs.getInt("year");
				out.print("<div><table><tr><th>RollNo</th><th>Name</th><th>Department</th><th>Year</th></tr><tr><td>"+ rollno +"</td><td>"+name+"</td><td>"+dept+"</td><td>"+ year +"</td></tr></table></div>");
			}
		}
}
		%>
</html>