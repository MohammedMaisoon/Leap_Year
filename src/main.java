import java.util.Scanner;
public class main {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
             System.out.println("Year " + year + " is a leap year");
         }
         else{
            System.out.println("Year " + year + " is not a leap year");
    }
    }
}


