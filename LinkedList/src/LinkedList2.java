/**
 * @yogesh_joga
 * Node2 is the difined class for fetching data
 */
class Node2{
    int data;
    Node2 next;
}
public class LinkedList2 {
    Node2 head;
    public void addNodeval(int val){
        // create a new node object for fetching a data
        Node2 node2 = new Node2();
        // assigning the val  into data,
        node2.data = val;

        // Link the val into next data val
        node2.next = head;

        // once check the flow of this object
        head = node2;
    }

    public void printingLinkedList2(){
        Node2 temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        // creation object
        LinkedList2 list = new LinkedList2();
        // passing one by one value and, adding one by one value
        list.addNodeval(8);
        list.addNodeval(9);
        list.addNodeval(10);
        list.addNodeval(11);

        /**
         * which value is the last added into the
         * list it will print 1st, why because it is the head of the linked list
         */
        list.printingLinkedList2();

    }
}
