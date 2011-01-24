<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<div>
<h1>View Authors</h1>
Entering a value in this form will change the name of the author with id entered
<form action="${portletResponse.createActionURL()}" method="post">
	Author id : <input type="text" name="authorId"/><br/>
	Author name : <input type="text" name="authorName"/><br/>
    <input type="submit" value="Change author name"/>
</form>
<ul>
	<g:each in="${authors}" var="author">
		<li>${author.id} - ${author.name} - ${author.books.join(',')}</li>
	</g:each>
</ul>
</div>
