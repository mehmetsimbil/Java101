import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double matematik,fizik,türkce,kimya,müzik;
		int toplam=0;
		double ortalama = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Matematik notunu girin:");
		matematik=scanner.nextDouble();
		if(matematik==0 && matematik ==100){
			toplam = toplam;
			
		}
		else {
			toplam += matematik;
			ortalama++;
		}
		System.out.print("Fizik notunu girin:");
		fizik = scanner.nextDouble();
		if(fizik == 0 && fizik ==100) {
			toplam =toplam;
		}
		else {
			toplam +=fizik;
			ortalama++;
		}
		System.out.print("Türkce notunu girin:");
		türkce= scanner.nextDouble();
		if(türkce == 0 && türkce ==100) {
			toplam = toplam;
		}
		else {
			toplam += türkce;
			ortalama++;
			
		}
		System.out.print("Kimya notunu girin:");
		kimya=scanner.nextDouble();
		if ( kimya == 0 && kimya == 100) {
			toplam = toplam;
		}
		else {
			toplam+=kimya;
			ortalama++;
		}
		System.out.print("Müzik notunu girin:");
		müzik=scanner.nextDouble();
		
		if(ortalama==0 && ortalama==100) {
			toplam = toplam;
		}
		
		else {
			toplam += müzik;
			ortalama++;
		}
		double sinifGecme = toplam/ortalama;
		if (sinifGecme>=55) {
			System.out.println("Sinif gecildi.");
		}
		else {
			System.out.println("Sinif tekrarý.");
		}
	}

}
