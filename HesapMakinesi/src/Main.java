import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci Sayýyý girin :");
		double birinci= scanner.nextDouble();
		System.out.println("Ýkinci sayýyý girin :");
		double ikinci = scanner.nextDouble();
		
		String Islemler = "1-Toplama \n"
				+ "		   2-Çýkarma \n"
				+ "		   3-Bölme\n"
				+ "		   4-Çarpma \n";
				
		System.out.println("Bir iþlem seçiniz:");
		System.out.println(Islemler);
		int secim = scanner.nextInt();
		
		switch(secim) {
		case 1:
			double toplam = birinci+ikinci;
			System.out.println(toplam);
			break;
		case 2:
			double sonuc= birinci-ikinci;
			System.out.println(sonuc);
			break;
		case 3:
			double bölüm = birinci/ikinci;
			System.out.println(bölüm);
			break;
		case 4:
			double carpim = birinci*ikinci;
			System.out.println(carpim);
			break;
		}
	}

}
