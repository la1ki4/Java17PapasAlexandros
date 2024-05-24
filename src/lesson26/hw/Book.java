package lesson26.hw;

public class Book {
    private String title;
    private int pages;
    private String authorName;

    Book(String title, int pages, String authorName){
        this.title = title;
        this.pages = pages;
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + authorName + '\'' +
                '}';
    }
}
