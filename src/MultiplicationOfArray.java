public class MultiplicationOfArray {


    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,7,8,9,10};
        int mul = 1;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            int value = arr [i];
             mul = mul * value;
        }
        System.out.println("multiplication of array = "+ mul);

    }
}
