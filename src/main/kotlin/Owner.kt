class Owner(private val firstName: String, private val lastName: String) {
    override fun toString(): String {
        return "$firstName $lastName"
    }

    fun getLastName(): String {
        return lastName
    }
}