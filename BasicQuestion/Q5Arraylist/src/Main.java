import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    Create an ArrayList of Employee( id,name,address,sal) objects and search for particular
Employee object based on id number
     */
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ram", "India", 9999999));
        list.add(new Employee(2, "Shyam", "Indiana", 9999));
        list.add(new Employee(3, "Raman", "Indigo", 999));

        for (Employee e: list){
            if(e.getId()==3){
                System.out.println(e);
            }
        }

        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()){
            Employee e = iterator.next();
            if(e.getId()==2){
                System.out.println(e);
            }
        }
    }
}