import java.util.*;
public class Amicablepair {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int s1=0;
        int s2=0;
        for(int i=1;i<=n1/2;i++){
            if(n1%i==0)
                s1+=i;
        }
        for(int i=1;i<=n2/2;i++){
            if(n2%i==0)
                s2+=i;
        }
        if((n1==s2) && (n2==s1))
            System.out.println("Amicable Pair");
        else
            System.out.println("Not a pair");

    }

}
