/**
 * The Profile class stores various information about people
 *
 * @author Arda Ipek : ipek.arda.pro@gmail.com
 */
public class Profile {

    private String name;
    private String lastName;
    private int age;
    private double weight;
    private String email;

    public Profile() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Tells whether or not this argument matches the regular expression for a valid email.
     *
     * @param email : this argument is compared with the regular expression
     * @return true if, and only if, the argument matches the given regular expression
     */
    public static boolean isValidEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
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
