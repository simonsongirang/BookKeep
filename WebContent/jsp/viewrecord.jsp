<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th></tr>  
   <c:forEach var="record" items="${list}">   
   <tr>  
   <td>${record.id}</td>  
   <td>${record.name}</td>    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  