import java.util.*;
public class Exponent {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base and Exponent:");
        int b=sc.nextInt();
        int e=sc.nextInt();
        int pow=1;
        for(int i =1;i<=e;i++){
//            if(e==0){
//               pow=1;
//                break;
//            }
            pow*=b;
        }
        System.out.println("Optimized power:"+pow);
        System.out.println("Enter base and Exponent:");
        int a=sc.nextInt();
        int c=sc.nextInt();
        int m= (int)Math.pow(a,c);
        System.out.println("Function power:"+m);
//        if(true);
//        {
//            System.out.println("hello");
//        }
//        System.out.println("World");
//        int num=5;
//        if(num++ !=0 && num++!=0 && num--!=0){
//            System.out.println(num);
        }
    }
}
