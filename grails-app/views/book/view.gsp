<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<div>
<h1>View Books</h1>
	Entering a value in this form will change the name of the book with id entered
	<form action="${portletResponse.createActionURL()}" method="post">
	Book id : <input type="text" name="bookId"/><br/>
	Book name : <input type="text" name="bookName"/><br/>
    <input type="submit" value="Change book name"/>
</form>
	<h2>Displaying list of all Books:</h2>
<ul>
	<g:each in="${books}" var="book">
		<li>${book.name} - ${book.price} - ${book.author}</li>
	</g:each>
</ul>
</div>
