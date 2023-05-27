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
}
}
