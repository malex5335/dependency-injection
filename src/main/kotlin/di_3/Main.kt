package di_3

import Owner

class Main {
    fun main() {
        val bookStore = BookStore(
            Owner("Franz", "Kafka"),
            KafkaBookshelf(),
            KafkaContracts()
        )
        println(bookStore.getBooks())
        println(bookStore.getCustomers())
    }
}