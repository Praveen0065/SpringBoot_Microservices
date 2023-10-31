<html>
	<head>
		<title>WELCOME TO APP</title>
	</head>
	<body>
		<h2> WELCOME TO USER REGISTRATION FORM  </h2>
         <pre>
        <form action="register" method="POST">
          ID    : <input type="text" name="empId"/>
          NAME  : <input type="text" name="empName"/>
          SAL   : <input type="text" name="empSal"/>         
          PWD   : <input type="password" name="empPwd"/>

          DEPT  : <select name="empDept">
                       <option value="DEV"> DEV </option>
                       <option value="QA"> QA </option>
                       <option value="BA"> BA </option>
                       </select>
          ADDR  : <textarea name="empAddr"></textarea>

          INPUT : <input type="submit" name="CREATE"/>
        </form>
        </pre>
	
	</body>
</html>
