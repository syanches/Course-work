/**
 * Created by syanches on 08.12.16.
 */
import javax.swing.*;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<Book>();
        Scanner sc = new Scanner(System.in);
        books.add(new Book("1984", "George Orwell", "978-5-17-080115-2", 1949, 320));
        books.add(new Book("The Knife", "Edgar Allan Po", "968-5-00-340115-2", 1998, 220));
        books.add(new Book(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()));
        System.out.println(books);
       // System.out.println(books);

    }
}
