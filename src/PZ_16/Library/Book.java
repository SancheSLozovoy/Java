package PZ_16.Library;

public class Book{
    private String author;
    private int year;
    private String title;

    public Book(String author, int year, String title){
        this.author = author;
        this.year = year;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return "Название книги: " + title;
    }
}
