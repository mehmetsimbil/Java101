import java.util.Scanner;

public class Main {

	static void asalSayi(int num) {
		int sayac=0;
		for ( int i = 2 ; i<num ; i++) {
			if(num%i==0) {
				sayac++;
			}		
		}
		if(sayac==0) {
			System.out.println(num + "asal say�d�r.");
		}
		else
			System.out.println(num + " asal sayi degildir..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner ( System.in);
		System.out.println("Asall��� kontrol edilecek say�y� girin :");
		int n=scan.nextInt();
		asalSayi(n);
	}

}
