import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Armut ka� kilo ?");
		double armut = scanner.nextDouble();
		System.out.println("Elma ka� kilo ?");
		double elma = scanner.nextDouble();
		System.out.println("Domates ka� kilo ?");
		double domates=scanner.nextDouble();
		System.out.println("Muz ka� kilo ?");
		double muz= scanner.nextDouble();
		System.out.println("Patl�can ka� kilo ?");
		double patlican=scanner.nextDouble();
		double armutFiyat=armut*2.14;
		double elmaFiyat=elma*3.67;
		double domatesFiyat=domates*1.11;
		double muzFiyat=muz*0.95;
		double patlicanFiyat=patlican*5.00;
		double toplamFiyat=armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
		System.out.println("Toplam �cret : "+toplamFiyat);
	}

}
