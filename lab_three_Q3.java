import java.util.Scanner;
public class lab_three_Q3 {
    public static void main(String[] args) {
        int[] x = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("insert num :");
            x[i] = input.nextInt();
        }
        if (x[0] == x[1] && x[1] == x[2])
            System.out.println("same");
        else if (x[0] != x[1] && x[1] != x[2])
            System.out.println("diffrent");
        else
            System.out.println("no one");
        System.out.println("thank u");
    }
    }