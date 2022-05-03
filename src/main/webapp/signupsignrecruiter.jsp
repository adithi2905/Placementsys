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

</style>

<div>
<p style="color:rgb(0,0,102)"><b>Successfully registered!Pls log into your account!</b></p>
<form action="getr">
<h2>Recruiter Login portal</h2>
<input type="text" name="id" placeholder="Registered Id"><br><br>
<input type="text" name="password" placeholder="Password"><br><br>
<input type="submit"><br>
</form>
</div>
</html>