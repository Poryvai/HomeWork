import java.util.Random;

public class Developer extends Employee{
    int fixedBugs;
    Developer( long id, String name, int  age, double salary, String gender,  int fixedBugs ){
        super( id, name, age, salary, gender );
        this.fixedBugs = fixedBugs;
    }
   double totalSalary() {
        return (salary + fixedBugs * 20) *
                (new Random().nextBoolean() ? 2 : 0);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "fixedBugs=" + fixedBugs +
                '}';
    }
}
