//Find the sum of n natural numbers skip the multiples of 4
import java.util.*;
public class Sumnvalueskipfour {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n number");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%4==0)
                continue;
            sum+=i;
        }

        System.out.println("Sum:"+sum);

    }
}
