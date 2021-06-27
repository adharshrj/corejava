package srmb2corejava.WK1.D7;
import java.util.Stack;

class stack{
    public static void main(String a[]) {
        Stack<String> stack1= new Stack<String>();

        stack1.push("This stack a");
        stack1.push("This stack b");
        stack1.push("This stack C");
        System.out.println(stack1);

        stack1.pop();
        System.out.println("Stack1 pop" +stack1);
    }
    
}
