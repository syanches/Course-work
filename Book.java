/**
 * Created by syanches on 08.12.16.
 */
public class Book {
    private String title;
    private String author;
    private String  isbn;
    private int year;
    private int pages;

    public Book(String title, String author, String isbn, int year, int pages){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.year=year;
        this.pages=pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\"" + getTitle() + "\" "+getAuthor() + " " +getYear();
    }
}
