package Source;
import java.io.*;
import java.util.HashMap;

public class Serialization{
    public static void saveUser(User user) throws Exception {
        HashMap<Integer,User> obj = loadUser();

        //put object to map
        obj.put(user.getId(), user);

        // Create FileOutputStream to write object data to a file
        FileOutputStream fileOut = new FileOutputStream("users.ser" );
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj);
        out.close();
        fileOut.close();

        System.out.println("Users serialized successfully.");
    }
    public static HashMap loadUser() throws Exception {
        //deserialization
        FileInputStream fileIn = new FileInputStream("users.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        HashMap obj = (HashMap) in.readObject();

        // Close streams
        in.close();
        fileIn.close();
        return obj;
    }

    public static void saveBook(Book book) throws Exception {
        FileInputStream fileIn = new FileInputStream("books.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        HashMap obj = (HashMap) in.readObject();
        in.close();
        fileIn.close();

        //add book
        obj.put(book.getBookId(), book);

        // Create FileOutputStream to write object data to a file
        FileOutputStream fileOut = new FileOutputStream("books.ser" );
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj);
        out.close();
        fileOut.close();

        System.out.println("Books serialized successfully.");
    }
    public static HashMap loadBook() throws Exception {
        //deserialization
        FileInputStream fileIn = new FileInputStream("books.ser");

        // Create ObjectInputStream to deserialize object
        ObjectInputStream in = new ObjectInputStream(fileIn);

        // Read object from file
        HashMap obj = (HashMap) in.readObject();

        // Close streams
        in.close();
        fileIn.close();
        return obj;
    }
    public static void saveLibrarian(Librarian librarian) throws Exception {
        //deserialization
        FileInputStream fileIn = new FileInputStream("librarians.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        HashMap obj = (HashMap) in.readObject();
        in.close();
        fileIn.close();

        //add librarian
        obj.put(librarian.getLibraryId(), librarian);

        // Create FileOutputStream to write object data to a file
        FileOutputStream fileOut = new FileOutputStream("librarians.ser" );
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.close();
        fileOut.close();

        System.out.println("Librarians serialized successfully.");
    }
    public static HashMap loadLibrarian() throws Exception {
        //deserialization
        FileInputStream fileIn = new FileInputStream("librarians.ser");

        // Create ObjectInputStream to deserialize object
        ObjectInputStream in = new ObjectInputStream(fileIn);

        // Read object from file
        HashMap obj = (HashMap) in.readObject();

        // Close streams
        in.close();
        fileIn.close();
        return obj;
    }




//    public static void reset (){
//        try {
//            // Create a new users
//            User user1 = new User(1, "John", "Doe", "johndoe", "30", "example1@gmail.com", "password", "user", 1234567890);
//            User user2 = new User(2, "Jane", "Doe", "janedoe", "25", "example2@gmail.com", "password", "user", 1234567890);
//            User user3 = new User(3, "James", "Smith", "jamessmith", "35", "example3@gmail.com", "password", "user", 1234567890);
//            User user4 = new User(4, "Mary", "Johnson", "maryjohnson", "40", "example4@gmail.com", "password", "user", 1234567890);
//            User user5 = new User(5, "Robert", "Brown", "robertbrown", "45", "example5@gmail.com", "password", "user", 1234567890);
//
//            // Create a new books
//            Book book1 = new Book(1, "Book1", "Author1", "Publisher1", "Category1", "Description1", "2021-01-01", "2021-01-01");
//            Book book2 = new Book(2, "Book2", "Author2", "Publisher2", "Category2", "Description2", "2021-01-01", "2021-01-01");
//            Book book3 = new Book(3, "Book3", "Author3", "Publisher3", "Category3", "Description3", "2021-01-01", "2021-01-01");
//            Book book4 = new Book(4, "Book4", "Author4", "Publisher4", "Category4", "Description4", "2021-01-01", "2021-01-01");
//            Book book5 = new Book(5, "Book5", "Author5", "Publisher5", "Category5", "Description5", "2021-01-01", "2021-01-01");
//            Book book6 = new Book(6, "Book6", "Author6", "Publisher6", "Category6", "Description6", "2021-01-01", "2021-01-01");
//            Book book7 = new Book(7, "Book7", "Author7", "Publisher7", "Category7", "Description7", "2021-01-01", "2021-01-01");
//            Book book8 = new Book(8, "Book8", "Author8", "Publisher8", "Category8", "Description8", "2021-01-01", "2021-01-01");
//            Book book9 = new Book(9, "Book9", "Author9", "Publisher9", "Category9", "Description9", "2021-01-01", "2021-01-01");
//            Book book10 = new Book(10, "Book10", "Author10", "Publisher10", "Category10", "Description10", "2021-01-01", "2021-01-01");
//
//            // Create a new librarians
//            Librarian librarian1 = new Librarian(1, "saman", "Address1", "1234567890", 23, "e", "password", "librarian");
//            Librarian librarian2 = new Librarian(2, "Amal", "Address2", "1234567890", 23, "e", "password", "librarian");
//            Librarian librarian3 = new Librarian(3, "Kamal", "Address3", "1234567890", 23, "e", "password", "librarian");
//
//            // Create a new hashmap to store users
//            HashMap<Integer, User> users = new HashMap<Integer, User>();
//            users.put(user1.getId(), user1);
//            users.put(user2.getId(), user2);
//            users.put(user3.getId(), user3);
//            users.put(user4.getId(), user4);
//            users.put(user5.getId(), user5);
//
//            // Create a new hashmap to store books
//            HashMap<Integer, Book> books = new HashMap<Integer, Book>();
//            books.put(book1.getBookId(), book1);
//            books.put(book2.getBookId(), book2);
//            books.put(book3.getBookId(), book3);
//            books.put(book4.getBookId(), book4);
//            books.put(book5.getBookId(), book5);
//            books.put(book6.getBookId(), book6);
//            books.put(book7.getBookId(), book7);
//            books.put(book8.getBookId(), book8);
//            books.put(book9.getBookId(), book9);
//            books.put(book10.getBookId(), book10);
//
//            // Create a new hashmap to store librarians
//            HashMap<Integer, Librarian> librarians = new HashMap<Integer, Librarian>();
//            librarians.put(librarian1.getLibraryId(), librarian1);
//            librarians.put(librarian2.getLibraryId(), librarian2);
//            librarians.put(librarian3.getLibraryId(), librarian3);
//
//            // Save users to file
//            saveUser(users);
//
//            // Save books to file
//            saveBook(books);
//
//            // Save librarians to file
//            saveLibrarian(librarians);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }}
}
