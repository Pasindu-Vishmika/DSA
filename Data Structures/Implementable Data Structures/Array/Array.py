array = []

def addElementToEnd( ele ):
    array.append(ele)

def addElementToBegining( ele ):
    array.insert( 0,ele )

def DisplayElements():

    if array ==[]:
        print("This array was empty")
    else:
        for i in array:
            print(i , end = " ")
    print()

def removeElement(ele):
    if ele in array:
        array.remove(ele)
    else:
        print(f"'{ele}' not in Array")

if __name__=="__main__":
    addElementToBegining(10)
    addElementToBegining(20)
    addElementToEnd(30)
    DisplayElements()
    removeElement(10)
    DisplayElements()