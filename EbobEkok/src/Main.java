import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ýlk sayýyý girin.");
		int sayi1 = scan.nextInt();
		System.out.println("Ýkinci sayýyý girin.");
		int sayi2 = scan.nextInt();
		int ebob=1;
		int ekok=1;
		int i=1;
		int j=1;
		while(i<=sayi1 && i<sayi2) {
			if(sayi1%i ==0 && sayi2%i==0) {
				ebob=i;
			}
			i++;
		}
		System.out.println(ebob);
		while(j<=sayi1*sayi2) {
			if(j%sayi1==0 && j%sayi2==0) {
				ekok=j;
			}
			j++;
		}
		System.out.println(ekok);
		

	}

}
