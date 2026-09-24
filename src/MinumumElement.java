public class MinumumElement {
    public static void main(String[] args) {

        int arr[] = {15, 22, 29, 11, 17};
        int n = arr.length;
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("THE minimum value of array is: " +minValue);
    }
}
