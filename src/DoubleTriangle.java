public class DoubleTriangle {
    public static void main(String[] args) {
        int n=4;

        for(int row=1; row<=n; row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("   ");
            }
            for(int col=1;col<=2*row;col++){
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }

        //int n=4;
        for(int row=1;row<=n;row++){
            for(int col=1;col<row-1;col++){
                System.out.print("  ");
            }
        }
    }
}
