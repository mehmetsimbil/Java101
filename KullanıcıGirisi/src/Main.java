import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kullaniciAdi,sifre;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kullan�c� ad� :");
		kullaniciAdi = scanner.nextLine();
		System.out.println("Sifre:");
		sifre = scanner.nextLine();
		if(kullaniciAdi.equals("admin") && sifre.equals("admin")) {
			System.out.println("Giris Basar�l�");
		}
		else {
			System.out.println("Bilgileriniz yanl��.Yeni �ifre girin.");
			String yeniSifre= scanner.nextLine();
			if(yeniSifre.equals("admin")) {
				System.out.println("Yeni �ifre eskisiyle ayn� olamaz.Tekrar Deneyin.");
				yeniSifre=scanner.nextLine();
			}
			else {
				System.out.println("Sifre basar�yla de�i�tirildi.");
				
			}
			}
			
		}
}
		
	


