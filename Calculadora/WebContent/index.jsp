
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
<h1>Calculadora do Ale no h1
</h1>

<form action="Operation">
  First number:<br>
  <input type="text" name="firstnumber" value="">
  <br>
  Last number:<br>
  <input type="text" name="lastnumber" value="">
  <br><br>
   <input type="radio" name="Operacao" value="soma" checked> Soma<br>
  <input type="radio" name="Operacao" value="subtracao"> Subtracao<br>
  <input type="radio" name="Operacao" value="divisao"> Divisao<br>  
  <input type="radio" name="Operacao" value="multiplicacao"> Multiplicacao<br> 
  <input type="submit" value="Operar">
</form> 

<h1>More Three radio button</h1>
<form action="String_operation">
 <input type="text" name="textfield_name" value=""> <br>
<input type="radio" name="st_front" value="lowercase" checked> Minusculo<br>
<input type="radio" name="st_front" value="uppercase"> Maiusculo<br>
<input type="radio" name="st_front" value="backwards"> Backwards<br>
<input type="submit" value="Stringoperar ">
</form>

<h1>Click here to enter a system evaluate a student</h1>
<input type="submit" value="gradestudent">


</body>
</html>