import java.util.*;
public class PracticePattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("P1");
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
        System.out.println("P2");
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++)
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                if(i>1&&j!=i)
                    System.out.print(ch+" ");
                else
                    System.out.print(" "+ch);
            }
            ch++;
            System.out.println();
        }
    }
}
