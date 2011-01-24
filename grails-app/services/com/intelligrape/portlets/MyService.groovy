package com.intelligrape.portlets

class MyService {

	static transactional = true

	String method1() {
		println "This is a test method being used from the portlet"
		return "Something"
	}

	void updateAuthor(Long authorId, String newAuthorName) {
		Author.withNewSession {
			Author author = Author.get(authorId)
			author.name = newAuthorName
			author.save()
		}
	}

	void updateBook(Long bookId, String newBookName) {
		Book.withNewSession {
			Book book = Book.get(bookId)
			book.name = newBookName
			book.save()
		}
	}
}
