import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double matematik,fizik,t�rkce,kimya,m�zik;
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
		System.out.print("T�rkce notunu girin:");
		t�rkce= scanner.nextDouble();
		if(t�rkce == 0 && t�rkce ==100) {
			toplam = toplam;
		}
		else {
			toplam += t�rkce;
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
		System.out.print("M�zik notunu girin:");
		m�zik=scanner.nextDouble();
		
		if(ortalama==0 && ortalama==100) {
			toplam = toplam;
		}
		
		else {
			toplam += m�zik;
			ortalama++;
		}
		double sinifGecme = toplam/ortalama;
		if (sinifGecme>=55) {
			System.out.println("Sinif gecildi.");
		}
		else {
			System.out.println("Sinif tekrar�.");
		}
	}

}
