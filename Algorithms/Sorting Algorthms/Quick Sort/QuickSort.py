class QuickSort:
    
    def displayArray(self,arr):
        for i in arr:
            print(i ,end =" ")
        print()
        
    def quickSort(self,arr ,lb,ub):
        if lb<ub:
            location = self.partition(arr,lb,ub)
            self.quickSort(arr ,lb,location-1)
            self.quickSort(arr,location+1 ,ub)
            
    def partition (self,arr,lb,ub):
        start = lb
        end = ub
        pivot = arr[lb]
        
        while start < end :
            while arr[start] <=pivot and start <ub:
                start +=1
            while arr[end] > pivot and end >lb:
                end -=1
            if start < end :
                temp = arr[start]
                arr [start] = arr[end]
                arr[end] = temp
        temp2 = pivot
        arr[lb]=arr[end]
        arr[end] = temp2
        return end

if __name__=="__main__":
    
    QSort = QuickSort()
    array = [7,6,10,5,9,2,1,15,7]
    lb =0
    ub = len(array)-1
    
    print("old array    ->  " ,end="")
    QSort.displayArray(array)
    
    QSort.quickSort(array,lb,ub)
    print("sorted array ->  ",end="")
    QSort.displayArray(array)