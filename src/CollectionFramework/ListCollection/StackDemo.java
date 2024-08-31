package CollectionFramework.ListCollection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack=new Stack<>();
        stack.push("Nilesh");
        stack.push("Shraddha");
        stack.push("10");
        stack.push("50");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println(stack.empty());
        System.out.println(stack.search("Nilesh"));

        stack.forEach(e->{
            System.out.print(e+" ");
        });
    }
}
