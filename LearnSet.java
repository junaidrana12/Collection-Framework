package packages.collections;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    // Hashset does not have duplicate value:
    // Hashset deos not have any order:
    public static void main(String[] args) {
       // Set<Integer> set = new HashSet<>(); 
      //  Set<Integer> set = new LinkedHashSet<>();
      // In linkedlisthashset maintain the order where we insert the element
        Set<Integer> set = new TreeSet<>();
        // In TreeSet order will be sorted always 
        // and function will be same HashSet(), LinkedHashSt()and TreeSet() whatever
        set.add(45);
        set.add(466);
        set.add(34);
        set.add(56);
        set.add(45);
        System.out.println(set);
         set.remove(56); // remove element from the set 
         set.contains(45); // check the element that exit or not and it is boolean type(true or false)
         set.isEmpty(); // it is also boolean type and it check set is empty or not
         set.size(); 
         set.clear();// it delete all the element from the set 
    }
}
