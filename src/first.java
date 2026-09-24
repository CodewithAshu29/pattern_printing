import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        int n = 6;

        for(int row=1; row<=n; row++){
            for(int col=1; col<=4; col++){
            //star
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }
    }

}
