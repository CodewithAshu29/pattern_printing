import java.util.Scanner;

public class Arrays {
    public static void main(String []args){
        
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for(int i=0;i<=n-1;i++) {
//            System.out.println("Provide input for index" + i);
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("You array contains: ");
//        for(int val: arr) {
//            System.out.println(val);
//        }


        int arr[] = {23,46,75,57,86};

//        int n = arr.length;
//        for(int i=0;i<=n-1;i++){
//            System.out.println("THIS IS ARRAY : "+arr[i]);
//        }


        int sum =0;
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
          int value = arr[i]; // harek index per jo value mila usko sum ke ander add kar diya
          sum = sum + value;

        }
        System.out.println("sum of array is : "+sum);
    }
}
