package PZ_16.Library;

public class Main {
    public static void main(String[] args){
        Book bk = new Book("Ya", 2004, "I want");

        Library lb = new Library(321, 10, "Pamper", "NY Lib");
        lb.addBook(bk);

        Client cl = new Client("Madafaker", "Pussy");
        cl.addBook(bk);
        System.out.println(cl.getBookCount());

        Employees ep = new Employees("Adolf","Sulafko", 2001, "M");
        System.out.println(ep.getFullName());
    }
}
