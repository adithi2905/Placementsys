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
height:50%;
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
            background-color: rgb(0,0,102);
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
radius: 2%;
length: 15%;
align: right;
}


</style>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); %>
<section><a href="frontpage.html"><img align="left" src="https://th.bing.com/th/id/R.1e41d3d4dd2a766424f54a0a4273f227?rik=Iq%2f0ZB4JikT%2bmw&riu=http%3a%2f%2fphotos.gograph.com%2fthumbs%2fCSP%2fCSP320%2fk3200969.jpg&ehk=kasQi8Eh4KvE%2bLU9AotsHIFwnY9mKgkHUknVRY8TRHg%3d&risl=&pid=ImgRaw&r=0"></a>
</section>

<div>
<br>
<form action="getr">
<h2>Recruiter Login portal</h2>
<input type="text" name="id" placeholder="Registered Id"><br><br>
<input type="text" name="password" placeholder="Password"><br><br>
<input type="submit"><br>

</form>

</div>
</html>