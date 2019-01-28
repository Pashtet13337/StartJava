import java.util.Scanner;
public class 8 {
    
	public static void main(String[] lol) {
		int a = new Scanner(System.in).nextInt();
        	int sum = 0;
        
        	while (a > 0) {
            		sum = sum + a % 10;
            		a = a / 10;
        	}
        	System.out.println(sum);
	}
}
