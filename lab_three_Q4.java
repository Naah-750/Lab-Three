import java.util.Scanner;
public class lab_three_Q4 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner in=new Scanner(System.in);
        System.out.println("insert three Integer ");
        x=in.nextInt();y=in.nextInt();z=in.nextInt();
        if (x<y && y<z){
            System.out.println("increasing ");
        } else if (x>y && y>z) {
            System.out.println("decreasing ");
        }
        else
            System.out.println("neither");
        System.out.println("thank u");
    }
}