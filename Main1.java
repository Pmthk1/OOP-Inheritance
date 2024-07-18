class Employee {
    private String employeeId;
    private String name;
    private double salary;

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void work() {
        System.out.println(name + " is working...");
    }

    public void takeBreak() {
        System.out.println(name + " is taking a break...");
    }
}

class Programmer extends Employee {
    private String project;

    public Programmer(String employeeId, String name, double salary, String project) {
        super(employeeId, name, salary);
        this.project = project;
    }

    public String getProject() { return project; }
    public void setProject(String project) { this.project = project; }

    public void meeting() {
        System.out.println(getName() + " is meeting with " + project + " team members.");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("1", "John", 30000.0, "Project 1");
        System.out.println("Name: " + programmer.getName());
        System.out.println("Employee ID: " + programmer.getEmployeeId());
        System.out.println("Salary: " + programmer.getSalary());
        System.out.println("Project: " + programmer.getProject());

        programmer.work();
        programmer.meeting();

        programmer.setProject("Project 2");

        programmer.meeting();
        programmer.takeBreak();
    }
}