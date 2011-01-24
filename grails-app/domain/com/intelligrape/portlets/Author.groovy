package com.intelligrape.portlets

class Author {

	String name;
	static hasMany = [books: Book]

	static constraints = {
	}

	static mapping = {
		books lazy:false
	}

	public String toString() {
		name
	}
}
