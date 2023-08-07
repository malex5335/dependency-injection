package di_2

import Customer

class Contracts {
    fun getAllCustomers(): List<Customer> {
        val customers = mutableListOf<Customer>()
        customers.add(Customer("Max", "Mustermann"))
        customers.add(Customer("Erika", "Mustermann"))
        return customers
    }
}
