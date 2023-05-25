
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
}
