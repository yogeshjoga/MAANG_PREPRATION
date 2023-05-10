/**
 * @LinkedList -- outer class for the
 */
class Node1{
    int data;
    Node1 next;
}

public class LinkedListIntro {

    Node1 first, sec, thr, four,fiv,six,seven;
    public void nodeValue(){
        // Node first, sec, thr, four,fiv,six,seven;
        first = new Node1();
        sec = new Node1();
        thr = new Node1();
        four = new Node1();
        fiv = new Node1();
        six = new Node1();
        seven = new Node1();

        first.data = 10;
        sec.data = 20;
        thr.data = 30;
        four.data =40;
        fiv.data = 50;
        six.data = 60;
        seven.data =70;

        first.next = sec;
        sec.next = thr;
        thr.next =four;
        four.next = fiv;
        fiv.next = six;
        six.next = seven;
        seven.next = null;

    }

    public  void printingLinkedList(){
    //    nodeValue();
        addNodeIntoHead(100);
        addNodeIntoHead(101);
        addNodeIntoHead(102);
        addNodeIntoHead(103);
        addNodeIntoHead(104);
        addNodeIntoHead(105);


        Node1 temp = first;
        while(temp != null){
            System.out.println(temp.data);
          temp  =  temp.next;
        }
    }

    public void addNodeIntoHead(int val){
        Node1 node = new Node1();
        node.data = val;
        node.next = first;
        first = node.next;

    }


    public static void main(String[] args) {
        LinkedListIntro list = new LinkedListIntro();
        list.nodeValue(); // function calling
        list.printingLinkedList();
    }



}
