import java.util.Scanner;

public class DiceCup {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n1 = input.nextInt();
		int m2 = input.nextInt();
		
		int numb = Math.abs(n1 - m2) + 1;
		int numb2 = Math.min(n1, m2);
		
		for(int i = 1; i <= numb; i++) {
			System.out.println(i + numb2);
		}
	}

}
