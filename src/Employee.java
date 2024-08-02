/**
 * This is an abstract class used as superclass
 * @author--Zheng Wang
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nSocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();//这是一个abstract method， 不override根本没用的method
}

