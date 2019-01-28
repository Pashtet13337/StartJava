import java.util.Scanner;
public class 3
{
	public static void main(String[] lol) {
	    
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		
		if(((a > b)&(a > c)&(b > c))) {
		    System.out.println(a + " " + b + " " + c);
		}
		if(((a > b)&(a > c)&(c > a))) {
		    System.out.println(a + " " + c + " " + b);
		}
		else if(((b > a)&(b > c)&(a > c))) {
		    System.out.println(b + " " + a + " " + c);
		}
		else if(((b > a)&(b > c)&(c > a))) {
		    System.out.println(b + " " + c + " " + a);
		}
		else if(((c > a)&(c > b)&(a > b))) {
		    System.out.println(c + " " + a + " " + b);
		}
		else if(((c > a)&(c > b)&(b > a))) {
		    System.out.println(c + " " + b + " " + a);
		}

	}
}
