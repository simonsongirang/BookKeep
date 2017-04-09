<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
.main  {
	align-self: center
}
</style>

</head>
<body>
<article class=main>
	<h1>Add Debit Transaction</h1>	
	<form:form method="POST" action="debitsave">
		<table>
			<tr>
				<th>Name</th>
				<th>Category</th>
				<th>Date</th>
				<th>Debit</th>
				<th>Payment Type</th>
				<th>Payee</th>
				<th>Note</th>
			</tr>
			<tr>
				<td><form:input path="name"/></td>
				<td><form:input path="category"/></td>
				<td><form:input path="date"/></td>
				<td><form:input path="debit"/></td>
				<td><form:input path="paymentType"/></td>
				<td><form:input path="payee"/></td>
				<td><form:input path="note"/></td>
				<td><input type="submit" value="Save Debit Transaction"/></td>    
			</tr>
		</table>
	</form:form>
</article>	
	
<article class=main>
	<h1>Add Credit Transaction</h1>	
	<form:form method="POST" action="creditsave">
		<table>
			<tr>
				<th>Name</th>
				<th>Category</th>
				<th>Date</th>
				<th>Credit</th>
				<th>Payment Type</th>
				<th>Payer</th>
				<th>Note</th>
			</tr>
			<tr>
				<td><form:input path="name"/></td>
				<td><form:input path="category"/></td>
				<td><form:input path="date"/></td>
				<td><form:input path="credit"/></td>
				<td><form:input path="paymentType"/></td>
				<td><form:input path="payer"/></td>
				<td><form:input path="note"/></td>
				<td><input type="submit" value="Save Credit Transaction" /></td>    
			</tr>
		</table>
	</form:form>
</article>	

</body>
</html>