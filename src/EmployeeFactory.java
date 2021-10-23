import java.util.*;

public class EmployeeFactory {
    Employee[] generateEmployees(int size){
        String[] nameMale = {"Вася","Игорь", "Коля", "Толя", "Олег", "Ваня", "Денис", "Андрей"};
        String[] nameFemale = {"Люда", "Оля", "Катя", "Настя", "Алена", "Таня", "Аня","Юля"};
        Random random = new Random();
        Employee[] employees = new Employee[size];
        boolean isMale = false;

        for(int i = 0; i < size; i++){
            long id = i + 1;
            isMale = random.nextBoolean();
            String name = isMale ? nameMale[random.nextInt(nameMale.length)] :
                    nameFemale[random.nextInt(nameFemale.length)];
            int age = random.nextInt(60)+20;
            double salary =Math.round((random.nextDouble(5000.00)+200.00) * 100 / 100D);
            int fixedBugs = random.nextInt(100)+1;
            String gender = "";
            if(isMale){
                gender = "мужчина";
            }else{
                gender = "женщина";
            }
            double defaultBugRate = Math.round((random.nextDouble(50.00)+10.00) * 100 / 100D);
            Employee employee = new Employee(id, name, age, salary, fixedBugs, gender, defaultBugRate);

            employees[i] = employee;
        }
        return employees;
    }

}
