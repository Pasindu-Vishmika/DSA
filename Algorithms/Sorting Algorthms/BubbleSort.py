def bubble_sort(array):
    n = len(array)
    for i in range(n):
        for j in range(0, n - i - 1):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]


if __name__ =="__main__":
    array = [5, 11, -7, 0, 1] # unsorted number list
    bubble_sort(array) # call to the function
    print("Sorted array is:", array) # display the list after sort
