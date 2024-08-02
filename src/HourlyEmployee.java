/**
 * This class is a subclass of Employee
 * It has an instance variable double wage, and an instance variable hours and setter and getter for them
 * it overrides the toString method and earnings method
 * @author--Zheng Wang
 */
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        this.hours = hours;
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative");
        }
        this.wage = wage;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        if (wage < 0 || wage > 168) {
            throw new IllegalArgumentException("Wage cannot be negative");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public double earnings(){
        if (getHours() <= 40) {
            return getWage() * getHours();
        }else{
            return getWage() * 40 + (getHours() - 40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("%s%n%s$%,.2f%n%s%.2f",super.toString(),"hourly wage",
                getWage(),"hours worked ",getHours());
    }
}
