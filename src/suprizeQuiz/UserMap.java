package suprizeQuiz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMap {
    public static void main(String[] args) {
        Map<Integer,String> Map = new HashMap<>();
        Map.put(10, "Sanna");
        Map.put(20, "Taiz");
        Map.put(30, "Ibn");
        Map.put(40, "Aden");

        Map<String, List<String>> list = new HashMap<String, List<String>>();

        for (Map.Entry<Integer, String>entry : Map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
