package WK2.D3;
import java.util.ArrayDeque;
class StackDeque
    
    {
        public static void main(String[] args) {
    
             //Creates a stack of integers
            ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
    
            //Pushes some integers into the stack
            stack.push(2);
            stack.push(5);
            stack.push(6);
    
            //Peeks into the stack
            System.out.println("Current element at the top of the stack: " + stack.peek());
    
            //Pops one integer from the stack
            System.out.println("Element popped from the stack: " + stack.pop());
    
            //Iterates through the stack
            System.out.print("Current elements in the stack: ");
            while(!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
    
        }
    }