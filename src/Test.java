import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Вася", 28, 450,
                30, "male", 15.5);
        Employee employee2 = new Employee(2, "Петя", 29, 400,
                30, "male", 15.5);
        Employee employee3 = new Employee(3, "Коля", 29, 600,
                30, "male", 15.5);
        Employee employee4 = new Employee(4, "Коля", 29, 590,
                30, "male", 15.5);
        Employee employee5 = new Employee(4, "Кол", 29, 400,
                30, "male", 15.5);

        Employee[] mas = new Employee[4];
        mas[0] = employee;
        mas[1] = employee2;
        mas[2] = employee3;
        mas[3] = employee4;
        EmployeeService employeeService = new EmployeeService(mas);

        // employeeService.employees = mas;
        // employeeService.printEmployees();
        // System.out.println(employeeService.getById(1));
        //System.out.println(employeeService.getByName("Petya"));
        EmployeeService emp = new EmployeeService(mas);
        //emp.getByName("Игорь");
       // emp.add(employee);
       // emp.printEmployees();
       // emp.remove(1);

//      emp.printEmployees();
//        emp.edit(employee5);
//        emp.printEmployees();
     // emp.sortByName();
       // System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        //emp.printEmployees();
      //  System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        emp.sortByNameAndSalary();
        emp.printEmployees();

    }
}
