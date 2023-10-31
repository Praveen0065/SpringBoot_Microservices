<html>
	<head>
		<title>WELCOME TO APP</title>
	</head>
	<body>
		<h2>WELCOME TO APPLICATION! </h2>
		<p>
			Id  : ${objec.userId} <br/>
			Name: ${objec.userName} <br/>
			Role : ${objec.userRole} <br/>
			Full Data : ${objec}
		</p>
           ----------------------------------------- </br>
           Full Data ${ListObjec} <br/>
           ----------------------------------------- </br>

           <table border="1">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>ROLE</th>             
            </tr>
            <c:forEach var ="ob" items="${ListObjec}">
                <tr>
                    <td>${ob.userId}</td>
                    <td>${ob.userName}</td>
                    <td>${ob.userRole}</td>
                </tr>
                
            </c:forEach>


           </table>

		
	</body>
</html>