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
            
    def search(self,loc):
        temp = self.head
        while temp is not None:
            if temp.data == loc:
                return temp
            temp=temp.next
        return -1
            
    def insertAfterNode(self,loc,data):
        if self.search(loc) == -1:
            print(f"Node '{loc}' not existed in the LinkedList")
        else:
            currentNode = self.search(loc)
            newNode = Node(data)
            newNode.next =currentNode.next
            currentNode.next = newNode
            
    def DisplayElementsCount(self):
        count = 0 
        if self.isEmpty():
            print("This list was empty")
        else:
            temp= self.head
            while temp is not None:
                count +=1
                temp= temp.next
            print(f"There are {count} elements in this LinkedList")
            
    def removeAfterNode(self,loc):
        if self.search(loc) == -1:
            print(f"Node '{loc}' not existed in the LinkedList")
        else:
            currentNode = self.search(loc)
            currentNode.next = currentNode.next.next
            
    def removeNode (self, loc):
        if self.search(loc) == -1:
            print(f"Node '{loc}' not existed in the LinkedList")
        else:
            temp= self.head
            while temp is not None:
                if self.head.data == loc:
                    self.removeFromHead()
                    break
                elif temp.next.data == loc:
                    temp.next = temp.next.next
                    break
                temp= temp.next
                    

if __name__ =="__main__" :

    linkedList = SinglyLinkedList()
    linkedList.addToHead(10)
    linkedList.addToHead(20)
    linkedList.addToHead(200)
    linkedList.Display()
    linkedList.addToTail(100)
    linkedList.addToTail(10200)
    linkedList.addToTail(102000)
    linkedList.addToTail(1020)
    linkedList.removeFromHead()
    linkedList.Display()
    linkedList.removeFromTail()
    linkedList.insertAfterNode(100,500)
    linkedList.Display()
    linkedList.removeAfterNode(10)
    linkedList.Display()
    linkedList.DisplayElementsCount()
    linkedList.removeNode(10)
    linkedList.Display()
    


