package unitone.exercises;


/** Represent an employee in a company
 * @author Fransheska Echevarria
 * @version 1.0
 */
public class Employee {

    // CONSTANT first
    public static final int MAX_OVERTIME_HOURS = 10;

    // INSTANCE VARIABLE second
    private String id;
    private double baseSalary;
    private boolean isFullTime;

    /** Create objects from the class Employee
     * @param id The employee unique identification
     * @param baseSalary The employee salary as agree in contract
     * @param isFullTime A boolean wether the employee is full time or not
     */
    public Employee(String id, double baseSalary, boolean isFullTime) {
        this.id = id;
        this.baseSalary = baseSalary;
        this.isFullTime = isFullTime;
    }

    /**
     * Calculates overtime pay at 50$ per hour.
     * This rate is standard for all employees regardless
     * of their base salary or full-time status.
     * @param overtimeHours The total hours in numbers that employee work extra
     * @return The final salary employee gets including the overtime hours  
    */
    public double calculateTotalSalary(int overtimeHours) {
        double overtimePay = overtimeHours * 50;
        return baseSalary + overtimePay; 
    }

    /** 
     * Gets the employee's salary
     * @deprecated Use {@link #getBaseSalary()} instead for clarity.
     * @return The base salary amount.
     */
    @Deprecated
    public double getSalary() {
        return this.baseSalary;
    }

    /**
     * Gets the employee's base salary without overtime.
     * @return The base salary amount
     */
    public double getBaseSalary() {
        return this.baseSalary;
    }
}
