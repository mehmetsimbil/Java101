import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ss� al�ncak say�y� girin:");
		int n = scanner.nextInt();
		System.out.println("Al�nmas�n� istedi�iniz kuvveti girin:");
		int m = scanner.nextInt();
		for(int i = 1 ; i<=m;i++) {
			toplam*=n;
		}
		System.out.println("Sonuc : "+toplam);
	}

}
