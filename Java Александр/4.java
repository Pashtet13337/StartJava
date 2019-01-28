import java.util.Scanner;
public class 4
{
	public static void main(String[] lol) {
		int N = new Scanner(System.in).nextInt();

        while(0 < N) {
            int balance = N % 10;
            
            if((balance / 2 == 1)&(balance % 2 == 0)) {
                System.out.println("True");
                return;
            }
            
            N = N / 10;
        }
        System.out.println("False");
	}
}