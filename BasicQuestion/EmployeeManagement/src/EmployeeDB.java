import java.util.*;
import java.util.Iterator;
public class EmployeeDB {
    private List<Employee> employees;
    private TreeSet<Employee> employeesTreeSet;

    public EmployeeDB() {
        this.employees = new ArrayList<>();
        this.employeesTreeSet = new TreeSet<>();
    }

    public boolean addEmployee(Employee e){
        boolean result = employees.add(e);
        employeesTreeSet.add(e);
        return result;
    }

    public boolean deleteEmployee(int empId){
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee e = iterator.next();
            if (e.getEmpId() == empId){
                iterator.remove();
                employeesTreeSet.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId){
        for(Employee e: employees){
            if(e.getEmpId()==empId){
                return "Payslip for employee "+ e.getName() + " is generated.";
            }
        }
        return "Employee not found.";
    }

    public Employee[] listAll(){
        Employee[] empArray = new Employee[employees.size()];
        employees.toArray(empArray);
        return empArray;
    }

    public Iterator<Employee> iteratorUsingArrList(){
        return employees.iterator();
    }

    public Iterator<Employee> iteratorUsingTreeSet(){
        return employeesTreeSet.iterator();
    }
}
