import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Basamaklarý toplamý alýncak sayýyý girin:");
		int x = scanner.nextInt();
		int toplam=0;
		while (x != 0) {
		toplam = (x%10)+toplam;
		x=x/10;
		}
		System.out.println(toplam);
	}

}
