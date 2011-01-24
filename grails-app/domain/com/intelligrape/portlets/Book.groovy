package com.intelligrape.portlets

class Book {

	String name
	Integer price
	Author author

	static belongsTo = Author

    static constraints = {
    }

	public String toString() {
		name
	}
}
