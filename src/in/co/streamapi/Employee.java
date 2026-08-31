package in.co.streamapi;

public class Employee implements Comparable<Employee> {

    public String name;
    public String department;
    public double Salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.Salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        return Double.compare(this.Salary, e.Salary);
    }

    @Override
    public String toString() {
        return name + " " + department + " " + Salary;
    }
}