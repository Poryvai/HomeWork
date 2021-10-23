import java.util.Random;

public class Manager extends Employee {

    Manager ( long id, String name, int  age, double salary, String gender ) {
        super( id, name, age, salary,  gender);
    }

    double totalSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
