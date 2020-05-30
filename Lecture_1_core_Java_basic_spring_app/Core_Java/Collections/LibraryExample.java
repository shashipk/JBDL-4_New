import java.util.*;
public class LibraryExample {

    public static void main(String[] args) {
        //Creating list of Books
        ArrayList<Book> library=new ArrayList<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        library.add(b1);
        library.add(b2);
        library.add(b3);
        //Traversing list
        for(Book b:library){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
