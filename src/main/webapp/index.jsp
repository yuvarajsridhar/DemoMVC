<html>
<body>
<script type="text/javascript"> 
function onlyletters(inputtext){
	 var letters = /^[A-Za-z]+$/;
	   if(inputtext.value.match(letters))
	     {
	      return true;
	     }
	   else {
		   alert('Please input alphabet characters only');
		   return false;
	   }
}
function onlynum(inputnum){
	 var numbers = /^[0-9]+$/;
     if(inputnum.value.match(numbers))
     {
     return true;
     }
     else
     {
     alert('Please input numeric characters only');
     return false;
     }
}
function validateform(){
	var name=document.myform.name.value;
	var lastname=document.myform.lname.value;
	var email= document.myform.email.value;
	var mnum=document.myform.mnum.value;
	var pass=document.myform.pass.value;
	var cpass=document.myform.cpass.value;
if(!onlyletters(name)){
	return false;
}else if(!onlyletters(lastname)){
	return false;
}else if(!onlynum(mnum)){
	return false;
}else if(mnum.length != 10){
	alert("lenth should be 10digit");
	return false;
}else if(pass.length<6){  
	  alert("Password must be at least 6 characters long.");  
	  return false;  
	  } else if(pass !== cpass){
		  alert("password and confirm password should be samwe");
		  return false;
	  } 
	  else{
		  return true;
	  }
}
</script>
<form name="myform" method="post"  onsubmit="return validateform()" action="register" >  
Name: <input type="text" name="name"required/> ${result}<br/>  
lastName: <input type="text" name="lname"required/> ${result1}<br/>  
EmailId:<input type="text" name="email" required/> <br/>
mobile num:<input type="text" name="mnum"required/> ${result2}<br>
Password: <input type="password" name="pass"required/>${result3}<br/> 
confirm password:<input type="text" name="cpass"required/><br/>  
<input type="submit" value="register"/>  
</form>  
</body>
</html>
