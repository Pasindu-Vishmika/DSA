class QuickSort{
    public static void main(String[] args) {
        int array [] = {7,6,10,5,9,2,1,15,7};
        int lb = 0;
        int ub = array.length-1; 

        System.out.print("Old array      -> ");
        DisplayElements(array);

        quickSorted (array,lb,ub);
        System.out.print("Sorted array   -> ");
        DisplayElements(array);
    }


    static void DisplayElements(int arr []){
        for(int i : arr){
            System.out.print( i + " ");
        }
        System.out.println();
    }

    static void quickSorted (int arr [] ,int lb, int ub){
        if (lb <ub ){
            int location = partition (arr,lb,ub);
            quickSorted(arr, lb, location-1);
            quickSorted(arr, location+1, ub);
        }
    }

    static int partition (int arr[] ,int lb, int ub){
        int pivot = arr [lb];
        int start = lb;
        int end =ub;

        while (start < end){
            while (arr[start] <= pivot && start <ub){
                ++start;
            }
            while (arr[end]>pivot && end >lb) {
                --end;    
            }
            if (start<end){
                int temp = arr [start];
                arr [start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp2 = pivot;
        arr [lb] = arr[end];
        arr[end] = temp2;
        return end;
    }
}