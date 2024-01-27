class Node:
    def __init__(self,data,next=None):
        self.data = data
        self.next = next

class SinglyLinkedList:
    head = None
    tail = None

    def isEmpty(self):
        if self.head is None :
            return True
    
    def addToHead(self,data):
        newHead = Node(data) 
        if self.isEmpty():
            self.head = newHead
            self.tail = newHead
        else:
            newHead.next = self.head
            self.head = newHead 

    def Display (self):
        if self.isEmpty():
            print("This LinkedList was Empty")
        else:
            temp = self.head
            while temp is not None :
                print (temp.data , end=" ")
                temp=temp.next
        print()
    
    def removeFromHead(self):
        if self.head is None:
            print("Underflow")
        else:
            self.head = self.head.next

if __name__ =="__main__" :

    linkedList = SinglyLinkedList()
    linkedList.addToHead(10)
    linkedList.addToHead(20)
    linkedList.addToHead(200)
    linkedList.Display()
    linkedList.removeFromHead()
    linkedList.Display()


