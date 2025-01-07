import java.util.*;
public class Zeroone {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Pattern 15-zeroone");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
        System.out.println("Method 2");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i%2!=0)&&(j%2!=0))
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
        System.out.println("Pattern 16");
        int s=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

            }
        }
    }
}
