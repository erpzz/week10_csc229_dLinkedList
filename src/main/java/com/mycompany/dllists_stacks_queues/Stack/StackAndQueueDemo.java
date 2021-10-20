
package com.mycompany.dllists_stacks_queues.Stack;

/**
 *
 * @author MoaathAlrajab
 */
public class StackAndQueueDemo {
   public static void main(String[] args) {
      int[] numbers = { 83, 27, 44, 55, 66, 16, 42, 73, 75 };
      
      // Initialize a new Stack and add numbers
      Stack numStack = new Stack();
      for (int number : numbers) {
          numStack.push(number);
      }

      // Output stack
      System.out.print("Stack after initial pushes:   ");
      numStack.print();
      
      // Pop and print, push 99 and print, pop and print again
      numStack.pop();
      System.out.print("Stack after first pop:        ");
      numStack.print();
      numStack.push(99);
      System.out.print("Stack after pushing 99:       ");
      numStack.print();
      numStack.pop();
      System.out.print("Stack after second pop:       ");
      numStack.print();
      
      // Print a blank line before the Queue demo
      System.out.println();
      
      // Initialize a new Queue and add numbers
      Queue numQueue = new Queue();
      for (int number : numbers) {
          numQueue.enqueue(number);
      }

      // Output queue
      System.out.print("Queue after initial enqueues: ");
      numQueue.print();
      
      // Dequeue 83 and print
      numQueue.dequeue();
      System.out.print("Queue after first dequeue:    ");
      numQueue.print();
      
      // Enqueue 99 and print
      numQueue.enqueue(99);
      System.out.print("Queue after enqueueing 99:    ");
      numQueue.print();
      
      // Dequeue 4 and print
      numQueue.dequeue();
      System.out.print("Queue after second dequeue:   ");
      numQueue.print();
   }
}
