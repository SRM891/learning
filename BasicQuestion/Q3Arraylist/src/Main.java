import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    Create an ArrayList which will be able to store only Strings. Create a printAll method
which will print all the elements using an Iterator.
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        printAll(list);
    }

    public static void printAll(List<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}