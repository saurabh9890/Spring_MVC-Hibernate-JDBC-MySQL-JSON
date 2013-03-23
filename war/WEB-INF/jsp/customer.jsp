<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Spring MVC Hello World Example</h1>
 
	<h2>${msg}</h2>
	
<table>
<thead>
  <tr>
   <th>ID</th>
   <th>Name</th>
   <th>Age</th>
  </tr>
</thead>

 <tbody>
 <c:forEach items="${msg}" var="customer1">
   
  <tr>
   <td><c:out value="${customer1.id}" /></td>
   <td><c:out value="${customer1.name}" /></td>
   <td><c:out value="${customer1.age}" /></td>
  
  </tr>
 </c:forEach>
 </tbody>
</table>
 
</body>
</html>
