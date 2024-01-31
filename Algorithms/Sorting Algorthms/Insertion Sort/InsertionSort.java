public class InsertionSort {
    
    public static void main(String[] args) {
        int array [] = {2,4,1,6,5,7,9,4,90,235,642,46};

        System.out.print("old array    -> ");
        printArray(array);

        int [] Sorted = InSort(array);
        System.out.print("sorted array -> ");
        printArray(Sorted);
    }

    public static int[] InSort (int arr []){
        int n = arr.length;
        for( int i=  1; i<n ; i++ ){
            int j = i-1;
            int currenMin = arr[i];
            while (j>=0 && arr[j] > currenMin ){
                arr[j+1] = arr[j]; // swap
                j--;
            }
            arr[j+1] = currenMin;
        }
        return arr.clone();
    }

    public static void printArray (int arr[]){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
