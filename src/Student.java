import java.util.Scanner;

/** @author Stanislav Rakitov */
public class Student {

  private static final int COSTOFCOURSE = 600;
  private static int id = 1000;
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentID;
  private String courses;
  private int tuitionBalance;

  public Student() {
    // This is a shitty code that instructor teaches us.
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Student first name: ");
    this.firstName = in.nextLine();
    System.out.print("Enter Student last name: ");
    this.lastName = in.nextLine();
    System.out.print(
        "1 - Freshmen\n"
            + "2 - Sophmore\n"
            + "3 - Junior\n"
            + "4 - Senior\n"
            + "Enter Student class level: ");
    this.gradeYear = in.nextInt();
    System.out.println(firstName + " " + lastName + " " + gradeYear);

    setStudentID();
    System.out.println("Student ID: " + studentID);
  }

  private void setStudentID() {
    id++;
    this.studentID = String.valueOf(gradeYear) + id;
  }
}
