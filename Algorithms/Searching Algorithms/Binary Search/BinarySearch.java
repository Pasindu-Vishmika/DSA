import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] = { 1,2,3,4,5,6,7,8,9,10} ;
        System.out.print("enter key to find => ");
        int key = sc.nextInt();

        if (Bsearch ( key ,array) == -1){
            System.out.println("Key Not found.");
        }else{
            System.out.println("key founded in " + Bsearch(key,array));
        }

    }
    public static int Bsearch(int key , int arr []){
        int lb = 0;
        int ub = arr.length-1;
        while (lb<=ub){
            int mid = (lb+ub )/2;
            if (arr[mid] == key){
                return mid;

            }else if ( arr[mid] < key) {
                lb = mid+1;
                
            }else{
                ub = mid = 1;
            }
        }
        return -1;
    }
}
