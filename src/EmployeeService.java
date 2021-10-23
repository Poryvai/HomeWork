import java.net.StandardSocketOptions;
import java.util.ArrayDeque;
import java.util.Arrays;

public class EmployeeService {
    Employee[] employees;

    EmployeeService( Employee[] employees){
        this.employees = employees;
    }


    //вывод на экран информации о сотрудниках
    void printEmployees(){
        for( Employee employee: employees ){
            System.out.println( employee );
        }
    }

    //возвращает количество денег необходимое дл я выплаты зарплат
    // для всех сотрудников в этом месяце (пробегаем по всем сотрудникам,
    // суммируем зарплату каждого с бонусом каждого)
    double calculateSalaryAndBonus(){
        double totalSalary = 0.0;
        for( Employee employee: employees ){
//            totalSalary += employee.salary + employee.fixedBugs * employee.defaultBugRate;
            totalSalary += employee.salary;
        }
        return totalSalary;
    }

    //возвращает сотрудника по заданному id
    Employee getById(  long searchId ){
        for( Employee employee: employees ){
            Employee currentEmployee  = employee;
            if( currentEmployee.id == searchId ){
                return employee;
            }
        }
        return null;
    }

    //возвращает сотрудника по заданному имени
    Employee[] getByName( String searchName ) {
        int count = 0;
        for ( Employee employee:employees  ) {
            if( employee.name.equals(  searchName  ) ){
                count++;
            }
        }
        if( count == 0  ){
            return null;
        }
        Employee[] listOfEmpleyees = new Employee[count];
        int index = 0;
        for ( Employee employee:employees ) {
            if( employee.name.equals(  searchName  )  ){
                listOfEmpleyees[index++] = employee;
            }
        }
        return listOfEmpleyees;
    }

    //возвращают отсортированный массив с сотрудниками по критерию
    Employee[] sortByName(){

        for ( int i = 0; i < employees.length ; i++ ) {
            for ( int j = i+1; j < employees.length; j++ ) {
                Employee temp;
                if ( employees[i].name.compareTo( employees[j].name  ) > 0 ) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees;
    }

    //возвращают отсортированный массив с сотрудниками по критерию
    Employee[] sortByNameAndSalary(){
        for ( int i = 0; i < employees.length; i++ ) {
            for ( int j = i + 1; j < employees.length; j++ ) {
                Employee temp;
                if ( employees[i].name.compareTo(employees[j].name ) > 0 ) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                } else if ( employees[i].name.equals( employees[j].name  )  ) {
                    if (  employees[i].salary  > employees[j].salary ) {
                        temp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = temp;
                    }
                }
            }
        }
        return employees;
    }

    //находит сотрудника по id, и подменяет информацию о нем на новую.
    // Старую версию сотрудника метод возвращает
    Employee edit( Employee newEployeeInformation ){
        Employee  oldEployeeInfarmation = null;
        for ( int i = 0; i < employees.length; i++ ) {
            oldEployeeInfarmation = employees[i];
            if ( newEployeeInformation.id == oldEployeeInfarmation.id ) {
                employees[i] = newEployeeInformation;
            }

        }
        return oldEployeeInfarmation;
    }

    //находит сотрудника по id, и удаляет его из массива.
    // Возвращает ссылку на удаленного сотрудника
    Employee remove( long searchId ) {
        Employee removeEmployee = null;
        int indexToRemove = -1;
        for ( int i = 0; i < employees.length; i++  ) {
            Employee employee = employees[i];
            if ( employee.id == searchId  ) {
                removeEmployee = employees[i];
                System.out.println( i );
                indexToRemove = i;
                break;
            }
        }
        if ( indexToRemove == -1 ) {
            return null;
        }
       // Employee[] newEmployees = new Employee[employees.length - 1];

       // int newArrayCounter = 0;
        int newArrayCounter = employees.length;
        for ( int j = indexToRemove; j < newArrayCounter -1; j++ ) {
            employees[j] = employees[j+1];
            newArrayCounter--;
            }
        return removeEmployee;
    }

    //Добавляет нового сотрудника. Массив увеличивается на 1.
    void add( Employee employee ){
        Employee[] newEmployees = Arrays.copyOf( employees, employees.length+1 );
        newEmployees[ newEmployees.length-1 ] = employee;
        employees = newEmployees;

    }
}









