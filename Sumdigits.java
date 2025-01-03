import java.util.*;
public class Sumdigits
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int r=a%9;
		if(r==0){
		    System.out.println("Sum:9");
		    		}
		else{
		    System.out.println("Sum:"+r);
		}
	}
}
