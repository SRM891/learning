public class Employee implements Comparable<Employee> {
    private int EmpId;
    private String name;
    private String email;
    private char gender;
    private float salary;

    public Employee(int empId, String name, String email, char gender, float salary) {
        EmpId = empId;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId() {
        return EmpId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public float getSalary() {
        return salary;
    }

    public void getEmployeeDetails(){
        System.out.println("ID: "+this.EmpId);
        System.out.println("Name: "+this.name);
        System.out.println("E-Mail: "+this.email);
        System.out.println("Gender: "+this.gender);
        System.out.println("Salary: "+this.salary);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.EmpId,o.EmpId);
    }
}
