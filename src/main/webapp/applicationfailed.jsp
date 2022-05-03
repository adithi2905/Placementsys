<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
<%
if(session.getAttribute("rollno")==null)
	response.sendRedirect("stulogin.jsp"); 
else
response.setHeader("Cache-control","no-cache,no-store,must-revalidate");

%>
<h3>Pls check the job id entered and try again!</h3>
<div>

<form action="appliedjobdisplayforstudents.jsp">
<input type="text" name="jid" placeholder="Enter Job Id">
<input type="submit" value="Submit">
</form>

</div>
</html>