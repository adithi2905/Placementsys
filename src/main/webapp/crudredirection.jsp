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
background-color: #c7b198;
color:#c51350;
font-family: lato;
font-size:120%;
resize: both;
line-height: 1.5;
  display: inline-block;
  vertical-align: middle;
  border-width: 2px;
  border-color: rgb(0,0,102);
  padding:2%;
  position: absolute;
  transform:translate(0%,0%);
  top:15%;
  left:40%;
    

}
img
{
width: 2%;
radius: 2%;
length: 15%;
align: right;
}

input[type=submit] {
            background-color:none;
            border: none;
            text-decoration: none;
            color: red;
            padding: 15px 15px;
            margin: 20px 20px;
            cursor: pointer;
            top: 75%;
}

</style>
<%@page import="java.util.*,com.entitylayer.Post,com.daorecruiterpost.viewjobs" %>
<%
int sess=0;
if(session.getAttribute("id")==null)
	response.sendRedirect("recsignup.jsp");
else
{
	response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
sess=(int)session.getAttribute("id");

viewjobs v=new viewjobs();
List<Post>post=v.Service(sess);}
%>
<section><a href="frontpage.html"><img align="left" src="https://th.bing.com/th/id/R.1e41d3d4dd2a766424f54a0a4273f227?rik=Iq%2f0ZB4JikT%2bmw&riu=http%3a%2f%2fphotos.gograph.com%2fthumbs%2fCSP%2fCSP320%2fk3200969.jpg&ehk=kasQi8Eh4KvE%2bLU9AotsHIFwnY9mKgkHUknVRY8TRHg%3d&risl=&pid=ImgRaw&r=0"></a>
<a href="logout"><img align="right" src="https://www.kindpng.com/picc/m/19-194789_logout-button-png-transparent-png.png">
</a>
</section>

<div>
<h3>No Jobs available!Pls create one</h3>


<form action="Jobpostingrecruiter.jsp">
<input type="submit" value="POST A JOB">
</form>

<form action="crudrecruiter.jsp">
<input type="submit" value="VIEW JOBS"><br><br>
</form>
</div>	