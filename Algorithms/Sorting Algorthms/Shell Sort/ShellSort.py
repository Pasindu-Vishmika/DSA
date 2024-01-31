class ShellSort:
    
    def printArray(self,arr:list)->None:
        for i in arr:
            print(i ,end=" ")
        print()
        
    def ShelSorted (self , arr:list)->list:
        n = len(arr)
        gap = n//2
        while gap >0:
            for j in range (gap , n ):
                i =j -gap
                while i >=0:
                    if arr[i]>arr[i+gap]:
                        temp = arr[i]
                        arr[i] = arr [i+gap]
                        arr[i+gap] = temp
                    else:
                        break 
                    i-=gap
            gap //=2
        return arr
    
if __name__ == "__main__":
    ShellObj = ShellSort ()
    array = [2,4,53,2,1,54,74,2325,74,23,1,57]
    
    print("old array    ->  ",end="")
    ShellObj.printArray(array)
    
    print("sorted array ->  ",end="")
    ShellObj.printArray(ShellObj.ShelSorted(array))
            