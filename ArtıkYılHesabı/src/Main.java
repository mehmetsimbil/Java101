import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Kontrol edilecek y�l� girin: ");
		Scanner scanner = new Scanner(System.in);
		int yil = scanner.nextInt();
		if (yil%400==0) {
			System.out.println("Bu bir art�k y�ld�r.");
		}
		else {
			if(yil%100==0) {
				System.out.println("Bu bir art�k y�l de�ildir.");
			}
			else if (yil%4==0) {
				System.out.println("Bu bir art�k y�ld�r.");
			}
			else {
				System.out.println("Bu bir art�k y�l de�ildir.");
			}
		}

	}

}
