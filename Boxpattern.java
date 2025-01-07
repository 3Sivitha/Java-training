import java.util.*;
public class Boxpattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int num=n*2-1;
        System.out.println("Pattern 12 -Box pattern");
        for(i=1;i<=(num);i++){
            for(j=1;j<=(num);j++){
                if(i==1||j==1 || i==num|| j==num|| i==j ||j==num-i+1){
                    System.out.print("*");
                }
//                else if(i==j||j==num-(i-1)){
//                    System.out.print("*");
//                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
