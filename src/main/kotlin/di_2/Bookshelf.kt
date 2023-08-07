package di_2

import Book

class Bookshelf {
    fun getAllBooks(): List<Book> {
        val books = mutableListOf<Book>()
        books.add(Book("The Trial", "Franz Kafka"))
        books.add(Book("The Castle", "Franz Kafka"))
        books.add(Book("The Hunger Artist", "Franz Kafka"))
        return books
    }
}
