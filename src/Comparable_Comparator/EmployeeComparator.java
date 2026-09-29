package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
    }
}
/* ADD THE BELOW CODE IN MAIN
Address address1 = new Address(509, "Prestige Park views", "Bangalore", "Karnataka", "India", 560067 );
Address address2 = new Address(203, "JN Heights", "Wayanad", "Kerala", "India", 673121 );
Address address3 = new Address(111, "Sava Homes", "Vizag", "Andhra Pradesh", "India", 530001 );
Address address4 = new Address(25, "Amrita Spring", "Patna", "Bihar", "India", 800021 );
Address address5 = new Address(312, "Prestige Park views", "Bangalore", "Karnataka", "India", 560067 );
Address address6 = new Address(437, "JNKs", "Delhi", "Delhi", "India", 110004 );
Address address7 = new Address(3, "Hawa Residency", "Jaipur", "Rajasthan", "India", 302001 );


Employee employee1 = new Employee(101, "Vijay", 29000, 23, address1);
Employee employee2 = new Employee(104, "Murti", 31000, 27, address2);
Employee employee3 = new Employee(102, "Flavin", 44000, 34, address3);
Employee employee4 = new Employee(105, "Ravi", 29000, 26, address4);
Employee employee5 = new Employee(103, "Riya", 15000, 22, address7);
Employee employee6 = new Employee(107, "John", 45000, 34, address5);
Employee employee7 = new Employee(106, "Kabir", 15000, 22, address6);

ArrayList<Employee> employees = new ArrayList<>();

        employees.add(employee7);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee1);

//Collections.sort(employees);

Comparator<Employee> bySalaryThenName = Comparator.comparingInt(Employee::getEmployeeSalary).reversed().thenComparing(Employee::getEmployeeName).thenComparingInt(Employee::getEmployeeId);
        employees.sort(bySalaryThenName);

        employees.forEach(System.out::println);
*/
