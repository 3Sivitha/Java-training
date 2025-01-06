import java.util.*;
public class Patterns {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Pattern 1-Right angle triangle");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 2-Inverted");
        int k,m;
        for(k=num;k>=1;k--){
            for(m=1;m<=k;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 3-Mirror pattern");
        for(k=1;k<=num;k++){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=k;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 4-Pyramid");
        for(k=1;k<=num;k++){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=k;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pattern 5-Inverted mirror pattern");
        for(k=num;k>=1;k--){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=k;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 6 Actual pyramid pattern");
        //n=5; row=n=5; col=n*2-1=5*2-1;
        for(k=1;k<=num;k++){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=(k*2-1);m++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 7 inverted pyramid pattern");
        //n=5; row=n=5; col=n*2-1=5*2-1;
        for(k=num;k>=1;k--){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=(k*2-1);m++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 8 diamond pattern");
        //n=5; row=n=5; col=n*2-1=5*2-1;
        for(k=1;k<=num;k++){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=(k*2-1);m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(k=num-1;k>=1;k--){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=(k*2-1);m++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 9 inverted pyramid + pyramid pattern");
        //n=5; row=n=5; col=n*2-1=5*2-1;
        for(k=num;k>=1;k--){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=(k*2-1);m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(k=2;k<=num;k++){
            for(int sp=1;sp<=num-k;sp++){
                System.out.print(" ");
            }
            for(m=1;m<=(k*2-1);m++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern 10-Hologram pattern");
        for(int i=1;i<=num;i++){
            if(i==1||i==num){
                for(int j=1;j<=num;j++){
                    System.out.print("* ");//System.out.print("*")
                }
            }
            else{
                System.out.print("*");
                for(int s=1;s<=num+1;s++){//for(int s=1;s<=num-2;s++)
                    System.out.print(" ");
                }
                System.out.print(" *");
            }
            System.out.println();


        }

    }
}
