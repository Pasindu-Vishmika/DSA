import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a Key to find  =>  ");
            int key = sc.nextInt();

            int array [] = {1,2,3,4,5,6,7,8,9,10};

            if (search(key,array) == -1){
                System.out.println(key + " is not found in this array");
            }else{
                System.out.println(key + " found in index number "+ search(key,array));
            }
        }
    }

    public static int search(int key,int arr []){
        for (int i = 0 ; i <arr.length; i++ ){
            if (key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
