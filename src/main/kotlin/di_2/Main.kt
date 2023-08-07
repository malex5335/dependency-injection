package di_2

import Book
import Customer
import Owner

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bookStore = BookStore(
                Owner("Franz", "Kafka"),
                Bookshelf(),
                Contracts()
            )
            println("Books: ${bookStore.getBooks()}")
            println("Customers: ${bookStore.getCustomers()}")
        }
    }
}