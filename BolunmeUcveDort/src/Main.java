import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayý girin:");
		int sayi = scanner.nextInt();
		int toplam = 0;
		int bolen = 0;
		for (int i = 1 ; i <= sayi ; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				toplam += i ;
				bolen++;
			}
			
		}
		System.out.println("Ortalama : "+(toplam/bolen));
		
	}

}
