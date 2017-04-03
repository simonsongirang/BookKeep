<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Book Records</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Category</th><th>Date</th><th>Debit</th><th>Credit</th><th>Payment Type</th><th>Payee</th><th>Payer</th><th>Note</th></tr>  
   <c:forEach var="record" items="${list}">   
   <tr>  
   <td>${record.id}</td>  
   <td>${record.name}</td>
   <td>${record.category}</td>
   <td>${record.date}</td>
   <td>${record.debit}</td>
   <td>${record.credit}</td>
   <td>${record.paymentType}</td>
   <td>${record.payee}</td>
   <td>${record.payer}</td>
   <td>${record.note}</td>    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  