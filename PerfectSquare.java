import java.util.*;

public class PerfectSquare {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int s=(int)Math.sqrt(n);
        if(s*s==n)
        {
            System.out.println("Perfect Square");
        }
        else
        {
            System.out.println("Not a Perfect Square");
        }
        //Method:2
        int i;
        for(i=1;i*i<n;i++);
        if(i*i==n){
            System.out.println("Square");
        }
        else{
            System.out.println("Not");
        }
        //stop when it become i*i>n
    }


}

