package packages.collections;
 import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


      /*  list.add(35);
        list.add(45);
        list.add(65);
        list.add(56);

        list.add(43);
        System.out.println(list);
        list.add(2,89);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(134);
        list.addAll(newList); // this will add all the element in newlist  
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(4); //remove the element from the list of that index
        System.out.println(list);
        list.remove(Integer.valueOf(89));// this is also remove the element if value exist in list;
        System.out.println(list);
        list.clear();// this will remove all the element from the list
        list.set(2, 788); // it baically change the value of that index and it time complexity O(1)
        list.contains(50);// check the element present or not  in the list and it will give true or false 
        //and its time complexity O(n)
        */

     list.add(34);
     list.add(45);
     list.add(23);
     list.add(46);
     list.add(66);
     list.add(55);
     list.add(78);
    System.out.println(list);
// these are three method to iterate
    for(int i=0;i<list.size();i++){ // using for loop
        System.out.println("the element is" + list.get(i));
    }
    for(Integer element : list){// using foreach loop
        System.out.println("foreach  elemment is" + element);
    }
    Iterator<Integer> it =  list.iterator(); //using iterator
    while(it.hasNext()){ // hasNext method basically tells that next element 
        System.out.println("iterator" + it.next());
    }
    
    }
}
