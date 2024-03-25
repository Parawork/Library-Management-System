package Source;

import java.io.Serializable;
import java.util.HashMap;

import static Source.Serialization.*;

public class User implements Serializable {
    private int id;
    private static final long serialVersionUID = 123456789L;

    private String firstname;
    private String lastname;
    private String username;
    private String age;
    private String email;
    private String password;
    private String role;
    private int phone;
    private HashMap<Book,Librarian> bookLog;

    public User(int id, String firstname, String lastname, String username, String age, String email, String password, String role, int phone) throws Exception {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.age = age;
        this.email = email;
        this.password = password;
        this.role = role;
        this.phone = phone;
        saveUser(this);
    }
    //borrow book
    public void borrowBook(Book book, Librarian librarian){
        bookLog.put(book,librarian);
        book.setBookStatus(0);
    }
    //return book
    public void returnBook(Book book){
        bookLog.remove(book);
        book.setBookStatus(1);
    }
    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

}
