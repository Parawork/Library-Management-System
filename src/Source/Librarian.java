package Source;
import java.io.Serializable;

public class Librarian implements Serializable {
    private int libraryId;
    private String libraryName;
    private String libraryAddress;
    private String libraryPhone;
    private String libraryEmail;
    private String libraryPassword;
    private String libraryRole;
    private int age;
    public Librarian(int id, String firstname, String lastname, String username, int age, String email, String password, String role) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.libraryPhone = libraryPhone;
        this.age = age;
        this.libraryEmail = libraryEmail;
        this.libraryPassword = libraryPassword;
        this.libraryRole = libraryRole;
    }
    //getters and setters
    public int getLibraryId() {
        return libraryId;
    }
    public String getLibraryName() {
        return libraryName;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    public String getLibraryAddress() {
        return libraryAddress;
    }
    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }
    public String getLibraryPhone() {
        return libraryPhone;
    }
    public void setLibraryPhone(String libraryPhone) {
        this.libraryPhone = libraryPhone;
    }
    public String getLibraryEmail() {
        return libraryEmail;
    }
    public void setLibraryEmail(String libraryEmail) {
        this.libraryEmail = libraryEmail;
    }
    public String getLibraryPassword() {
        return libraryPassword;
    }
    public void setLibraryPassword(String libraryPassword) {
        this.libraryPassword = libraryPassword;
    }
    public String getLibraryRole() {
        return libraryRole;
    }
    public void setLibraryRole(String libraryRole) {
        this.libraryRole = libraryRole;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
