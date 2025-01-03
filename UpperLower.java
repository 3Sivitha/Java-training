import java.util.*;
public class UpperLower
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char a= sc.next().charAt(0);
		if(a>='a'&&a<='z'){
		    System.out.println("Lower");
		    		}
		else if(a>='A'&&a<='Z'){
		    System.out.println("Upper");
		}
		else{
		    System.out.println("None");
		}
	}
}
