import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci Say�y� girin :");
		double birinci= scanner.nextDouble();
		System.out.println("�kinci say�y� girin :");
		double ikinci = scanner.nextDouble();
		
		String Islemler = "1-Toplama \n"
				+ "		   2-��karma \n"
				+ "		   3-B�lme\n"
				+ "		   4-�arpma \n";
				
		System.out.println("Bir i�lem se�iniz:");
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
			double b�l�m = birinci/ikinci;
			System.out.println(b�l�m);
			break;
		case 4:
			double carpim = birinci*ikinci;
			System.out.println(carpim);
			break;
		}
	}

}
