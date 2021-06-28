package WK1.D7;

import java.util.LinkedList;
import java.util.List;

class LinkedQueue<E> {

    private class Node<E> {
      E value;
      Node<E> next;
  
      Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
      }
    }
   
    private int count;
    private Node<E> front;
    private Node<E> rear;
  
    public LinkedQueue() {
       front = rear = null;
       count = 0;
    }
  
     public void enqueue(E value) {
          if (rear != null) {
              rear.next = new Node(value, null);
              rear = rear.next;
          } else {
              rear = new Node(value, null);
              front = rear;
          }
          count++;
      }
      
       public E dequeue() {
          if (isEmpty()) {
              throw new IllegalStateException("Cannot dequeue - Queue is empty");
          }
  
          E value = front.value;
          front = front.next;
          count--;
  
          if (front == null) {
              rear = null;
          }
  
          return value;
      }
      
  
  public boolean isEmpty() {
          return front == null;
      }
     
  public E peek() {
          return front.value;
      }
  
   public int size() {
          return count;
      }
      
  }

  public class queue {

    public static void main(String[] args) {
            // Create a queue of strings.
            LinkedQueue linkedQueue = new LinkedQueue();
            
            // Add two strings to the queue.
            linkedQueue.enqueue("A");
            linkedQueue.enqueue("B");
            
            // Print the size of the queue, which is 2.
            System.out.println(linkedQueue.size());
            
            //Remove an element fron the queue. This will print the first element which is A.
            System.out.println(linkedQueue.dequeue());
            
            //Check the next element in the queue without removing. Prints B.
            System.out.println(linkedQueue.peek());
            
            // Print the size of the queue. Prints 1 as the queue contains one string - B.
            System.out.println(linkedQueue.size());
       
    }
}
