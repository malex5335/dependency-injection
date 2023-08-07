package di_3

import Book
import Customer
import Owner

class BookStore(val owner: Owner, private val bookshelf: Bookshelf, private val contracts: Contracts) {

    fun getBooks(): List<Book> {
        return bookshelf.getAllBooks()
    }

    fun getCustomers(): List<Customer> {
        return contracts.getAllCustomers()
    }
}