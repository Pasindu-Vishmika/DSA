class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
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
        linkedList.insertAfter(100, 500);
        linkedList.DisplayElements();
        linkedList.deleteAfter(10);
        linkedList.DisplayElements();
        System.out.println(linkedList.count() + " elements in this linkedList");
    }

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addTohead(int ele) {
        Node newHead = new Node(ele);
        if (isEmpty()) {
            head = newHead;
            tail = newHead;
        } else {
            newHead.next = head;
            newHead.prev = null;
            head.prev = newHead;
            head = newHead;
        }
    }

    public void DisplayElements() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTail(int ele) {
        Node newTail = new Node(ele);
        if (isEmpty()) {
            head = newTail;
            tail = newTail;
        } else {
            newTail.prev = tail;
            newTail.next = null;
            tail.next = newTail;
            tail = newTail;
        }
    }

    public void deleteFromHead() {
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
        }
    }

    public void deleteFromTail() {
        if (isEmpty()) {
            System.out.println("UnderFlow");
        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
            }
        }
    }

    public int count() {
        int count = 0;
        if (isEmpty()) {
            return count;
        } else {
            for (Node temp = head; temp != null; temp = temp.next) {
                count++;
            }
        }
        return count;
    }

    public void insertAfter(int loc, int ele) {
        Node insertNode = new Node(ele);
        Node currentNode = searchNode(loc);
        if (currentNode == null) {
            System.out.println("The node " + loc + " not found");
        } else {
            insertNode.prev = currentNode;
            insertNode.next = currentNode.next;
            if (currentNode.next != null) {
                currentNode.next.prev = insertNode;
            }
            currentNode.next = insertNode;
        }
    }

    public Node searchNode(int loc) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == loc) {
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }
    public void deleteAfter (int loc){
        Node currNode = searchNode(loc);
        if (currNode == null ){
            System.out.println("The node " + loc + " not found");
        }else{
            currNode.next = currNode.next.next;
            currNode.next.next.prev = currNode;
        }
    }
}
