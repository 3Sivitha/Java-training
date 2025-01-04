import java.util.*;
public class Odd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter start and end values");
        int s= sc.nextInt();
        int e= sc.nextInt();
        if(s%2==0){//for even s%2!=0
            s=s+1;
        }
        System.out.println("Odd Numbers");
        for(int i=s;i<=e;i=i+2){
            //if(i%2==0){
                System.out.println(i);
           // }
        }

        }
    }

