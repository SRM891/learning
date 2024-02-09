import java.util.ArrayList;

class NumberArrayList<T extends Number> {
    private ArrayList<T> numbers;

    public NumberArrayList() {
        numbers = new ArrayList<>();
    }

    public void add(T number) {
        numbers.add(number);
    }

    public T get(int index) {
        return numbers.get(index);
    }

    // You can add more methods as needed
}

public class Main {
    public static void main(String[] args) {
        NumberArrayList<Integer> intList = new NumberArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println(intList.get(0));

        NumberArrayList<Double> doubleList = new NumberArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);
        System.out.println(doubleList.get(1));
    }
}
