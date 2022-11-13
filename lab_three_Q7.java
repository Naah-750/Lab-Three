import java.util.Scanner;
public class lab_three_Q7 {
    public static void main(String[] args) {
        String name;
        double salary;
        double hour;
        double pay=0;
        Scanner in=new Scanner(System.in);
        System.out.println("insert your name ");
        name=in.next();
        System.out.println("insert the Salary ");
        salary=in.nextDouble();
        System.out.println("insert hours worked ");
        hour=in.nextDouble();
        if(hour>40){
            pay=((hour-40)*(1.5*salary)+(40*salary));
        }
        else{
            pay=(hour*salary);
        }
        System.out.println("the name is "+name);
        System.out.println("the salary is "+salary);
        System.out.println("the hours worked by "+hour);
        System.out.println("the pay is "+pay);
    }
}