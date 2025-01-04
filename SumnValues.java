import java.util.*;
public class SumnValues {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter start:");
//        int a= sc.nextInt();
        System.out.println("Enter n numbers");
        int n=sc.nextInt();
        int sum=0;
        int sumeven=0;
        int sumodd=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            if(i%2==0){
                sumeven+=1;//sumeven=sumeven+i;
            }
            else{
                sumodd+=1;//sumodd=sumodd+i;
            }
        }
        System.out.println("Sum of n numbers:"+sum);
        System.out.println("Sum of n even numbers:"+sumeven);
        System.out.println("Sum of n odd numbers:"+sumodd);

    }
}
