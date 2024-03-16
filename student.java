import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class student extends studentcourse{
    public String name;
    public Date dob;

    // Constructor
    public student(String name, String dob) {
        this.name = name;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            this.dob = sdf.parse(dob);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD-MM-YYYY.");
        }
    }

    // Function to display student name
    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    // Function to display age based on date of birth
    public void displayAge() {
        if (dob != null) {
            Date currentDate = new Date();
            long ageInMillis = currentDate.getTime() - dob.getTime();
            long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365);
            System.out.println("Age: " + ageInYears + " years");
        } else {
            System.out.println("Date of birth not set.");
        }
    }

    public static void main(String[] args) {                    
        // Create a Student object
        student student = new student("Saadhvi shet", "07-11-2003");

        // Display student name
        student.displayStudentName();

        // Display age
        student.displayAge();
        student.get_course();
        student.get_marks();
    }
}

