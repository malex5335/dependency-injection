package di_1

import Book
import Customer
import Owner

class BookStore(val owner: Owner, private val books: List<Book>, private val customers: List<Customer>) {

    fun getBooks(): List<Book> {
        return books
    }

    fun getCustomers(): List<Customer> {
        return customers
    }
}