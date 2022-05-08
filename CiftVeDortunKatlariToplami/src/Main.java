import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int n;
		do {
			System.out.println("Bir sayi girin:");
			n = scanner.nextInt();
			if(n%4==0) {
				toplam +=n;
			}
		}
			while(n%2==0 && n>0);
				System.out.println("Dörtün katlarý toplam : "+toplam);
			
		}
		
	}


