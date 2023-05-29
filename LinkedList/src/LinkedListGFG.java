import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class NodeGFG{
    int head;
    NodeGFG next;
    NodeGFG(int data){
        head = data;
        next = null;
    }

}


public class LinkedListGFG {
    public static boolean detectLoop(NodeGFG head){
        NodeGFG slowPointer = head, fastPointer = head;

        while(fastPointer != null && fastPointer.next != null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer) return true;
        }
        return false;
    }


    int getNthFromLast(Node head, int n)
    {
        List<Integer> list = new ArrayList<>();
        Node temp = head;

        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.reverse(list);
        if(n <= list.size()){
            return list.get(n-1);
        }
        return -1;
    }



    int getMiddle(Node head)
    {
        // ArrayList<Integer> list = new ArrayList<>();
        // Node temp = head;

        // while(temp != null){
        //     list.add(temp.data);
        //   temp= temp.next;
        // }
        // int total = list.size();
        // if(total/2 != 0)
        //     return total/2;

        // return -1;


        Node slow = head;
        Node fast = head;
        while (fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }



    // reverse the linked List

    Node reverseList(Node head)
    {
        if(head == null || head.next == null) return head;
        return recursive(null, head);
    }
    Node recursive (Node prev, Node cur){
        if(cur == null) return prev;
        Node temp = cur.next;
        cur.next = prev;
        return recursive(cur, temp);
    }

    //Delete without head pointer

    /**
     * You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes. The task is to delete the node. Pointer/ reference to head node is not given.
     * Note: No head reference is given to you. It is guaranteed that the node to be deleted is not a tail node in the linked list.
     * @param del
     */

    void deleteNode(Node del)
    {
        del.data = del.next.data ;
        del.next = del.next.next ;
    }
}

