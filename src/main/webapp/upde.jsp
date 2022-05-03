<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
resize: both
line-height: .
 1.5;
  display: inline-block;
  vertical-align: middle;
  border-width: 2px;
  border-color: rgb(0,0,102);
  padding:2%;
  position: absolute;
  transform:translate(0%,0%);
  top: 20%;
  left: 40%;
    
}
th{
border: 3px solid red;
border-collapse: collapse;}
td
{
border: 2px solid red;
}
img
{
width: 2%;
radius: 2%
length: 5%;
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

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>

<form action="update.jsp">
<input type="text" name="jobid" placeholder="Enter JobId">
<input type="submit" value="Update">
</form>
<form action="gjd">
<input type='text' name='jobid' placeholder='Enter JobId'>
<input type='submit' value='Delete'>
</form>
</div>
</body>
</html>