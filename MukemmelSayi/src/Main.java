import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int toplam = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Say� girin:");
		int sayi= scan.nextInt();
		for(int i = 1 ; i<sayi ; i++) {
			if(sayi%i==0) {
				toplam+=i;
				}
		}
		if(toplam==sayi) {
					System.out.println(sayi+" m�kemmel sayidir.");
				}
		else {
					System.out.println(sayi+" m�kemmel sayi de�ildir.");
				}
			}
		}
	


