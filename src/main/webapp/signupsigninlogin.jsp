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
            background-color:rgb(0,0,102);
            border: none;
            text-decoration: none;
            color: white;
            padding: 20px 20px;
            margin: 20px 20px;
            cursor: pointer;
            top: 75%;
}

</style>
<div>
<h3>Successfully registered!Pls try logging in</h3>
<form action="gets">
<p>Student Login Portal</p>
<input type="text" name="rollno" placeholder="Roll no"><br><br>
<input type="text" name="pass" placeholder="Password"><br><br>
<input type="submit">
</form>
<p>If you are a student already registered,pls try logging in.</p>
</div>
</html>