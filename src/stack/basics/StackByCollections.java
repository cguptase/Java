package stack.basics;

import java.util.*;

public class StackByCollections {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int n = sc.nextInt();
            stack.push(n);
        }
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
