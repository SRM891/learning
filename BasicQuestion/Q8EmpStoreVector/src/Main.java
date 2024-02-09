import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {
    /*
    Write a program that will have a Vector which is capable of storing emp objects. Use an
Iterator and enumeration to list all the elements of the Vector
     */
    public static void main(String[] args) {
        Vector<Employee> emp = new Vector<>();
        emp.add(new Employee(1,"sunny", "Gmail@gmail.com", 'M', 999999));
        emp.add(new Employee(2,"money", "Vmail@gmail.com", 'M', 99));
        emp.add(new Employee(3,"honey", "Pmail@gmail.com", 'M', 9999));

        Iterator<Employee> iterator = emp.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        Enumeration<Employee> e = emp.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}