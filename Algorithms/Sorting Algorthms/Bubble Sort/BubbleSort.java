class BubbleSort{

    public static int [] bubble (int [] arr){

        int n = arr.length;
        for (int i = 0; i<n-1;i++){
            for (int j = 0 ; j <n-1-i; j++){
                if (arr[j] > arr [j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }

        return arr;
    }

    public static void Print(int[] sortedArr){
        for (int i : sortedArr){
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    // //implement algorithm in reverse method

    // public static int [] bubble (int[] arr){
    //     int n = arr.length;
    //     for (int i = n-1; i > 0 ; i-- ){
    //         for ( int j = n-1 ; j>0+(n-i);j--){
    //             if (arr[j]<arr[j-1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1]=temp;

    //             }
    //         }

    //     }
    //     return arr;
    // }

    public static void main(String[] args) {
        
        int array [] = {2,3,4,1,4,6,4,6,8,9,6,10,45};
        
        System.out.print("Old Array    =>  ");
        Print(array);

        System.out.print("Sorted Array =>  ");
        Print(bubble(array));


    }
}