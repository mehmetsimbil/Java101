import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Armut kaç kilo ?");
		double armut = scanner.nextDouble();
		System.out.println("Elma kaç kilo ?");
		double elma = scanner.nextDouble();
		System.out.println("Domates kaç kilo ?");
		double domates=scanner.nextDouble();
		System.out.println("Muz kaç kilo ?");
		double muz= scanner.nextDouble();
		System.out.println("Patlýcan kaç kilo ?");
		double patlican=scanner.nextDouble();
		double armutFiyat=armut*2.14;
		double elmaFiyat=elma*3.67;
		double domatesFiyat=domates*1.11;
		double muzFiyat=muz*0.95;
		double patlicanFiyat=patlican*5.00;
		double toplamFiyat=armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
		System.out.println("Toplam ücret : "+toplamFiyat);
	}

}
