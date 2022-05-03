<html>
<style>
body
{
background-color: #222831;
}
h3
{
color: rgb(0,0,102);
}
input
{
  border-color: rgb(0,0,102);
  color: #393e46;
}
div
{
background-color: white;
color: #f96d00;
font-family: lato;
font-size:120%;
height:80%;
width:20%;
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
            padding: 10px 10px;
            margin: 20px 20px;
            cursor: pointer;
            top: 75%;
}

</style>

<div>
<form action="stulogin.jsp">
<h3>Student Registration Portal</h3>
<b><I>If you are already registered,</I></b>
<input type="submit" value="Login">
</form>
<form action="getss">
<input type="text" name="name" placeholder="Name" required><br><br>
<input type="text" name="rollno" placeholder="RollNo" required><br><br>
<input type="text" name="year" placeholder="Year of Study" required><br><br>
<input type="text" name="dept" placeholder="Field of study" required><br><br>
<input type="email" name="email" placeholder="Email ID" required><br><br>
<input type="text" name="contactno" placeholder="Contact No" required><br><br>
<input type="text" name="pass" placeholder="Password" required><br>
<input type="submit" value="Sign Up">
</form>
</div>
</html>