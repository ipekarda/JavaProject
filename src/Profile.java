/**
 * The Profile class stores various information about people
 *
 * @author Arda Ipek : ipek.arda.pro@gmail.com
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Profile {

    private int profileID;
    private String name;
    private String lastName;
    private int age;
    private double weight;
    private String email;
    // Constructor
    public Profile(int ID) {
        profileID = ID;
    }
    /**
     * Tells whether or not this argument matches the regular expression for a valid email.
     *
     * @param email : this argument is compared with the regular expression
     * @return true if, and only if, the argument matches the given regular expression
     */
    public static boolean isValidEmail(String email) {
        // String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(regex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    // Get & Set functions
    public int getID() {
        return profileID;
    }
    public void setID(int ID) {
        this.profileID = ID;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    public String getAllInfo() {
        return "First name: " + name + "\nLast name: " + lastName + "\nEmail: " + email + "\nAge: " + age + "\nWeight: " + weight + "kg";
    }
}
