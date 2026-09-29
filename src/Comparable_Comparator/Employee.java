package Comparable_Comparator;

public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;
    private int employeeAge;
    private Address address;

    public Employee(int employeeId, String employeeName, int employeeSalary, int employeeAge, Address address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Comparable_Comparator.Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeAge=" + employeeAge +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
       int result = Integer.compare(o.getEmployeeSalary(), this.getEmployeeSalary());
       if(result != 0){
           return result;
       }
       result = Integer.compare(this.getEmployeeAge(), o.getEmployeeAge());
       if(result!=0){
           return result;
       }
       return Integer.compare(this.getEmployeeId(), o.getEmployeeId());
    }
}
