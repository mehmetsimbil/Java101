import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n,r;
		//N elemanlý bir kümenin elemanlarý ile oluþturulacak r elemanlý farklý gruplarýn sayýsý n’in r’li kombinasyonu olarak adlandýrýlýr. N’in r’li kombinasyonu C(n,r) þeklinde gösterilir.
		System.out.println("Küme kaç elemanlý olacak?");
		n=scanner.nextInt();
		System.out.println("Kaç elemanlý farklý gruplar olacak?");
		r=scanner.nextInt();
		int kombinasyon;
		int toplam = 1;
		int eleman=1;
		int elemanGrup=1;
		for (int i = 1 ; i<= n; i++) {
			toplam*=i;
		}
		for(int j = 1 ; j<=r;j++) {
			eleman*=j;
		}
		for (int z = 1 ; z <= (n-r);z++) {
			elemanGrup*=z;
		}
		kombinasyon= (toplam/(eleman*elemanGrup));
		System.out.println(kombinasyon);
	}

}
