import java.util.*;
import java.math.*;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("ARMORNOT");
        int arm=n;
        int rev=0,rem,rc,sum=0,count=0;
        for(int i=n;i>=1;i=i/10)//123->123/10->12->12/10->1->1/10->0
            count+=1;
        while(n!=0){
           rem=n%10;
           rev=(rev*10)+rem;//5-->54-->543-->5432-->54321
           rc=(int)Math.pow(rem,count);
           sum+=rc;
           n=n/10;
        }
        if(arm==sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
        System.out.println("Reversed num: "+rev);
    }
}
