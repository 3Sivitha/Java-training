import java.util.*;
public class Datevalid {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        int month=sc.nextInt();
        int date=sc.nextInt();
        if(year>=1900 && year<=9999){
            if(month>=1&&month<=12){
                if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&(date>=1&&date<=31)) {
                    System.out.println("Valid Date");
                }
                else if((date>=1&&date<=28)&& month ==2) {
                    System.out.println("Valid");
                }
                else if((date==29&& month==2)&&(year % 4 ==0 && (year % 100 != 0 || year % 400 == 0))) {
                                System.out.println("Valid!, This is Leap year");
                }
                else if((date>=1&&date<=30)&&(month==4||month==6||month==9||month==11)){
                    System.out.println("valid Date");
                            }
                else{
                    System.out.println("Invalid date");
                }

            }
            else{
                System.out.println("Invalid Month");
            }


        }
        else{
            System.out.println("Invalid Year");
        }

            }
        }



