import java.util.*;

public class Factor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int sum=0;
        System.out.println("Factors");
        for(int i=1;i<=num/2;i++){
//            if(num/2==i){
//                System.out.print(num);
//                break;
//            }
            if(num%i==0){
                count+=1;
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println(num);
        System.out.println("Count:"+(int)(count+1));
        System.out.println("Sum:"+(int)(sum+num));
    }
}
