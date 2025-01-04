import java.util.*;
public class Daysinweek {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int dn=sc.nextInt();

        switch (dn){//It is based on lookup table
            case 1://Label
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");
                break;

        }
    }
}
