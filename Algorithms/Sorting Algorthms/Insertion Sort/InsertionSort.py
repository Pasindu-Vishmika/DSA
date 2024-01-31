class InsertionSort:
    
    def printArray(self, arr):
        for i in arr:
            print(i, end=" ")
        print()
        
    def inSort(self, arr):
        n = len(arr)
        for i in range(1, n):
            currentMin = arr[i]
            j = i - 1
            while j >= 0 and arr[j] > currentMin:
                arr[j + 1] = arr[j]
                j -= 1
            arr[j + 1] = currentMin
        return arr 
  
if __name__ == "__main__":
    
    insertObj = InsertionSort()
    array = [2, 4, 5, 32, 56, 82, 11, 0, 75, 323, 5245, 74]
    
    print("Old array    -> ", end="")
    insertObj.printArray(array)
    
    SortedArray = insertObj.inSort(array)
    print("Sorted array -> ", end="")
    insertObj.printArray(SortedArray)