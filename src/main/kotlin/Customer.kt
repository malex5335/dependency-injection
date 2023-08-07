class Customer(firstname: String, lastname: String) {
    private val firstname: String
    private val lastname: String
    override fun toString(): String {
        return "$firstname $lastname"
    }

    init {
        this.firstname = firstname
        this.lastname = lastname
    }
}