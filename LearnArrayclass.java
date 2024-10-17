package packages.collections;
import java.util.Arrays;
public class LearnArrayclass {
    public static void main(String[] args) {
       // int [] numbers = {23,44,67,89,90,97,99};
       // int index = Arrays.binarySearch(numbers,44);
       // System.out.println("the index of element 44 in the array" + index);
    
       Integer[]numbers = {23,45,6,77,865,44,33,55};
       Arrays.sort(numbers);//it is used for sorted array 
       for(int i:numbers){
        System.out.println(i+"");
       }
    
    
    }
}
 