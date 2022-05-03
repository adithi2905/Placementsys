<html>
<style>
body
{
background-color:rgb(210,180,140);
}
h2
{
color: red;
}
input
{
  border-color: rgb(0,0,102);
  color: red;
}
div
{
background-color: rgb(188,143,143);
color: rgb(0,0,102);
font-family: lato;
font-size:110%;
height:170%;
width:30%;
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
            background-color: rgb(0,0,102);
            border: none;
            text-decoration: none;
            color: white;
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
<div>
<h2>Post a Job Opening
</h2><form action="getj">
<input type="text" name="jobid" placeholder="JOB ID"><br><br>
<input type="text" name="jobtitle" placeholder="Job Title"><br><br>
<input type="text" name="location" placeholder="Location"><br><br>
<b>Applicable Departments</b><br><br>
<input type="checkbox" name="dept" value="ECE">ECE<br><br>
<input type="checkbox" name="dept" value="IT">IT<br><br>
<input type="checkbox" name="dept" value="CSE">CSE<br><br>
<input type="checkbox" name="dept" value="Mech">MECH<br><br>
<input type="checkbox" name="dept" value="Civil">CIVIL<br><br>
<input type="checkbox" name="dept" value="Printing">PRITING<br><br>
<h4>Date of Presentation:</h4>
<input type="date" name="presentation" placeholder="Presentation date"><br><br>
<h4>Date of Online Test</h4>
<input type="date" name="ot" placeholder="Online test"><br><br>
<h4>Date of Interview</h4>
<input type="date" name="interview" placeholder="Interview Date"><br><br>
<h4>Job Type</h4>
<input type="radio" name="type" value="Internship">Internship<br><br>
<input type="radio" name="type" value="Full-time">Full-time<br><br>
<b>if Full-time,</b>
<input type="text" name="lpa" placeholder="LPA"><br>
<input type="submit">
</form>
</div>
</html>