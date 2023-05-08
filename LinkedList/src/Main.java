

// let's initialize a new class for node
class Node{
    int data;
    Node next;

//    Node(){
//        this.data = next.data;
//        this.next = null;
//    }
}


/**
 * class Node
 * {
 *     int data;
 *     Node next;
 * }
 *
 * public class LinkedList
 * {
 *     public static void main(String args[])
 *     {
 *
 *         Node head, middle, last;
 *
 *         head = new Node();
 *         middle = new Node();
 *         last = new Node();
 *
 *         head.data = 10;
 *         middle.data = 20;
 *         last.data = 30;
 *
 *         head.next = middle;
 *         middle.next = last;
 *         last.next = null;
 *
 *         System.out.println("The LinkedList Elements Are:");
 *
 *         Node temp = head;
 *         while(temp != null)
 *         {
 *             System.out.println(temp.data);
 *             temp = temp.next;
 *         }
 *     }
 * }
 */


public class Main {


    // crate a node for every number
    public static void nodeCreation(){
        // here init the object type of variables
        Node head, middle, last;

        // here creation of objects
        head = new Node();
        middle = new Node();
        last = new Node();

        // here passing the values into data
        head.data = 10;
        middle.data = 20;
        last.data = 30;

        // link the values to one to one

        head.next = middle;
        middle.next = last;
        last.next = null;

        // printing the values
        Node node = head;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }

    }

    // here we need to print the node values
    public static  void nodeValuesPrinting(Node node){
        System.out.println("Printing the node values : ");
        while(node.data != 0){
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        nodeCreation();
    }
}


































