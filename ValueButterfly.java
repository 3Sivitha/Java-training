import java.util.Scanner;
public class ValueButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Pattern 14-ValueButterfly pattern");
        for (int i = 1; i <= num; i++) {//merge right angled triangle and left angle triangle
            for (int j = 1; j <= i; j++) {
                System.out.print(j);//System.out.print("*");
            }
            int sp = 2 * (num - i);
            for (int s = 1; s <= sp; s++) {//for(int s=1;s<=(num*2  -i;s++)
                System.out.print(" ");
            }

            for (int x = i; x>=1; x--) {
                System.out.print(x);
            }
            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
            //merge its inverted
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            int sp = 2 * (num - i);
            for (int s = 1; s <= sp; s++) {//for(int s=1;s<=num-2;s++)
                System.out.print(" ");
            }
            for (int x = i; x >=1; x--) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}