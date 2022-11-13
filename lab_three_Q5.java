import java.util.Scanner;
public class lab_three_Q5 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner in=new Scanner(System.in);
        System.out.println("insert three num");
        x=in.nextInt();y=in.nextInt();z=in.nextInt();
        if (x>y && y>z)
            System.out.println("inside the order");
        else if (x<y && y<z) {
            System.out.println("inside the order");
        }
        else
            System.out.println("otherwise");
        System.out.println("thank u");
    }
}