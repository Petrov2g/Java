import java.util.Scanner;

public class TimeLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = " Abracadabra";
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i + a);
		}

	}

}
