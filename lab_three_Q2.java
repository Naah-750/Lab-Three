import java.util.Scanner;
public class lab_three_Q2 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("insert num: ");
        x = input.nextInt();
        if(x > 0 )
            System.out.println("the num is poisitve ");
        else if ( x< 0)
            System.out.println("the num is negitive ") ;
        else
            System.out.println("the num is zero ");
            System.out.println("thank u");
    }
}
