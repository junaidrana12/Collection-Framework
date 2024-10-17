package packages.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(56);
        list.add(55);
        list.add(43);
        list.add(22);
        list.add(12);
        list.add(22);
        System.out.println(list);
        System.out.println("min element" + Collections.min(list));
        System.out.println("max element" + Collections.max(list));
        System.out.println("frequency of this number" + Collections.frequency(list,22));
         Collections.sort(list);
         System.out.println(list);
         Collections.sort(list,Comparator.reverseOrder());
         System.out.println(list);
         //basically collections clsses directly provided the mathod like min element,max and frequency in  an array 
    }
}
