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
line-height: 1.5;
  display: inline-block;
  vertical-align: middle;
  border-width: 2px;
  border-color: rgb(0,0,102);
  padding:2%;
  position: absolute;
  transform:translate(0%,0%);
  top: 20%;
  left: 10%;
    
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
<section><a href="frontpage.html"><img align="left" src="https://th.bing.com/th/id/R.1e41d3d4dd2a766424f54a0a4273f227?rik=Iq%2f0ZB4JikT%2bmw&riu=http%3a%2f%2fphotos.gograph.com%2fthumbs%2fCSP%2fCSP320%2fk3200969.jpg&ehk=kasQi8Eh4KvE%2bLU9AotsHIFwnY9mKgkHUknVRY8TRHg%3d&risl=&pid=ImgRaw&r=0"></a>
<a href="logout"><img align="right" src="https://www.kindpng.com/picc/m/19-194789_logout-button-png-transparent-png.png">
</a>
</section>
<div>

<%@page import="java.util.*,com.entitylayer.Post,com.daorecruiterpost.viewjobs" %>
<%
int sess=0;
if(session.getAttribute("id")==null)
	response.sendRedirect("reclogin.jsp");
//System.out.print((int)session.getAttribute("id"));
else{
	response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
sess=(int)session.getAttribute("id");
viewjobs v=new viewjobs();
List<Post>post=v.Service(sess);

if(post.size()<=0)
{
	response.sendRedirect("crudredirection.jsp");
	
}
else{
for(int i=0;i<post.size();i++)
{
	int jobid=post.get(i).getJobid();
	String title=post.get(i).getTitle();
	String company=post.get(i).getCompany();
	String location=post.get(i).getLocation();
	String type=post.get(i).getType();
	String dept=post.get(i).getDept();
	String ind=post.get(i).getInd();
	String ond=post.get(i).getOnd();
	String presd=post.get(i).getPresd();
	String interviewdate=post.get(i).getInd();
	out.print("<table><tr><th>JobId</th><th>Title</th><th>Location</th><th>Type</th><th>Department</th><th>Presentation Date</th><th>OnlineTestDate</th><th>Interview Date</th></tr><tr><td>"+jobid+"<td>"+title+"</td><td>"+location+"</td><td>"+type+"</td><td>"+dept+"</td><td>"+presd+"</td><td>"+ond+"</td><td>"+ind+"</td></tr></table>");
	out.print("<br>");
}
out.print("<form action='upde.jsp'><input type='submit' value='UPDATE or DELETE JOB'></form>");
out.print("<form action='Viewapplicants.jsp'><input type='submit' value='VIEW APPLICATIONS'></form>");

}
}
%>
</div>
</body>
</html>