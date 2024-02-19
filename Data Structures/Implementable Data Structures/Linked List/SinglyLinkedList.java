class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data ;
        this.next = null;
    }

    public Node (int data, Node next){
        this.data = data;
        this.next = next;

    }
}

public class SinglyLinkedList {
    Node head ;
    Node tail ;

    public boolean isEmpty (){
        return head == null ; 
    }

    public void addToHead(int elements){
        Node newHead = new Node(elements);
        if (isEmpty()){
            head = newHead;
            tail = newHead; 
        }else {
            newHead.next = head;
            head = newHead;
        }  
    }
    

    public void addToTail (int elements){
        Node newTail = new Node(elements);
        if (isEmpty()){
            head = newTail;
            tail = newTail;
        }else {
            tail.next = newTail;
            tail = newTail;
        }
    }

    public void printElement (){
        if (isEmpty()){
            System.out.println("Undeflow");
        }else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        SinglyLinkedList LinkedList = new SinglyLinkedList();
        LinkedList.addToHead(10);
        LinkedList.addToHead(100);
        LinkedList.printElement();
        LinkedList.addToTail(1000);
        LinkedList.printElement();
    }
}
