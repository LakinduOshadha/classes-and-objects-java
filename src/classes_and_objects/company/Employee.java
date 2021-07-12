package classes_and_objects.company;

/**
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class Employee {
    // Initializing Instance variables
    protected String name;
    protected int age;
    protected double salary;

    /**
     * Default Constructor for Employee
     */
    public Employee(){
        setName(null);
        setAge(0);
        setSalary(0);
    }

    /**
     * Constructor for Employee
     * @param name name
     * @param age age
     * @param salary salary
     */
    public Employee(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    /**
     * Getter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter for salary
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter for name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for age
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Setter for salary
     * @param salary salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Overriding toString method
     * @return Employee Details
     */
    @Override
    public String toString() {
        return "Employee[" + "name ='" + this.name + "', age =" + this.age +
                ", salary =" + this.salary + ']';
    }
}
