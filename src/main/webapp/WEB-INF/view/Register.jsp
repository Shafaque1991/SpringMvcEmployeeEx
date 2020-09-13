<html>
<body>
<h3>Welcome to Register Page</h3>
<form action="save" method="post">
<pre>
ID:<input type="text" name="empId" id="empId"/><hr/>
Name:<input type="text" name="empName" id="empName"/><hr/>
Salary:<input type="text" name="empSal" id="empSal"/><hr/>
Address:<textarea rows="4" cols="4" name="addr"></textarea><hr/>
<select name="locs" multiple="multiple">
<option value="">-select-</option>
<option value="HYD">Hyderabad</option>
<option value="BIS">Bilaspur</option>
<option value="NGP">Nagpur</option>
<option value="PUN">Pune</option>
</select><hr/>
<input type="checkbox" name="langs" value="English"/> English
<input type="checkbox" name="langs" value="Hindi"/> Hindi
<input type="checkbox" name="langs" value="Telugu"/> Telugu
<input type="checkbox" name="langs" value="Marathi"/> Marathi
<input type="submit" value="Register"/>

</pre>
</form>
</body>
</html>