import java.util.*;
public class AscendingDesending {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int m= sc.nextInt();
            int n=sc.nextInt();
            int p=sc.nextInt();
            int max=0;
            max =Math.max(Math.max(m,n),p);
            //System.out.println(max);
            int min =Math.min(Math.min(m,n),p);
            //System.out.println(min);
            int mid=(m+n+p)-(max+min);
            System.out.println("Ascending Order");
            System.out.println(min+" "+mid+" "+max);
            System.out.println("Desending Order");
            System.out.println(max+" "+mid+" "+min);
        }
    }


