package packages.collections;

import java.util.Stack;

public class Learnstack {
    public static void main(String[] args) {
        Stack <String> animals = new Stack<>();
        animals.push("dog");
        animals.push("lion");
        animals.push("cat");
        animals.push("horse");
        animals.push("monkey");
        animals.push("ass");
        System.out.println("stack:" +animals);

        System.out.println(animals.peek());// it basically return top of the stack
        animals.pop();//it basically delete the top of stack;
       System.out.println(animals.peek());

    }
}
