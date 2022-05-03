
<html>
<style>
body
{
background-color:#5c5470;
}
h2
{
color: rgb(0,0,102);
}
input
{
  border-color: rgb(0,0,102);
  color: red;
}
div
{
background-color: white;
color:#c51350;
font-family: lato;
font-size:120%;
resize: both
line-height: 1.5;
  display: inline-block;
  vertical-align: middle;
  border-width: 2px;
  border-color: rgb(0,0,102);
  padding:2%;
  position: absolute;
  transform:translate(0%,0%);
  top:5%;
  left:40%;
  

}
input[type=submit] {
            background-color:orange;
            border: none;
            text-decoration: none;
            color: rgb(0,0,102);
            padding: 15px 15px;
            margin: 20px 20px;
            cursor: pointer;
            top: 75%;
}

</style>
<%
if(session.getAttribute("id")==null)
	response.sendRedirect("recsignup.jsp");
else
	response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
	
%>
<a href="frontpage.html"><img align="left" src="https://th.bing.com/th/id/R.1e41d3d4dd2a766424f54a0a4273f227?rik=Iq%2f0ZB4JikT%2bmw&riu=http%3a%2f%2fphotos.gograph.com%2fthumbs%2fCSP%2fCSP320%2fk3200969.jpg&ehk=kasQi8Eh4KvE%2bLU9AotsHIFwnY9mKgkHUknVRY8TRHg%3d&risl=&pid=ImgRaw&r=0"></a>
	<a href="logout"><img align="right" src="https://www.kindpng.com/picc/m/19-194789_logout-button-png-transparent-png.png">
	</a><br><br><br><br>

<h3 style="color: white">Failed to update the job details!Pls check the details you have entered!</h3>
<div>
<form action="recsignup.html">
<input type="submit" value="logout">
</form>
<form action="Jobpostingrecruiter.jsp">
<input type="submit" value="POST A JOB">
</form>
<form action="Updatejob.jsp">
<input type="submit" value="UPDATE A JOB DETAILS">
</form>
<form action="Deletejob.jsp">
<input type="submit" value="DELETE POSTED JOB">
</form>
</div>
</html>