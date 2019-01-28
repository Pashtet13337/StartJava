import java.util.Scanner;
public class 1
{
	public static void main(String[] lol) {
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		if((a > b)&(a > c)) System.out.println(a + " Большее число");
		else if((b > a)&(a > c)) System.out.println(b + " Большее число");
		else if((c > a)&(a > b)) System.out.println(c + " Большее число");
		if((a < b)&(a < c)) System.out.println(a + " Меньшее число");
		else if((b < a)&(b < c)) System.out.println(b + " Меньшее число");
		else if((c < a)&(c < b)) System.out.println(c + " Меньшее число");
	}
}
