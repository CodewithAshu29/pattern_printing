public class RehollowTriangle {
    public static void main(String[] args) {

        int n =5;
        for(int row=1;row<=n;row++){
            //for each row -> variable colums
            //spaces
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            //stars
            for(int col=1;col<=2*n-2*row+1;col++){
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }
    }
}
