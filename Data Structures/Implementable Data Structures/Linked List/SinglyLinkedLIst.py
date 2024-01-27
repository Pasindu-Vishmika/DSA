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
            
    def addToTail(self, data):
        newTail = Node(data)
        if self.head is None:
            self.head = newTail
            self.tail = newTail
        else:
            self.tail.next = newTail
            self.tail = newTail
    
    def removeFromTail(self):
        if self.head is None:
            print("Underflow")
        else:
            temp = self.head
            while temp.next.next is not None:
                temp= temp.next
            prevTail = temp
            prevTail.next = None
            self.tail = prevTail

if __name__ =="__main__" :

    linkedList = SinglyLinkedList()
    linkedList.addToHead(10)
    linkedList.addToHead(20)
    linkedList.addToHead(200)
    linkedList.Display()
    linkedList.addToTail(100)
    linkedList.addToTail(1020)
    linkedList.removeFromHead()
    linkedList.Display()
    linkedList.removeFromTail()
    linkedList.Display()


