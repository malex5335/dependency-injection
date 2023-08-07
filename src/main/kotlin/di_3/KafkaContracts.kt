package di_3

import Customer

class KafkaContracts: Contracts {
    override fun getAllCustomers(): List<Customer> {
        return listOf(
            Customer("Max", "Mustermann"),
            Customer("Erika", "Mustermann")
        )
    }
}