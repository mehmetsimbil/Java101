import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kullaniciAdi,sifre;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kullanýcý adý :");
		kullaniciAdi = scanner.nextLine();
		System.out.println("Sifre:");
		sifre = scanner.nextLine();
		if(kullaniciAdi.equals("admin") && sifre.equals("admin")) {
			System.out.println("Giris Basarýlý");
		}
		else {
			System.out.println("Bilgileriniz yanlýþ.Yeni þifre girin.");
			String yeniSifre= scanner.nextLine();
			if(yeniSifre.equals("admin")) {
				System.out.println("Yeni þifre eskisiyle ayný olamaz.Tekrar Deneyin.");
				yeniSifre=scanner.nextLine();
			}
			else {
				System.out.println("Sifre basarýyla deðiþtirildi.");
				
			}
			}
			
		}
}
		
	


