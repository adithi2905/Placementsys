<%@ page import="java.util.List, com.daorecruiterpost.Postingjobs,com.entitylayer.Post,com.servicelayer.stulogout" %>
<html>
<style>
h1
{ 
  color:white;
  text-align: center;

}
input[type=submit] {
            background-color: red;
            border: none;
            text-decoration: none;
            color: white;
            padding: 20px 20px;
            margin: 20px 20px;
            cursor: pointer;
            float:right;
            top: 75%;
}
img
{
width: 2%;
radius: 2%
length: 5%;

}


h2
{
color: rgb(0,0,102);
text-align:center;

}	
body
{
background-color: rgb(0,0,102);
color:red;
font-family: lato;
font-size:100%;
line-height: 1.5;
 
  
}
</style>
<body>
<h3>Job applied successfully</h3>
<a href="frontpage.html"><img align="left" src="https://th.bing.com/th/id/R.1e41d3d4dd2a766424f54a0a4273f227?rik=Iq%2f0ZB4JikT%2bmw&riu=http%3a%2f%2fphotos.gograph.com%2fthumbs%2fCSP%2fCSP320%2fk3200969.jpg&ehk=kasQi8Eh4KvE%2bLU9AotsHIFwnY9mKgkHUknVRY8TRHg%3d&risl=&pid=ImgRaw&r=0"></a>
	<a href="stulog"><img align="right" src="https://www.kindpng.com/picc/m/19-194789_logout-button-png-transparent-png.png">
	</a><br><br><br><br>
<%! int id=0; %>
<%
if(session.getAttribute("rollno")==null)
	response.sendRedirect("stulogin.jsp");
else{
	
	response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
List<Post>post=Postingjobs.getdata();

for(Post p:post)
{
	
	out.print("<span><b>Company</b>:  "+p.getCompany()+"<br><b>Job Title:</b>  "+p.getTitle()+"<br><b>Location:</b>  "+p.getLocation()+"<br><b>Applicable Depts:</b>  "+p.getDept()+"<br><b>Presentation Date:</b>  "+p.getPresd()+"<br><b>Online Test Date:</b>  "+p.getOnd()+"<br><b>Interview Date:</b>  "+p.getInd()+"<br><br>"+"</span>");
	
}
out.print("<section><form action='Applyforstudents.jsp'><input type='submit' value='Apply'></form>");
out.print("<form action='appliedjobdisplayforstudents.jsp'><input type='submit' value='View Applied Jobs'></form></section>");

}
%>
</body>	
</html>
