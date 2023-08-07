package di_1

import Book
import Customer
import Owner

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bookStore = BookStore(
                Owner("Franz", "Kafka"),
                retrieveBooks_manual(),
                retrieveCustomers_manual()
            )
            println("Books: ${bookStore.getBooks()}")
            println("Customers: ${bookStore.getCustomers()}")
        }

        fun retrieveBooks_manual(): List<Book> {
            val books = mutableListOf<Book>()
            books.add(Book("The Trial", "Franz Kafka"))
            books.add(Book("The Castle", "Franz Kafka"))
            books.add(Book("The Hunger Artist", "Franz Kafka"))
            return books
        }

        fun retrieveCustomers_manual(): List<Customer> {
            val customers = mutableListOf<Customer>()
            customers.add(Customer("Max", "Mustermann"))
            customers.add(Customer("Erika", "Mustermann"))
            return customers
        }
    }
}