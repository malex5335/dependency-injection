package di_2

import Book
import Customer
import Owner

class Main {
    fun main() {
        val bookStore = BookStore(
            Owner("Franz", "Kafka"),
            Bookshelf(),
            Contracts()
        )
        println(bookStore.getBooks())
        println(bookStore.getCustomers())
    }
}