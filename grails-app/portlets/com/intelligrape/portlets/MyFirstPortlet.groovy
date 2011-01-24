package com.intelligrape.portlets



import javax.portlet.*

class MyFirstPortlet {

	def myService

	def title = 'Author Portlet'
	def description = '''
This is a portlel that displays list of authors.
'''
	def displayName = 'Author list'
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
		myService.updateAuthor(pr.getParameter('authorId').toLong(), pr.getParameter('authorName'))
	}

	def renderView = {
		println "This is from my first portlet render - view"
		List<Author> authors = Author.list()
		String someValue = myService.method1()
		//TODO Define render phase. Return the map of the variables bound to the view
		['mykey': someValue, authors: authors]
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
