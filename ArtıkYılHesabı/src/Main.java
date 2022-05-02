import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Kontrol edilecek yýlý girin: ");
		Scanner scanner = new Scanner(System.in);
		int yil = scanner.nextInt();
		if (yil%400==0) {
			System.out.println("Bu bir artýk yýldýr.");
		}
		else {
			if(yil%100==0) {
				System.out.println("Bu bir artýk yýl deðildir.");
			}
			else if (yil%4==0) {
				System.out.println("Bu bir artýk yýldýr.");
			}
			else {
				System.out.println("Bu bir artýk yýl deðildir.");
			}
		}

	}

}
