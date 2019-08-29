package error404;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(16);
        numbers.add(345);
        numbers.add(3);
        numbers.add(43);
        numbers.add(21);

        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);

        System.out.println(numbers.get(3));

        for (int i = 0; i <numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
