package classes_and_objects.company;

/**
 *
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class PartTimer extends Staff{
    // Initializing Instance variables
    private double payRate;
    public int workedHours;

    /**
     * Constructor for PartTime
     * @param name name
     * @param age age
     * @param payRate payRate
     * @param workedHours workedHours
     */
    public PartTimer(String name, int age, double payRate, int workedHours) {
        super(name, age, 0);
        this.payRate = payRate;
        this.workedHours = workedHours;
    }

    /**
     * Getter for getPayRate
     * @return payRate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * This overrides getSalary method.
     * Salary = payRate x workedHours
     * @return Salary for PartTimer
     */
    @Override
    public double getSalary(){
        return this.payRate*this.workedHours;
    }

    /**
     * Setter for payRate
     * @param payRate payRate
     */
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    /**
     * This checks whether two PartTimers have same payRate or not
     * @param pt PartTimer
     * @return True if they have same payRate
     */
    public boolean equals(PartTimer pt){
        return this.payRate == pt.getPayRate();
    }

    /**
     * This overrides toString method
     * @return PartTimer Details
     */
    @Override
    public String toString() {
        return "PartTimer[" + ", name='" + name + "', age=" + age + ", salary=" + salary
                + "payRate=" + payRate + ", workedHours=" + workedHours + ']';
    }
}
