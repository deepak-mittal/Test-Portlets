package com.intelligrape.portlets



import javax.portlet.*

class BookPortlet {

	def myService

	def title = 'Book Portlet'
	def description = '''
This is a sample portlel that lists all the books available.
'''
	def displayName = 'Book Portlet'
	def supports = ['text/html': ['view', 'edit', 'help']]

	// Liferay server specific configurations
	def liferay_display_category = 'MyCategory'

	def actionEdit = {
		//TODO Define action phase
		println "This is from my first portlet action - edit"
		portletResponse.setPortletMode(PortletMode.VIEW)
	}

	def renderEdit = {
		//TODO Define render phase. Return the map of the variables bound to the view
		println "This is from my first portlet render - edit"
		['mykey': 'myvalue']
	}

	def actionView = {
		//TODO Define action phase
		println "This is from my first portlet action - view"
		PortletRequest pr = portletRequest
		println pr.getParameterMap()
		println pr.getRemoteUser()
		pr.portletMode
		myService.updateBook(pr.getParameter('bookId').toLong(), pr.getParameter('bookName'))
	}

	def renderView = {
		println "This is from my first portlet render - view"
		def books = Book.list()
		println books
		books.each {book->
			book.author = Author.get(book.authorId)
		}
		//TODO Define render phase. Return the map of the variables bound to the view
		[books: books]
	}

	def actionHelp = {
		//TODO Define action phase
		println "This is from my first portlet action - help"
		portletResponse.setPortletMode(PortletMode.VIEW)
	}

	def renderHelp = {
		//TODO Define render phase. Return the map of the variables bound to the view
		println "This is from my first portlet render - help"
		['mykey': 'myvalue']
	}
}
