
public class Student {

    private String[] courses = {"Application Development", "Digital Consultant", "Web Developer", "System Administrator", "Network Specialist", "Business Analyst"};
    private Boolean beursStudent;

    public Student() {

    }

    public Boolean getBeursStudent() {
        return beursStudent;
    }

    public void setBeursStudent(Boolean beursStudent) {
        this.beursStudent = beursStudent;
    }

    public String[] getCourses() {
        return courses;
    }

    /**
     *
     * @return the money due depending the scholarship of the student
     */
    public double calcMoneyDue() {
        if (beursStudent) {
            return 120.50;
        } else {
            return 700.60;
        }
    }

    /**
     * Loops through an array and shows in the console.
     */
    public void displayCourses() {
        for (int i = 0; i < courses.length; i++) {
            System.out.println(i + 1 + ". " + courses[i] + "\n");
        }
    }

    /**
     * Returns a String from an array with the given index i.
     * @param i returns the String for the given index i.
     * @return Important as the arrays starts at 0. We return i - 1
     */
    public String getSelectedCourseByIndex(int i) {
        // i - 1 because index array starts at 0 otherwise it will get wrong course
        return courses[i - 1];
    }

    /**
     * Checks if the string begins with y or n
     *
     * @param str the first index of the given string is checked.
     */
    public void checkYesOrNo(String str) {
        if (str.toLowerCase().charAt(0) == 'y') {
            beursStudent = true;
        } else if (str.toLowerCase().charAt(0) == 'n') {
            beursStudent = false;
        } else {
            System.out.println("Error! The given input is wrong");
        }
    }
}
