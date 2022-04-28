import java.util.Objects;

public class Book {
    private final String bookName;
    private int releaseYear;
    private final Author author;

    public Book(String bookName, int realiseYear, Author author) {
        this.bookName = bookName;
        this.releaseYear = realiseYear;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return getBookName() + ", " + getAuthor() + ", " + getReleaseYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, releaseYear, author);
    }
}

