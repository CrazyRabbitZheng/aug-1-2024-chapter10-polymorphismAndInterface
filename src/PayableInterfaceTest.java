/**
 * This is a driver class creates 2 Invoice objects and 2 SalariedEmployee objects and put them in a Payable array
 * @author--Zheng Wang
 */
public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[] {
                new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
                new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00),
        };

        System.out.printf("Invoices and Employees processed polymorphically: %n%n");

        for (Payable payable : payableObjects) {
            System.out.println(payable);
            System.out.println("payment due: $" + payable.getPaymentAmount());
            System.out.println();

        }
    }
}
