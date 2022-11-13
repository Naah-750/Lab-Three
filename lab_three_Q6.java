import java.util.Scanner;
public class lab_three_Q6 {
    public static void main(String[] args) {
        String season="";
        int day;
        int month;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the month");
        month=in.nextInt();
        System.out.println("enter the day ");
        day=in.nextInt();
        if (month==1 || month==2 || month==3){
            season ="Winter";
        }
        else if (month==4 || month==5 || month==6 ){
            season="Spring";
        } else if (month==7 || month==8 ||month==9 ) {
            season="Summer";
        } else if (month==10 || month==11 ||month==12) {
            season="Fall";}
        if(month%3==0 && day>=21){
            if(season == "Winter")
                season="Spring";
            else if (season=="Spring")
                season="Summer";
            else if (season=="Summer")
                season="Fall";
            else
                season="Winter";
        }
        System.out.println(season);
        System.out.println("thank u");
    }
}
