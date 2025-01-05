import java.util.*;
public class KthFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = n;
        int c = 1;
//        if (k == 1) {
//            max = n;
//            //min=1;
//        }
        for (int i = n / 2; i >= 1; i--) {//5
            if (n % i == 0) {
                c++;
                if (c == k) {//1==1-1=0
                    max = i;
                    break;
                }
            }
        }
       System.out.println("Maximum:" + max);
//        c=0;
//        int min = 1;
//        if (k == 1) {
//            min = 1;
//        }
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                c++;
//                if (n == k) {
//                    min = i;
//                }
//            }
//        }
//        System.out.println("Minimum:" + min);
    }
}
