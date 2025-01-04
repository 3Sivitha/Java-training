import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char op=sc.next().charAt(0);
        int b= sc.nextInt();
        switch(op){
            case '+':
                System.out.println("Add:"+(a+b));
                break;
            case '-':
                System.out.println("Sub:"+(a-b));
                break;
            case '*':
                System.out.println("Mul:"+(a*b));
                break;
            case '/':
                System.out.println("Div:"+(a/b));
                break;
            case '%':
                System.out.println("Mod:"+(a%b));
                break;
            default:
                System.out.println("Invalid operator");
                break;

        }
    }
}
