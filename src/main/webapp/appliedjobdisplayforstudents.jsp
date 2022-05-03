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
font-size:100%;
height:50%;
width:30%;
line-height: 1.5;
  display: inline-block;
  vertical-align: middle;
  border-width: 2px;
  border-color: rgb(0,0,102);
  padding:2%;
  position: absolute;
  transform:translate(0%,0%);
  top:20%;
  left:30%;
  

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
<%@page import="com.servicelayer.Util,com.entitylayer.Studentsignup,java.util.*,java.sql.*,com.daolayerStudentPost.Viewappliedjobs" %>

<div>
<table>
<tr><th>JobId</th><th>Title</th><th>Location</th><th>LPA</th><th>Department</th></tr>
<%
int rollno=(int)session.getAttribute("rollno");
ResultSet x=Viewappliedjobs.viewjobs(rollno);
String dept="",name="";
String title="",applidept="",location="";
String LPA="";
int jid;
	//System.out.print((x.first())&&(x.next()));
while(x.next()){
	title=x.getString("title");
	dept=x.getString("dept");
	location=x.getString("location");
	LPA=x.getString("LPA");
	jid=x.getInt("jid");
	out.print("<tr><td>"+jid+"<td>"+title+"</td><td>"+location+"</td><td>"+LPA+"</td><td>"+dept+"</td></tr>");
}
%>
</table>
</div>
</html>