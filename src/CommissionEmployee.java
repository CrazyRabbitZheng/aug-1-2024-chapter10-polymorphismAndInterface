/**
 * This class is a subclass of Employee
 * It has an instance variable double grossSales and double commissionRate, and setter and getter for them
 * It overrides toString() and earnings()
 */
public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        if (commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("Commission rate must be between 0 and 1");
        }
        this.commissionRate = commissionRate;

        if(grossSales < 0){
            throw new IllegalArgumentException("grossSales must be a positive number");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if (commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("Commission rate must be between 0 and 1");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0){
            throw new IllegalArgumentException("grossSales must be a positive number");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s %s%n%s%.2f%n%s$%.2f",
                "Commission employee", super.toString(),
                "commission rate ", getCommissionRate(),
                "gross sales ", getGrossSales());
    }
}
