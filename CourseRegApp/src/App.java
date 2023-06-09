import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        AcadOfficeStaff aStaff1 = new AcadOfficeStaff("Alice", "001", 30);
        Student s1 = new Student("Bob", "A21EC0001", 20);
        ArrayList<Course> courseList = new ArrayList<>();
        Course tempCourse = null;
        Scanner choiceScan = new Scanner(System.in);


        //create course
        tempCourse = aStaff1.createCourse();
        courseList.add(tempCourse);

        //register course
        String choice = null;
        int i = 0;
        for (Course c : courseList) {
            System.out.println("["+ i +"] : " + c.getName());
            i++;
        }
        System.out.println("Choose course: ");
        choice = choiceScan.nextLine();
        choiceScan.nextLine();

        choiceScan.close();

        return;
    }
}
