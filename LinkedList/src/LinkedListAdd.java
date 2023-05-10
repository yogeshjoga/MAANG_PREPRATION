class NodeAdd{
int data;
NodeAdd next;

}



public class LinkedListAdd {
    NodeAdd head;


    public void addFirst(int val){
        NodeAdd newNode = new NodeAdd();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }

    public void print(){
        NodeAdd temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListAdd list = new LinkedListAdd();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.addFirst(15);
        list.addFirst(16);
        list.addFirst(17);
        list.addFirst(1);

        list.print();
    }
}
