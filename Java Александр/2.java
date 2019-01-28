import java.util.Scanner;
public class 2
{
	public static void main(String[] lol) {
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		if((b > a)&(c > a)) System.out.println(b + c);
		else if ((a > b)&(c > b)) System.out.println(a + c);
		else System.out.println(a + b);
	}
}
