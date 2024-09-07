package stack.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class StackByArrayList {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.print("Enter size: ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
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