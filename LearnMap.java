package packages.collections;
//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class LearnMap {
    public static void main(String[] args) {
        //Basically in treemap() it sorted in key otherwise same function of hashmap()
        Map<String,Integer> numbers = new TreeMap();
        
       // Map<String,Integer> numbers = new HashMap();
        numbers.put("one", 44);
        numbers.put("two",34);
        numbers.put("three", 23);
        numbers.put("four", 23);
        numbers.put("five", 23);
        System.out.println(numbers);
        numbers.remove("one");
        System.out.println(numbers);
        System.out.println(numbers.containsValue(33));//basically check the value present or not and it is boolean type
       System.out.println(numbers.isEmpty()); // it is also check the empty or not and return boolean type value(true or false)
        numbers.clear();
    }
}
