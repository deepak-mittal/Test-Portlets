import com.intelligrape.portlets.*

class BootStrap {

    def init = { servletContext ->

		Author author1 = new Author(name:"Author 1").save(flush:true)
		Author author2 = new Author(name:"Author 2").save(flush:true)
		Author author3 = new Author(name:"Author 3").save(flush:true)
		Book book = new Book(name: "Test Book 1", price: 12, author: author1).save(flush:true)
		Book book5 = new Book(name: "Test Book 6", price: 11, author: author1).save(flush:true)
		Book book1 = new Book(name: "Test Book 2", price: 142, author: author2).save(flush:true)
		Book book4 = new Book(name: "Test Book 5", price: 131, author: author2).save(flush:true)
		Book book2 = new Book(name: "Test Book 3", price: 114, author: author3).save(flush:true)
		Book book3 = new Book(name: "Test Book 4", price: 115, author: author3).save(flush:true)
		author1.addToBooks(book)
		author1.addToBooks(book5)
		author2.addToBooks(book1)
		author2.addToBooks(book4)
		author3.addToBooks(book2)
		author3.addToBooks(book3)
		author1.save(flush:true)
		author2.save(flush:true)
		author3.save(flush:true)
    }
    def destroy = {
    }
}
