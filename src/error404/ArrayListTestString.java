package error404;

import java.util.ArrayList;

public class ArrayListTestString {
    public static void main(String[] args) {

        ArrayList<String>vacationDestinations = new ArrayList<>();

        vacationDestinations.add("Morocco");
        vacationDestinations.add("Italy");
        vacationDestinations.add("Germany");
        vacationDestinations.add("Denmark");
        vacationDestinations.add("Yemen");
        vacationDestinations.add("Hong Kong");
        vacationDestinations.add("Thailand");
        vacationDestinations.add("Malaysia");
        vacationDestinations.add("South Korea");

        System.out.println(vacationDestinations);

        vacationDestinations.remove("Germany");
        System.out.println(vacationDestinations);

        System.out.println(vacationDestinations.get(3));


    }
}
