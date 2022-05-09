import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("N sayýsýný girin :");
		int n = scanner.nextInt();
		double toplam = 0.0;
		for (double i = 1 ; i<=n;i++) {
			toplam+=(1/i);
		}
		System.out.println(toplam);
	}

}
