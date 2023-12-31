package di_3

import Owner

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bookStore = BookStore(
                Owner("Franz", "Kafka"),
                KafkaBookshelf(),
                KafkaContracts()
            )
            println("Books: ${bookStore.getBooks()}")
            println("Customers: ${bookStore.getCustomers()}")
        }
    }
}