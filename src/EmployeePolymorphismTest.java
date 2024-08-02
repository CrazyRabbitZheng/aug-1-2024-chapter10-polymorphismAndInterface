/**
 * This driver class creates objects of each of Employee's subclasses
 * gives 10% raise on salary for BasePlusCommissionEmployee
 * @author--Zheng Wang
 */
public class EmployeePolymorphismTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 40, 16.75);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", .06, 10000);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "555-55-5555", 0.04, 5000, 300);

        System.out.println("Employee processed individually: ");

        System.out.printf("%n%s%s%s$%,.2f", "♥ ", salariedEmployee, " earned ", salariedEmployee.earnings());
        System.out.printf("%n%s%s%s$%,.2f", "♦ ", hourlyEmployee, " earned ", hourlyEmployee.earnings());
        System.out.printf("%n%s%s%s$%,.2f", "♥ ", commissionEmployee, " earned ", commissionEmployee.earnings());
        System.out.printf("%n%s%s%s$%,.2f", "♠ ", basePlusCommissionEmployee, " earned ", basePlusCommissionEmployee.earnings());

        System.out.println();
        System.out.println();

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employee processed polymorphically: ");
        System.out.println();

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.println();

            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.1 * employee.getBaseSalary());

                System.out.printf("New base salary with 10%% increase is $%,.2f%n", employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());

            for(int j = 0; j < employees.length; j++){
                System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
            }
        }

    }
}