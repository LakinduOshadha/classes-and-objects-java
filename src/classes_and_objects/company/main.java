package classes_and_objects.company;
import java.util.Scanner;

/**
 *
 * @author 2018/E/007 ARACHCHI K.A.L.O.K.
 */
public class main {
    /**
     * This method asks a name from the user and prints the corresponding details of the employee.
     * @param e Employee arr
     */
    public static void printEmployeeDetails(Employee[] e) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();

        // Searching the name and calling toString method
        for(int i = 0; i < e.length; i++) {
            if(e[i].getName().equals(name)) {
                System.out.println(e[i].toString());
                break;
            }
        }


    }

    /**
     * main class for demostration
     * @param args
     */
    public static void main (String args[]) {
        // Adding 6 records
        Employee emArr[] = new Employee[6];

        emArr[0] = new Employee("Lakindu",34,76987);
        emArr[1] = new Employee("Keshan",23,153123);
        emArr[2] = new Employee("ishuru",65,3453542);
        emArr[3] = new Employee("madhusha",45,24524523);
        emArr[4] = new Employee("kavindu",96,24524);
        emArr[5] = new Employee("oshadha",45,54757);

        printEmployeeDetails(emArr);    // Print the employee details

        // Getting user details for the array
        System.out.println("\n----Getting User Data-----\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employees : ");
        int n = sc.nextInt();
        Employee emArr2[] = new Employee[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Employee" + i+1 + "\n");
            System.out.print("Enter 'M' if a manager, 'S' if a Staff member, 'P' if a PartTimer : ");
            String type = sc.next();

            System.out.print("name : ");
            String name = sc.next();
            System.out.print("age : ");
            int age = sc.nextInt();

            // If he is a manager
            if(type.equals("M")) {
                System.out.print("salary : ");
                double salary = sc.nextDouble();
                System.out.print("bonus : ");
                double bonus = sc.nextDouble();
                System.out.print("level : ");
                int level = sc.nextInt();
                Manager m = new Manager(name, age, salary, bonus, level);
            }

            // If he is a PartTimer
            if(type.equals("P")) {
                System.out.print("payRate : ");
                Double payRate = sc.nextDouble();
                System.out.print("workedHours : ");
                int workedHours = sc.nextInt();
                PartTimer p = new PartTimer(name, age, payRate, workedHours);
            }

            // If he is a Staff member
            if(type.equals("S")) {
                System.out.print("salary : ");
                double salary = sc.nextDouble();
                Employee s = new Employee(name, age,salary);
            }


        }
    }
}
