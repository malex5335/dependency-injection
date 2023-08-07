package di_0

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bookStore = BookStore("Franz", "Kafka")
            println("Books: ${bookStore.getBooks()}")
            println("Customers: ${bookStore.getCustomers()}")
        }
    }
}