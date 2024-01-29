class Node {
    Object data;
    Node next;

    public Node (Object data){
        this.data = data ;
        this.next = null;
    }

    public Node (Object data, Node next){
        this.data = data;
        this.next = next;

    }
}

class SinglyLinkedList {
    Node head ;
    Node tail ;

    public boolean isEmpty (){
        return head == null ; 
    }

    public void addToHead (Object elements){
        Node newHead = new Node(elements);
        if (isEmpty()){
            head = newHead;
            tail = newHead; 
        }else {
            newHead.next = head;
            head = newHead;
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
        LinkedList.addToHead("abc");
        LinkedList.addToHead(100);
        LinkedList.printElement();
    }
}
