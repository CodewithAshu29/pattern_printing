public class reversetrangle {

    public static void main(String[] args) {


        int n =4 ;
        for(int row=1;row<=n;row++){
            //for each row --> variable columns
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            // move to next row
            System.out.println();
        }
    }
}
