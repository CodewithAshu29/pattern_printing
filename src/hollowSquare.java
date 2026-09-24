public class hollowSquare {
    public static void main(String[] args) {

        int n =4;

        for (int row=1;row<=n;row++){
            //for each row -> 6 columns
            for(int col=1;col<=6;col++){
                if(row==1 || row==n){
                    System.out.print("* ");
                }
                else{
                    //middle rows
                    if(col==1|| col==6){
                        System.out.print("* ");
                    }
//                    else if(col==6){
//                        System.out.print("* ");
//                    }
                    else {
                        //middle columns
                        System.out.print("  ");
                    }
                }
            }
           //move to next row
            System.out.println();
        }
    }
}
