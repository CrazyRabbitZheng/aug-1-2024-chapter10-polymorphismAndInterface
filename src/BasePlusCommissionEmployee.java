/**
 * This class is a subclass of CommissionEmployee, is an indirect subclass of Employee
 * However, this class only talks to its super class, i.e.,CommissionEmployee class. It doesn't care other classes in the inheritance hierarchy
 * it has an instance variable double baseSalary and setter and getter
 * it overrides toString() and earnings()
 * @author--Zheng Wang
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary must be greater than zero");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base salary must be greater than or equal to zero");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings(){
        return super.earnings() + getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%s%s%n%s$%,.2f",
                "base-salaried ", super.toString(),
                "base salary ", getBaseSalary());
    }
}
