
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author Eric Paiz
 */
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;
    
   public DoublyLinkedList() {
      head = null;
      tail = null;
   }
   // This creates an array which starts off as empty
   // The head is then assigned as the current node, as well as the index is assigned to 0 (like the head)
   // Then it loops through adding the current node to the current array index, as long as the current node isn't null

   public int[] toArray(){
      int size = 0;
      Node current = head;
      while (current != null){
         size++;
         current = current.next;
      }

      int[] array = new int[size];
      int index = 0;
      current = head;
      while (current != null){
         array[index++] = current.data;
         current = current.next;
      }
      return array;
   }
   // This takes the object you want the index for, starts the count at the head of the D-linked list,
   // assigns the index at 0, and loops through incrementing the index while the current object isn't null
   // until you reach the position of the arrObject, at which point you should have the current index.
   public int indexOf(int arrObj) {
      Node current = head;
      int index = 0;
      while (current != null){
         if (current.data == arrObj){
            return index;
         }
         index++;
         current = current.next;
      }
      return -1;
   }

   public int sumOf(int m) {
      Node current = tail;
      int sum = 0;
      for (int i = 0; i < m; i++){
         sum += current.data;
         current = current.previous;
      }
      return sum;
   }

   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
   }
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
   }
   
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
   }
}
