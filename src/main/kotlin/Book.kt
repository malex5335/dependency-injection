class Book(title: String, author: String) {
    private val title: String
    private val author: String
    override fun toString(): String {
        return "$title by $author"
    }

    init {
        this.title = title
        this.author = author
    }
}