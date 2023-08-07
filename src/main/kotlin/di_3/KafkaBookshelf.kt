package di_3

import Book

class KafkaBookshelf: Bookshelf {
    override fun getAllBooks(): List<Book> {
        return listOf(
            Book("The Trial", "Franz Kafka"),
            Book("The Castle", "Franz Kafka"),
            Book("Amerika", "Franz Kafka")
        )
    }
}