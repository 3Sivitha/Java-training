import java.util.Scanner;
public class Noddnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end values");
        int s= sc.nextInt();
        int e= sc.nextInt();
        int n = sc.nextInt();
        //int count=0 -->method 1
        if (s%2==0){
            s=s+1;
        }
        System.out.println("n Odd  Numbers");
        for (int i = s,count=0; i<=e&&count<n; i=i+2) { // <-- method 2
//            if(count==n) { -->method1
//                break;
//            }
                System.out.println(i);
                count++;

            //if(i%2==0){

            // }
        }
    }
}
