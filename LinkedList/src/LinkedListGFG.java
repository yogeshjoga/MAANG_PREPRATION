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


    /***
     * Given a linked list of 0s, 1s and 2s, sort it.
     * EasyAccuracy: 60.75%Submissions: 111K+Points: 2
     * Join the most popular course on DSA. Master Skills & Become Employable by enrolling today!
     *
     * Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only.
     * The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side,
     * 2s at the end of the linked list, and 1s in the mid of 0s and 2s.
     *
     * Example 1:
     *
     * Input:
     * N = 8
     * value[] = {1,2,2,1,2,0,2,2}
     * Output: 0 1 1 2 2 2 2 2
     * Explanation: All the 0s are segregated
     * to the left end of the linked list,
     * 2s to the right end of the list, and
     * 1s in between.
     * Example 2:
     *
     * Input:
     * N = 4
     * value[] = {2,2,0,1}
     * Output: 0 1 2 2
     * Explanation: After arranging all the
     * 0s,1s and 2s in the given format,
     * the output will be 0 1 2 2.
     * @param head
     * @return
     */
    static Node segregate(Node head)
    {
        if(head == null || head.next == null) return head;

        int[] frequency = new int[3];

        Node currNode = head;

        while(currNode != null){
            frequency [currNode.data]++;
            currNode = currNode.next;
        }

        int j = 0;
        currNode =head;
        for(int i= 0; i< 3; i++){
            while(frequency [i] > 0){
                currNode.data =i;
                j++;
                frequency[i]--;
                currNode = currNode.next;
            }
        }
        return head;
    }
}

