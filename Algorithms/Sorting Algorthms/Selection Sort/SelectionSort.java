class SelectionSort{

    public static void main(String[] args) {
        int array [] = {2,3,4,1,4,6,4,6,8,9,6,10,45};
        System.out.print("Before Sorted -> ");
        printElement(array);

        int sorted [] =  SelectionSorted(array);
        System.out.print("after Sorted -> ");
        printElement(sorted);
    }

    public static int [] SelectionSorted(int arr[] ){
        int n = arr.length; // get number of elements
        for (int i = 0 ; i<n-1 ; i++){
            int currentMin = i;
            for (int j= i+1 ; j<n ; j++){
                if (arr[j] < arr[currentMin]){
                    currentMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[currentMin];
            arr[currentMin] = temp;
        }
        return arr;
    }

    public static void printElement (int arr []){
        for (int i : arr ){
            System.out.print( i + " ");
        }
        System.out.println();
    }


}