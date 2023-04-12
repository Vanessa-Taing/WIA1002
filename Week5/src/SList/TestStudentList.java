package SList;

import java.util.*;

/**
 *
 * @author VJT
 */
public class TestStudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentList<String> list = new StudentList<>();
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        while (!"n".equals(inputLine)) {
            list.add(inputLine);
            inputLine = sc.nextLine();
        }
        System.out.println("You have entered the following students' name : ");
        list.printList();
        

        System.out.println("The number of students entered is : " + list.getSize());
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed. ");
        inputLine = sc.nextLine();

        if ("r".equals(inputLine)) {
            System.out.println("Enter the existing student name that you want to rename : ");
            String wrongName = sc.nextLine();
            System.out.println("Enter the new name : ");
            String correctName = sc.nextLine();
            list.replace(wrongName, correctName);

        } else if ("n".equals(inputLine)) {

        }
        System.out.println("The new student list is : ");
        list.printList();
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed. ");
        inputLine = sc.nextLine();
        if ("y".equals(inputLine)) {
            System.out.println("Enter a student name to remove : ");
            inputLine = sc.nextLine();
            list.removeElement(inputLine);
            System.out.println("The number of updated student is : "+list.getSize());
            System.out.println("The updated student list is: ");
            list.printList();
        } else if ("n".equals(inputLine)) {
        }
        System.out.println("All student data captured complete. Thank you!");
    }

}
