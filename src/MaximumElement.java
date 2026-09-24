public class MaximumElement {
    public static void main(String[] args) {


        int arr[] = {3, 4, 5, 6, 7};
        int n = arr.length;
        int maxValue = arr[0];

        // compare maxvalue ko array k har element
//        k saath
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > maxValue) {
// update maxValue
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);

    }
}