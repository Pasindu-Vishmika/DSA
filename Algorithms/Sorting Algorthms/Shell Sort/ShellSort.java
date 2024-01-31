public class ShellSort {
    
    public static void main(String[] args) {
        int array [] = {2,4,53,2,1,54,74,2325,74,23,1,57};

        System.out.print("Old array    ->  ");
        printArray(array);

        System.out.print("Sorted array ->  ");
        printArray(ShellSorted(array));
    }

    static void printArray (int arr[]){
        for(int i : arr){
            System.out.print( i + " ");
        }
        System.out.println();
    }

    static int [] ShellSorted (int arr []){
        int n = arr.length;
        for (int gap = n/2 ; gap >0 ; gap=gap/2 ){ 
            for (int j = gap ;j<n ; j++){
                for(int i = j-gap ; i>=0 ; i = i-gap){

                    if (arr[i]>arr[i+gap]){
                        int temp = arr[i+gap];
                          arr[i+gap] = arr[i];
                          arr[i] = temp;
                    }else{
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
