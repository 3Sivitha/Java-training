import java.util.*;
import java.math.*;
public class Primenumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=(int)Math.sqrt(num);i++){//square root used to reduce the iteration
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("Not a Prime");
        else
            System.out.println("Prime");
        System.out.println("Enter range:");
        int s= sc.nextInt();
        int e= sc.nextInt();

        for(int i=s;i<=e;i++){
            boolean f=true;
            for(int j=2;j<=(int)(Math.sqrt(i));j++){
                if(i%j==0){
                    f=false;
                    break;
                }
            }
            if(f)
                System.out.println(i);

        }

    }

}
