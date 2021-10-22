import java.util.Random;

public class Test {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory =  new EmployeeFactory();
        Employee[] employees  = employeeFactory.generateEmployees(10);
        EmployeeService employeeService = new EmployeeService(employees);
        Employee employee  = new Employee(2, "Игорь", 30, 2000.00, 40, "мужчина", 30);

        employeeService.printEmployees();

        System.out.println( "Общая сумма денег необходимая для зарплаты: "  + employeeService.calculateSalaryAndBonus() );

        System.out.println( "SERCH BY ID   =================================== " );
        System.out.println(  "getById: " + employeeService.getById(2).toString());

        System.out.println( "SERCH BY NAME =================================== " );
        Employee[] searchEmployer = employeeService.getByName("Вася" );
            if ( searchEmployer != null ) {
                System.out.println( "search employee founded");
            } else {
                System.out.println( "Search employee not found" );
            }
        System.out.println( "SORT BY NAME ==================================== " );
        employeeService.sortByName();
        employeeService.printEmployees();

        System.out.println( "SORT BY NAME AND SALARY ========================= " );
        employeeService.sortByNameAndSalary();
        employeeService.printEmployees();

        System.out.println( "ADD INFORMATION ============================= " );
        employeeService.add(employee);

        System.out.println( "REPLACE INFORMATION ============================= " );
        Employee employeeTwo  = new Employee(2, "Игорь", 30, 2500.00, 40, "мужчина", 40);
        employee =  employeeService.edit(employeeTwo);
        System.out.println(employee.toString());

        System.out.println( "REMOVE INFORMATION ============================= " );
        employeeService.remove(1);
        for (Employee newEployeeList : employees) {
            System.out.println(newEployeeList);
        }
    }
}
