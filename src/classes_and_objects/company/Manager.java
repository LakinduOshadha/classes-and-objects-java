package classes_and_objects.company;
import java.util.Arrays;

/**
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class Manager extends Employee {
    // Initializing Instance variables
    private double bonus;
    public Staff[] team;
    public int level;
    public int teamCount = 0;

    /**
     *
     * Constructor for Manager
     * @param name name
     * @param age age
     * @param salary salary
     * @param bonus bonus
     * @param level level
     */
    public Manager(String name, int age, double salary, double bonus, int level) {
        setName(name);
        setAge(age);
        setSalary(salary);
        setBonus(bonus);
        this.level = level;
        this.team = new Staff[0];

    }

    /**
     * This method adds Staff to the Manager
      * @param staff Employee
     */
    public void addStaff(Staff staff) {
        team[this.teamCount] = staff;
        teamCount++;
    }

    /**
     * Setter for bonus
     * @param bonus bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * Getter for bonus
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Overriding getSalary method
     * @return Total salary with bonus.
     */
    @Override
    public double getSalary() {
        return this.salary + this.bonus;
    }

    /**
     * This checks whether 2 managers are in same lavel or not
     * @param e Manager
     * @return True if levels are same
     */
    public boolean equals(Manager e) {
        return this.level == e.level;
    }

    /**
     * This overrides toString method
     * @return Manager Details with his/her Staff
     */
    @Override
    public String toString(){
        return "Manager[" + "name ='" + this.name + "', age =" + this.age +
                ", salary =" + this.salary + ", bonus =" + this.bonus +
                ", level =" + this.level + ']' + " | StaffMembers[" + Arrays.toString(team) + "]";
    }
}
