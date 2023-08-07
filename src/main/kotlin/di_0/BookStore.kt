package di_0

import Book
import Customer
import Owner
import java.io.File
import java.sql.DriverManager

class BookStore(firstname: String, lastname: String) {

    val owner = Owner(firstname, lastname)

    fun getBooks(): List<Book> {
        if(owner.getLastName() == "Kafka")
            return retrieveBooks_manual()
        if(owner.getLastName() == "Christie")
            return retrieveBooks_filesystem()
        return retrieveBooks_database(owner)
    }

    fun getCustomers(): List<Customer> {
        val customers = mutableListOf<Customer>()
        customers.add(Customer("Max", "Mustermann"))
        customers.add(Customer("Erika", "Mustermann"))
        return customers
    }

    fun retrieveBooks_manual(): List<Book> {
        val books = mutableListOf<Book>()
        books.add(Book("The Trial", "Franz Kafka"))
        books.add(Book("The Castle", "Franz Kafka"))
        books.add(Book("The Hunger Artist", "Franz Kafka"))
        return books
    }

    fun retrieveBooks_database(owner: Owner): List<Book> {
        val books = mutableListOf<Book>()
        val connection = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/example", "admin", "admin")
        val result = connection.prepareStatement("SELECT * FROM books WHERE owner LIKE $owner.getLastname()").executeQuery()
        while(result.next()){
            val name = result.getString("name")
            val author = result.getString("author")
            books.add(Book(name, author))
        }
        return books
    }

    fun retrieveBooks_filesystem(): List<Book> {
        val books = mutableListOf<Book>()
        File("/my/path/to/books.csv").forEachLine {
            val (name, author) = it.split(",")
            books.add(Book(name, author))
        }
        return books
    }
}