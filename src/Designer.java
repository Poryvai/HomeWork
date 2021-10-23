import java.util.Random;

public class Designer extends Employee{
    int rate;
    int workedDays;
    Designer( long id, String name, int  age, double salary, String gender,  int frate, int workedDays ) {
        super( id, name, age, salary, gender );
        this.rate  = rate;
        this.workedDays = workedDays;
    }

    double totalSalary() {
        return salary + rate * workedDays;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "rate=" + rate +
                ", workedDays=" + workedDays +
                '}';
    }
}
