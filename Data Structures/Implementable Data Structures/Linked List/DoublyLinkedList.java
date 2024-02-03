class Node {
    
    Object data ;
    Node next;
    Node prev;

    public Node(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList{
    public static void main(String[] args) {
        
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addTohead(30);
        linkedList.addTohead(10);
        linkedList.addTohead(20);
        linkedList.addTohead(30);
        linkedList.DisplayElements();
        linkedList.addToTail(100);
        linkedList.addToTail(200);
        linkedList.DisplayElements();
        linkedList.deleteFromHead();
        linkedList.DisplayElements();
        linkedList.deleteFromTail();
        linkedList.DisplayElements();
    }

    Node head ;
    Node tail ;

    public boolean isEmpty(){
        return head==null;
    }
    public void addTohead(Object ele){
        Node newHead = new Node(ele);
        if (isEmpty()){
            head = newHead;
            tail = newHead;
        }else{
            newHead.next = head;
            newHead.prev = null;
            head.prev = newHead;
            head = newHead;
        }
    }

    public void DisplayElements (){
        Node temp = head ;
        while (temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTail (Object ele){
        Node newTail = new Node(ele);
        if (isEmpty()){
            head = newTail;
            tail = newTail;
        }else{
            newTail.prev = tail;
            newTail.next = null;
            tail.next = newTail;
            tail = newTail;
        }
    }
    public void deleteFromHead (){
        if (isEmpty()){
            System.out.println("Underflow");
        }else{
            head = head.next;
            head.prev = null;
        }
    }
    public void deleteFromTail(){
        if (isEmpty()){
            System.out.println("UnderFlow");
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }

}
