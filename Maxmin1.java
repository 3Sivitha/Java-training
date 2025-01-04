import java.util.*;
public class Maxmin1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println("Using else if");
        int max=0;
        if(m>n&&m>p){
            max=m;
        }
        else if(n>m&&n>p){
            max=n;

        }
        else{
            max=p;
        }
        System.out.println("Maximum:"+max);
        System.out.println("By using ohly two conditions");
        max=m;
        if(max<n){
            max=n;
        }
        if(max<p){
            max=p;
        }
        System.out.println("Maximum:"+max);
    }
}
