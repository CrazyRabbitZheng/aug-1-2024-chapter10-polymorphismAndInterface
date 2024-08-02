/**
 * This class is a subclass of Employee
 * It has an instance variable double weeklySalary, and getter and setter for the variable
 * It has overrides toString method and earnings method
 * @author--Zheng Wang
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0) {
            throw new IllegalArgumentException("Weekly salary cannot be negative");
        }
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklysalary(double weeklySalary) {
        if (weeklySalary < 0) {
            throw new IllegalArgumentException("Weekly salary cannot be negative");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried employee: %s%n%s $%,.2f",
                super.toString(),
                "weekly salary", getWeeklySalary());
    }
}
