import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n,r;
		//N elemanl� bir k�menin elemanlar� ile olu�turulacak r elemanl� farkl� gruplar�n say�s� n�in r�li kombinasyonu olarak adland�r�l�r. N�in r�li kombinasyonu C(n,r) �eklinde g�sterilir.
		System.out.println("K�me ka� elemanl� olacak?");
		n=scanner.nextInt();
		System.out.println("Ka� elemanl� farkl� gruplar olacak?");
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
