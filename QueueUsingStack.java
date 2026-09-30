import java.util.Stack;

public class QueueUsingStack {
    public static void main(String args[]) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();


        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        System.out.println("Normal Stack from stack1 : ");

        for (int e = stack1.size() - 1; e >= 0; e--) {
            System.out.print(stack2.push(stack1.pop()) + " ");
        }
        System.out.println();

        System.out.println("Queue from Stack from stack2 : ");

        for (int e = stack2.size() - 1; e >= 0; e--) {
            System.out.print(stack2.get(e) + " ");
        }
    }
}