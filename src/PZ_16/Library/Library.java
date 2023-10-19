package PZ_16.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private int booksCount;
    private int emplCount;
    private String directorName;
    private String name;

    private List<Book> books;
    private List<Employees> employees;
    private List<Client> clients;


    public Library(int booksCount, int emplCount, String directorName, String name){
        this.booksCount = booksCount;
        this.emplCount = emplCount;
        this.directorName = directorName;
        this.name = name;

        books = new ArrayList<>();
        employees = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        booksCount++;
    }

    public void delBook(Book book){
        books.remove(book);
        booksCount--;
    }

    public void addEmpl(Employees empl){
        employees.add(empl);
    }
    public void delEmpl(Employees empl){
        employees.remove(empl);
    }
    public void addClient(Client client){
        clients.add(client);
    }
    public void delClient(Client client){
        clients.remove(client);
    }

    public String getBooksCount() {
        return "\n" + "Книг в библиотеке на данный момент " + booksCount;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }
}
