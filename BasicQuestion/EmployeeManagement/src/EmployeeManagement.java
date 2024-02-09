import java.util.Iterator;

public class EmployeeManagement{
    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        empDb.addEmployee(new Employee(1, "Sumit", "jdsfksjld@djsk.com", 'M', 20000));
        empDb.addEmployee(new Employee(2, "Ram", "jdsfd@djsk.com", 'M', 30000));
        empDb.addEmployee(new Employee(3, "Shyam", "fksjld@djsk.com", 'M', 120000));

        System.out.println("All employees:");
        for (Employee e : empDb.listAll()) {
            e.getEmployeeDetails();
            System.out.println();
        }

        System.out.println("Deleting employee with ID 2");
        empDb.deleteEmployee(2);

        System.out.println("All employees after deletion:");
        for (Employee e : empDb.listAll()) {
            e.getEmployeeDetails();
            System.out.println();
        }

        System.out.println(empDb.showPaySlip(1));

        System.out.println("Iterating using ArrayList:");
        Iterator<Employee> iteratorArrayList = empDb.iteratorUsingArrList();
        while (iteratorArrayList.hasNext()) {
            iteratorArrayList.next().getEmployeeDetails();
            System.out.println();
        }

        System.out.println("Iterating using TreeSet:");
        Iterator<Employee> iteratorTreeSet = empDb.iteratorUsingTreeSet();
        while (iteratorTreeSet.hasNext()) {
            iteratorTreeSet.next().getEmployeeDetails();
            System.out.println();
        }
    }
}
