import java.util.*;
import java.math.*;
public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        //System.out.println("Automorphic Number or not");
        int sq=n*n;//5*5
        int rem,s=0;
        boolean flag=false;
        while(sq>0){
            rem=sq%10;//625%10=5
            s=rem;
            if(n==s) {
                flag = true;
                break;
            }
            else{

            }
            sq=sq/10;
        }
        if(flag)
            System.out.println("Automorphic");
        else
            System.out.println("Not");
        }

    }

