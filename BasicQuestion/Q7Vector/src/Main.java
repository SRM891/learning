import java.util.*;

public class Main {
    /*
    Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is an integer which is passed as a parameter to the
method saveEvenNumbers(). The method should return the ArrayList (A1) created.

In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in step 1, and It should
multiply each number with 2 and display it in format 4,8,12….2*N. and add these
numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.


Create a method printEvenNumber(int N) parameter is a number N. This method should
search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it should
return the Number else return zero.Hint: Use instance variable for storing the ArrayList
A1 and A2. NOTE: You can test the methods using a main method
     */
    public static void main(String[] args) {
        List<Integer> A1 = saveEvenNumbers(100);
        System.out.println("Even number: "+A1);
        printEvenNumbers(A1);
        System.out.println(findNumber(40, A1));
    }
    public static List<Integer> saveEvenNumbers(int n){
        List<Integer> list = new Vector<>();
        for(int i=2; i<=n; i++){
            if(i%2==0) list.add(i);
        }
        return list;
    }

    public static int findNumber(int n, List<Integer> list){
        if(list.contains(n)){
            return n;
        }else {
            return 0;
        }
    }
    public static List<Integer> printEvenNumbers(List<Integer> arr){
        List<Integer> list2 = new Vector<>();
        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()){
            int current = iterator.next()*2;
            list2.add(current);
            if(iterator.hasNext()) {
                System.out.print(current + ", ");
            } else {
                System.out.println(current);
            }
        }
        return list2;
    }
}